
package modelo.controlador;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import modelo.conexion.contexto;
import modelo.entidades.Cl_Persona;
import oracle.jdbc.internal.OracleTypes;

public class daoWebService {
    
     private Connection cone;
     
         public List<Cl_Persona> ListarPersona(String rut) throws SQLException {

        List<Cl_Persona> lista = new ArrayList<Cl_Persona>();
        try {
            this.cone = new contexto().obtenerConexion();
            String call = "{call SP_LISTAR_PERSONA(?,?)}";
            CallableStatement cstmt = cone.prepareCall(call);
            cstmt.setString(1, rut);
            cstmt.registerOutParameter(2,OracleTypes.CURSOR);
            cstmt.executeUpdate();
            ResultSet result = (ResultSet)cstmt.getObject(2);

            while (result.next()) {
                Cl_Persona persona = new Cl_Persona();
                persona.setRut(result.getString(1));
                persona.setNombre(result.getString(2));
                persona.setApellido(result.getString(3));
                persona.setSexo(result.getString(4));
                persona.setFechaNacimiento(result.getDate(5));
                persona.setCorreo(result.getString(6));
                persona.setTelefono(result.getString(7));
                lista.add(persona);
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
