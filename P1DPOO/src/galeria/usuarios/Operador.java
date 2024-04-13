package galeria.usuarios;

public class Operador extends Empleado {
    public Operador(String idEmpleado, String nombre, String username, String passwordHash) {
        super(idEmpleado, nombre, username, passwordHash);
    }

    @Override
    public void realizarAccionesEspecificas() {
        System.out.println(this.nombre + " está coordinando eventos y supervisando las operaciones diarias de la galería.");
        // Lógica para gestionar eventos y operaciones diarias
        coordinarEventos();
    }

    private void coordinarEventos() {
        System.out.println("Organizando nuevos eventos y supervisando la programación de exposiciones.");
        // Implementación de la coordinación de eventos y la gestión de la logística
    }
}
