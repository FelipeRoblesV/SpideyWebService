
package modelo.entidades;

import java.util.Date;

public class Cl_Persona {
    
    private String rut;
    private String nombre;
    private String apellido;
    private String sexo;
    private Date fechaNacimiento;
    private String correo;
    private String telefono;

    public Cl_Persona() {
    }

    public Cl_Persona(String rut, String nombre, String apellido, String sexo, Date fechaNacimiento, String correo, String telefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cl_Persona{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + ", correo=" + correo + ", telefono=" + telefono + '}';
    }

}
