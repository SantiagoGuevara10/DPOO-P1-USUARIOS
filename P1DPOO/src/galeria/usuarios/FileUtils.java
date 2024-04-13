package galeria.usuarios;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileUtils {
    private static final String USER_DATA_FILE = "userdata.txt";

    // HashMap para almacenar el nombre de usuario y sus datos (contraseña y rol)
    private static Map<String, String> userCredentials = new HashMap<>();

    // Registrar un nuevo usuario
    public static void registerUser(String username, String password, String role) throws IOException {
        String userData = password + "," + role; // Guardamos contraseña y rol separados por comas
        userCredentials.put(username, userData);
        saveUserCredentials(); // Guarda los datos en el archivo
    }

    // Guardar las credenciales de los usuarios en el archivo
    private static void saveUserCredentials() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_DATA_FILE))) {
            for (Map.Entry<String, String> entry : userCredentials.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue());
                writer.newLine();
            }
        }
    }

    // Cargar las credenciales de usuario desde el archivo
    public static void loadUserCredentials() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_DATA_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) { // Aseguramos que tenemos usuario, contraseña y rol
                    String username = parts[0];
                    String userData = parts[1] + "," + parts[2];
                    userCredentials.put(username, userData);
                }
            }
        }
    }

    // Verificar las credenciales del usuario
    public static boolean verifyUser(String username, String password) {
        if (userCredentials.containsKey(username)) {
            String[] details = userCredentials.get(username).split(",");
            return details[0].equals(password); // Comparamos la contraseña
        }
        return false;
    }

    // Verificar si un usuario tiene permiso para realizar una operación
    public static boolean isUserAuthorized(String username, String operation) {
        if (userCredentials.containsKey(username)) {
            String[] details = userCredentials.get(username).split(",");
            String role = details[1];
            // Aquí definirías la lógica de autorización basada en el rol
            return checkAuthorization(role, operation);
        }
        return false;
    }

    private static boolean checkAuthorization(String role, String operation) {
        // Aquí va la lógica para decidir si un rol puede ejecutar una operación
        // Ejemplo sencillo:
        switch (role) {
            case "administrador":
                return true; // Los administradores pueden hacer cualquier cosa
            case "cajero":
                return operation.equals("processPayment");
            case "operador":
                return operation.equals("registerBid");
            default:
                return false;
        }
    }
}
