package co.edu.uniquindio.biblioteca.model;

public class Empleado {
    private String nombre;
    private String id;
    private String email;
    private String cargo;
    private String salario;

    public Empleado(String nombre, String id, String email, String cargo, String salario){
        this.nombre = nombre;
        this.id = id;
        this.email = email;
        this.cargo = cargo;
        this.salario= salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }


}
