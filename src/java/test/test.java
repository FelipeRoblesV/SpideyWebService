package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import modelo.controlador.daoWebService;
import modelo.entidades.Cl_Curso;
import modelo.entidades.Cl_Persona;

public class test {

    public static void main(String[] args) throws Exception {
        String rut = "19362296";
        Cl_Persona per = new Cl_Persona();
       daoWebService dao = new daoWebService();
          per = dao.RecuperarPersona(rut);
         System.out.println(per.getNombre() + ' ' + per.getApellido());


      //  System.out.println(persona.getRut());
   //     System.out.println(persona.getNombre());

       //  System.out.println(persona.getRut());
   //     System.out.println(persona.getNombre());
    //  System.out.println(persona.getRut());
   //     System.out.println(persona.getNombre());
    //  System.out.println(persona.getRut());
   //     System.out.println(persona.getNombre());
    //  System.out.println(persona.getRut());
   //     System.out.println(persona.getNombre());
    //  System.out.println(persona.getRut());
   //     System.out.println(persona.getNombre());
    //  System.out.println(persona.getRut());
   //     System.out.println(persona.getNombre());

   
   
   
   
   
    }

}
