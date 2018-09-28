package modelo.entidades;

public class Cl_Curso {
    private int id;
    private String nombre;
    private String curso;
    private String institucion;

    public Cl_Curso(int id, String nombre, String curso, String institucion) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.institucion = institucion;
    }

    public Cl_Curso() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    @Override
    public String toString() {
        return "Cl_Curso{" + "id=" + id + ", nombre=" + nombre + ", curso=" + curso + ", institucion=" + institucion + '}';
    }
    
    
    
    
}
