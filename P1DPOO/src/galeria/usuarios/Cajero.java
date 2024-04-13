package galeria.usuarios;

public class Cajero extends Empleado {
    public Cajero(String idEmpleado, String nombre, String username, String passwordHash) {
        super(idEmpleado, nombre, username, passwordHash);
    }

    @Override
    public void realizarAccionesEspecificas() {
        System.out.println(this.nombre + " está procesando pagos y gestionando transacciones financieras.");
        // Lógica para procesar pagos y gestionar transacciones
        procesarTransacciones();
    }

    private void procesarTransacciones() {
        System.out.println("Procesamiento de pagos y emisión de facturas en curso.");
        // Más detalles de implementación para manejar pagos y facturación
    }
}
