package modelo.ws;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.controlador.daoUsuario;
import modelo.entidades.Cl_Usuario;

@WebService(serviceName = "MainWS")
public class MainWS {

    @WebMethod(operationName = "Login_Administrador")
    public Boolean Login_Administrador(@WebParam(name = "user") Cl_Usuario user) {
        boolean respuesta = false;
        daoUsuario dao = new daoUsuario();
        try {
            respuesta = dao.login(user);

        } catch (SQLException ex) {
            Logger.getLogger(MainWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    @WebMethod(operationName = "recuperar_rol_login")
    public int recuperar_rol_login(@WebParam(name = "user") Cl_Usuario user) {
        int respuesta = 0;
        daoUsuario dao = new daoUsuario();
        try {
            respuesta = dao.recuperarRol_login(user);

        } catch (SQLException ex) {
            Logger.getLogger(MainWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
    
      @WebMethod(operationName = "recuperar_nombre_rol")
    public String recuperar_nombre_rol(@WebParam(name = "user") Cl_Usuario user) {
        String respuesta = null;
        daoUsuario dao = new daoUsuario();
        try {
            respuesta = dao.recuperarNombre_rol(user);

        } catch (SQLException ex) {
            Logger.getLogger(MainWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
}
