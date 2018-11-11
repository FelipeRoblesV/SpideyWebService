package modelo.ws;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.controlador.daoWebService;
import modelo.entidades.Cl_Curso;
import modelo.entidades.Cl_Persona;


@WebService(serviceName = "MainWS")
public class MainWS {

 @WebMethod(operationName = "Listar_Curso")
    public List<Cl_Curso> ListarCurso(@WebParam(name = "p_run") String run) {
        daoWebService dao = new daoWebService();
        List<Cl_Curso> lista = new ArrayList<Cl_Curso>();
        try {
            lista = dao.ListarCursos(run);
            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(MainWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
     @WebMethod(operationName = "Recuperar_Persona")
    public Cl_Persona RecuperarPersona(@WebParam(name = "p_run") String run) {
        daoWebService dao = new daoWebService();
        Cl_Persona persona = new Cl_Persona();
        try {
            persona = dao.RecuperarPersona(run);
            return persona;

        } catch (SQLException ex) {
            Logger.getLogger(MainWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
