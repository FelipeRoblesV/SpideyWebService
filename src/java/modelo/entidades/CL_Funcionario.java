package modelo.entidades;

import com.sun.org.apache.xerces.internal.impl.dv.xs.YearMonthDV;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.time.YearMonth;
import java.util.Date;

public class CL_Funcionario {

//  Atributos principales
    private int run;
    private int dv;
    private String nombre;
    private String apellido;
    private char sexo;
    private Date fecha_nacimiento;
    private String correo;
    private int telefono;
    private boolean estado;

//   Clases Foraneas
    private int user;
    private int perfil;
    private int run_jefe;

    public CL_Funcionario() {

    }

    public CL_Funcionario(int run, int dv, String nombre, String apellido, char sexo, Date fecha_nacimiento, String correo, int telefono, boolean estado, int user, int perfil, int run_jefe) {
        this.run = run;
        this.dv = dv;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
        this.user = user;
        this.perfil = perfil;
        this.run_jefe = run_jefe;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) throws Exception {

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

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public int getRun_jefe() {
        return run_jefe;
    }

    public void setRun_jefe(int run_jefe) {
        this.run_jefe = run_jefe;
    }

    public String Rut() throws Exception {
        try {
            String run = Integer.toString(this.run);
            String dv = Integer.toString(this.dv);

            String rut = (run + '-' + dv);

            return rut;

        } catch (Exception ex) {
            throw new Exception("Rut no se pudo transformar correctamente.");
        }
    }

    public String NombreCompleto() throws Exception {
        try {
            String nombre = this.nombre;
            String apellido = this.apellido;
            String NombreCompleto = (nombre + apellido);

            return NombreCompleto;

        } catch (Exception ex) {
            throw new Exception("Nombre no se pudo transformar correctamente.");
        }
    }

    public String NombreSexo() throws Exception {
        try {
            String NombreSexo;
            if (this.sexo == '1') {
                NombreSexo = "Masculino";
                return NombreSexo;
            } else if (this.sexo == '0') {
                NombreSexo = "Femenino";
                return NombreSexo;
            }
            return NombreSexo = "";

        } catch (Exception ex) {
            throw new Exception("Sexo no se pudo transformar correctamente.");
        }

    }

    public boolean validarRut() throws Exception {

        boolean validacion = false;
        try {
            String run = Integer.toString(this.run);
            run.toUpperCase();
            String digito = Integer.toString(this.dv);
            digito.toUpperCase();
            String rut = (run + digito);
            rut = rut.toUpperCase();

            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException ex) {
        } catch (Exception ex) {
            throw new Exception("Rut no se pudo valido correctamente.");
        }
        return validacion;
    }

}
