package ejemplosmapas;

public class Persona {

    private String nombre;
    private String apellidos;
    private String direccion;
    private long telefono;

    Persona() {
    }

    Persona(String nombre, String apellidos, String direccion, long telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {

        return this.nombre + "   " + this.apellidos + "   " + this.direccion + "   " + this.telefono;

    }
}
