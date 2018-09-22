package test;

import java.io.Console;
import modelo.entidades.Cl_Usuario;
import modelo.ws.MainWS;

public class test {

    public static void main(String[] args) 
    {
        MainWS ws = new MainWS();
        Cl_Usuario usu = new Cl_Usuario();
        usu.setRun(19362296);
        usu.setPass("admin");
        Boolean respuesta = ws.Login_Administrador(usu);
        System.out.println(respuesta);
        

    }
    
}
