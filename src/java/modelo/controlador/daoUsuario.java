package modelo.controlador;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.conexion.contexto;
import modelo.entidades.Cl_Listar_Jefe_funcionario;
import modelo.entidades.Cl_Usuario;

public class daoUsuario {

    private Connection cone;

    public boolean login(Cl_Usuario usu) throws SQLException {
        boolean existe = false;
        try {
            this.cone = new contexto().obtenerConexion();

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
        String rol = null;
        try {
            this.cone = new contexto().obtenerConexion();
            String call = "{call SP_OBTENER_NOMBRE_ROL(?,?)}";
            CallableStatement cstmt = cone.prepareCall(call);
            cstmt.setInt(1, usu.getRun());
            cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);
            cstmt.execute();
            if (cstmt.executeUpdate() > 0) {

                rol = cstmt.getString(2);
                return rol;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            cone.close();
        }
        return null;
    }

    public List<Cl_Listar_Jefe_funcionario> ListarJefeFuncionario() throws SQLException {

        
        List<Cl_Listar_Jefe_funcionario> lista = new ArrayList<Cl_Listar_Jefe_funcionario>();
        try {
            this.cone = new contexto().obtenerConexion();
            String call = "SELECT * FROM VIEW_LISTAR_JEFE_FUNCIONARIO";
            Statement statement = cone.createStatement();
            ResultSet result = statement.executeQuery(call);
         
            
            while (result.next()) 
            {
                Cl_Listar_Jefe_funcionario jefe = new Cl_Listar_Jefe_funcionario();
                
                jefe.setRut(result.getString(1));
                jefe.setNombreCompleto(result.getString(2));
                jefe.setSexo(result.getString(3));
               // jefe.setFechaNaacimiento(result.getD(4));
                jefe.setCorreo(result.getString(5));
                jefe.setEstado(result.getString(6));
                jefe.setPerfil(result.getString(7));
                jefe.setRol(result.getString(8));
                jefe.setPassword(result.getString(9));
                lista.add(jefe);
            }
            return lista;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            cone.close();
        }
        return null;

    }

}
