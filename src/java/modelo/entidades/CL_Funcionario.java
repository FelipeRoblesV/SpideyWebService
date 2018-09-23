
package modelo.entidades;

import java.util.Date;


public class CL_Funcionario {
   private int run;
   private int dv;
   private String nombre;
   private String apellido;
   private Date fecha_nacimiento;
   private String correo;
   private int telefono;
   private boolean estado;
   private Cl_Usuario user;
   private Cl_perfil perfil;
   private CL_Funcionario run_jefe;

    public CL_Funcionario() {
    }

    public CL_Funcionario(int run, int dv, String nombre, String apellido, Date fecha_nacimiento, String correo, int telefono, boolean estado, Cl_Usuario user, Cl_perfil perfil, CL_Funcionario run_jefe) {
        this.run = run;
        this.dv = dv;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
        this.user = new Cl_Usuario();
        this.perfil = new Cl_perfil();
        this.run_jefe = new CL_Funcionario();
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getDv() {
        return dv;
    }

    public void setDv(int dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Cl_Usuario getUser() {
        return user;
    }

    public void setUser(Cl_Usuario user) {
        this.user = user;
    }

    public Cl_perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Cl_perfil perfil) {
        this.perfil = perfil;
    }

    public CL_Funcionario getRun_jefe() {
        return run_jefe;
    }

    public void setRun_jefe(CL_Funcionario run_jefe) {
        this.run_jefe = run_jefe;
    }

    @Override
    public String toString() {
        return "CL_Funcionario{" + "run=" + run + ", dv=" + dv + ", nombre=" + nombre + ", apellido=" + apellido + ", fecha_nacimiento=" + fecha_nacimiento + ", correo=" + correo + ", telefono=" + telefono + ", estado=" + estado + ", user=" + user + ", perfil=" + perfil + ", run_jefe=" + run_jefe + '}';
    }
   
   
   
   
    
}
