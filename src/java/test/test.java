package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import modelo.controlador.daoWebService;
import modelo.entidades.Cl_Persona;

public class test {

    public static void main(String[] args) throws Exception {
        String rut = "19362296";
        List<Cl_Persona> lista = new ArrayList<Cl_Persona>();

        daoWebService dao = new daoWebService();
        lista= dao.ListarPersona(rut);
        Cl_Persona persona;
        Iterator iter = lista.iterator();
        while (iter.hasNext()) {
            persona = (Cl_Persona) iter.next();
            System.out.println(persona.toString());

        }

      //  System.out.println(persona.getRut());
   //     System.out.println(persona.getNombre());

    }

}
