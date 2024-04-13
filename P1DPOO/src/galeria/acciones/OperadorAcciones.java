package galeria.acciones;

import galeria.usuarios.Operador;
import galeria.sesion.ManejoSesion;

public class OperadorAcciones extends EmpleadoAcciones {
    public static void manageOperations() {
        if (ManejoSesion.getCurrentEmployee() instanceof Operador) {
            System.out.println("Gestionando operaciones...");
            // Implementar la lógica para gestionar operaciones diarias o eventos
        } else {
            System.out.println("Acceso denegado. Solo los operadores pueden gestionar operaciones.");
        }
    }
}
