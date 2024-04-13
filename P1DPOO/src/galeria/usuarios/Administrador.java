package galeria.usuarios;

public class Administrador extends Empleado {
    public Administrador(String idEmpleado, String nombre, String username, String passwordHash) {
        super(idEmpleado, nombre, username, passwordHash);
    }

    @Override
    public void realizarAccionesEspecificas() {
        System.out.println(this.nombre + " está administrando el sistema, ajustando configuraciones y gestionando el personal.");
        // Lógica para gestionar el sistema y los usuarios
        gestionarSistema();
    }

    private void gestionarSistema() {
        System.out.println("Actualizando configuraciones del sistema y gestionando derechos de acceso de usuarios.");
        // Aquí se incluirían las operaciones de administración del sistema
    }
}
