package modelo.entidades;

import java.util.Date;


public class Cl_Listar_Jefe_funcionario {

    private String rut;
    private String nombreCompleto;
    private String Sexo;
    private Date fechaNaacimiento;
    private String correo;
    private int telefono;
    private String estado;
    private String perfil;
    private String rol;
    private String password;

    public Cl_Listar_Jefe_funcionario() {
    }

    public Cl_Listar_Jefe_funcionario(String rut, String nombreCompleto, String Sexo, Date fechaNaacimiento, String correo, int telefono, String estado, String perfil, String rol, String password) {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.Sexo = Sexo;
        this.fechaNaacimiento = fechaNaacimiento;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
        this.perfil = perfil;
        this.rol = rol;
        this.password = password;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public Date getFechaNaacimiento() {
        return fechaNaacimiento;
    }

    public void setFechaNaacimiento(Date fechaNaacimiento) {
        this.fechaNaacimiento = fechaNaacimiento;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Cl_Listar_Jefe_funcionario{" + "rut=" + rut + ", nombreCompleto=" + nombreCompleto + ", Sexo=" + Sexo + ", fechaNaacimiento=" + fechaNaacimiento + ", correo=" + correo + ", telefono=" + telefono + ", estado=" + estado + ", perfil=" + perfil + ", rol=" + rol + ", password=" + password + '}';
    }

}
