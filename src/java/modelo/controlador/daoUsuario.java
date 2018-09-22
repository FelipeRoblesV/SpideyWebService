package modelo.controlador;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import modelo.conexion.contexto;
import modelo.entidades.Cl_Usuario;

public class daoUsuario {

    private Connection cone;

    public boolean login(Cl_Usuario usu) throws SQLException {
        boolean existe = false;
        try {
            this.cone = new contexto().obtenerConexion();
            int resultado = 0;

            String call = "{call SP_LOGIN(?,?)}";
            CallableStatement cstmt = cone.prepareCall(call);
            cstmt.setInt(1, usu.getRun());
            cstmt.setString(2, usu.getPass());
            cstmt.execute();
            if (cstmt.executeUpdate() > 0) {
                existe = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            cone.close();
        }
        return existe;
    }

    public int recuperarRol_login(Cl_Usuario usu) throws SQLException {
        int rol = 0;
        try {
            this.cone = new contexto().obtenerConexion();
            String call = "{call SP_OBTENER_ROL(?,?)}";
            CallableStatement cstmt = cone.prepareCall(call);
            cstmt.setInt(1, usu.getRun());
            cstmt.registerOutParameter(2, java.sql.Types.INTEGER);
            cstmt.execute();
            if (cstmt.executeUpdate() > 0) {

                rol = cstmt.getInt(2);
                return rol;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            cone.close();
        }
        return 0;
    }
    
     public String recuperarNombre_rol(Cl_Usuario usu) throws SQLException {
        String nombre = null;
        try {
            this.cone = new contexto().obtenerConexion();
            String call = "{call SP_OBTENER_NOMBRE_ROL(?,?)}";
            CallableStatement cstmt = cone.prepareCall(call);
            cstmt.setInt(1, usu.getRol());
            cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);
            cstmt.execute();
            if (cstmt.executeUpdate() > 0) {
                nombre = cstmt.getString(2);
                return nombre;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            cone.close();
        }
        return null;

    }
}
