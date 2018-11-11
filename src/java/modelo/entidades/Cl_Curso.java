package modelo.entidades;

public class Cl_Curso {
    private int id;
    private String nombre;
    private String Siglas;
    private String institucion;

    public Cl_Curso(int id, String nombre, String Siglas, String institucion) {
        this.id = id;
        this.nombre = nombre;
        this.Siglas = Siglas;
        this.institucion = institucion;
    }

    public String getSiglas() {
        return Siglas;
    }

    public void setSiglas(String Siglas) {
        this.Siglas = Siglas;
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


    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

}
