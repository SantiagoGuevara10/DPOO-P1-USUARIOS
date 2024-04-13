package galeria.acciones;

import galeria.usuarios.Empleado;
import galeria.sesion.ManejoSesion;

public class EmpleadoAcciones {
    // Método general que puede ser extendido o usado por todos los empleados
    public static void performGeneralTask() {
        Empleado currentEmployee = ManejoSesion.getCurrentEmployee();
        if (currentEmployee != null) {
            System.out.println("Empleado " + currentEmployee.getNombre() + " está realizando una tarea general.");
        } else {
            System.out.println("No hay empleado logueado para realizar la tarea.");
        }
    }
}
