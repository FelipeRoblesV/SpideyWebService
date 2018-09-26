package modelo.entidades;

public class Cl_Usuario {
    
    
    private int run;
    private String pass;
    private int rol;

    public Cl_Usuario() {
    }

    public Cl_Usuario(int run, String pass, int rol) {
        this.run = run;
        this.pass = pass;
        this.rol = rol;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Cl_Usuario{" + "run=" + run + ", pass=" + pass + ", rol=" + rol + '}';
    }
}
