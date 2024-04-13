package galeria.usuarios;

public abstract class Empleado {
    // Atributos existentes
    protected String idEmpleado;
    protected String nombre;

    // Añadir nuevos atributos
    protected String username; // Nombre de usuario para login
    protected String passwordHash; // Hash de la contraseña para seguridad

    // Constructor
    public Empleado(String idEmpleado, String nombre, String username, String passwordHash) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.username = username;
        this.passwordHash = passwordHash;
    }

    // Getters para los atributos existentes
    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    // Setters para los atributos existentes
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getters para los nuevos atributos
    public String getUsername() {
        return username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    // Setters para los nuevos atributos
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
    public abstract void realizarAccionesEspecificas();
    
    public void realizarTareaGeneral() {
        System.out.println(this.nombre + " está realizando una tarea general.");
    }
}
