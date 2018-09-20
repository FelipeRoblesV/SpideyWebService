/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.ws;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.controlador.daoUsuario;
import modelo.entidades.Cl_Usuario;

/**
 *
 * @author Felip
 */
@WebService(serviceName = "MainWS")
public class MainWS {
        @WebMethod(operationName = "Login_admin")
    public Boolean Login_admin(@WebParam(name = "user") Cl_Usuario user) {

        boolean respuesta = false;
        daoUsuario dao = new daoUsuario();
        try {
            respuesta = dao.login(user);

        } catch (SQLException ex) {
            Logger.getLogger(MainWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
    
}
