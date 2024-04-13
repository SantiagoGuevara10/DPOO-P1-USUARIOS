package galeria.acciones;
import galeria.sesion.ManejoSesion;
import galeria.usuarios.Administrador;
public class AdministradorAcciones extends EmpleadoAcciones {
    public static void manageUsers() {
        if (ManejoSesion.getCurrentEmployee() instanceof Administrador) {
            System.out.println("Administrando usuarios...");
            // Implementar la lógica para la administración de usuarios
            // Esto podría incluir agregar, eliminar o modificar usuarios
        } else {
            System.out.println("Acceso denegado. Solo los administradores pueden gestionar usuarios.");
        }
    }

    // Otras acciones que solo un administrador puede realizar
}
