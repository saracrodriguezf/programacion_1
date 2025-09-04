package co.edu.uniquindio.biblioteca.model;

public class Cliente {
    private String nombre;
    private String apellidos;
    private int edad;
    private String documento;
    private String telefono;

    public Cliente(String nombre, String apellidos, int edad, String documento, String telefono){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.documento = documento;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
