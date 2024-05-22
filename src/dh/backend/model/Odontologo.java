package dh.backend.model;

public class Odontologo {
    private Integer id;
    private String apellido;
    private String nombre;
    private String numeroDeMatricula;

    public Odontologo(Integer id, String apellido, String nombre, String numeroDeMatricula) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public Odontologo(String apellido, String nombre, String numeroDeMatricula) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(String numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    @Override
    public String toString() {
        return "Odontologo" +
                "id=" + id +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", numeroDeMatricula='" + numeroDeMatricula;
    }
}
