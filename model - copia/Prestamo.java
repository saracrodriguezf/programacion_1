package co.edu.uniquindio.biblioteca.model;

public class Prestamo {
    private String nombre;
    private String fechaPrestamo;
    private String fechaEntrega;

    public Prestamo(String idNombre, String idFechaPrestamo, String idFechaEntrega) {
        this.nombre = idNombre;
        this.fechaPrestamo = idFechaPrestamo;
        this.fechaEntrega = idFechaEntrega;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}

