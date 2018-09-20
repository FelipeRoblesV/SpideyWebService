
package modelo.controlador;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import modelo.conexion.contexto;
import modelo.entidades.Cl_Usuario;

public class daoUsuario {
    
        private Connection cone;

    public boolean login(Cl_Usuario user) throws SQLException {
        boolean existe = false;
        try {
            this.cone = new contexto().obtenerConexion();

            String call = "{call sp_login(?,?,?)}";
            CallableStatement cstmt = cone.prepareCall(call);
            cstmt.setInt(1, user.getRun());
            cstmt.setString(2, user.getPass());
            cstmt.setInt(3, user.getRol());

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
    
}
