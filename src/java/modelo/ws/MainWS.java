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
import modelo.entidades.Cl_Persona;


@WebService(serviceName = "MainWS")
public class MainWS {

 @WebMethod(operationName = "Listar_Persona")
    public List<Cl_Persona> Listar_Persona(@WebParam(name = "rut") String rut) {
        daoWebService dao = new daoWebService();
        List<Cl_Persona> lista = new ArrayList<Cl_Persona>();
        try {
            lista = dao.ListarPersona(rut);
            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(MainWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
