
package modelo.controlador;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import modelo.conexion.contexto;
import modelo.entidades.Cl_Curso;
import modelo.entidades.Cl_Persona;
import oracle.jdbc.internal.OracleTypes;

public class daoWebService {
    
     private Connection cone;
     
         public Cl_Persona RecuperarPersona(String run) throws SQLException {

        Cl_Persona persona = new Cl_Persona();
        try {
            this.cone = new contexto().obtenerConexion();
            String call = "{call SP_RECUPERAR_PERSONA(?,?)}";
            CallableStatement cstmt = cone.prepareCall(call);
            cstmt.setString(1, run);
            cstmt.registerOutParameter(2,OracleTypes.CURSOR);
            cstmt.execute();
            ResultSet result = (ResultSet)cstmt.getObject(2);

            while (result.next()) {
                persona.setRun(result.getString(1));
                 persona.setDv(result.getString(2));
                persona.setNombre(result.getString(3));
                persona.setApellido(result.getString(4));
                persona.setSexo(result.getString(5));
                persona.setFechaNacimiento(result.getDate(6));
                persona.setCorreo(result.getString(7));
                persona.setTelefono(result.getString(8));
                
            }
            return persona;


        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            cone.close();
        }
        return null;

    }
         
            public List<Cl_Curso> ListarCursos (String run) throws SQLException {

                Cl_Curso curso = new Cl_Curso();
                List<Cl_Curso> listado = new ArrayList<Cl_Curso>();
        try {
            this.cone = new contexto().obtenerConexion();
            String call = "{call SP_LISTAR_CURSOS(?,?)}";
            CallableStatement cstmt = cone.prepareCall(call);
            cstmt.setString(1, run);
            cstmt.registerOutParameter(2,OracleTypes.CURSOR);
            cstmt.executeUpdate();
            ResultSet result = (ResultSet)cstmt.getObject(2);

            while (result.next()) {
                curso.setNombre(result.getString(1));
                 curso.setSiglas(result.getString(2));
                curso.setInstitucion(result.getString(3));
                listado.add(curso);
            }
            return listado;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            cone.close();
        }
        return null;

    }
     
    
}
