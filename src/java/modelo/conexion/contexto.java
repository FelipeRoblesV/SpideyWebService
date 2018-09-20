package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class contexto {

    private static Connection conexion;

    private String usuario = "frobles2";
    private String pass = "frobl1234";
    private String host = "159.89.86.128";
    private String port = "4921";
    private String sid = "xe";

    private String url = "jdbc:oracle:thin:" + usuario + "/" + pass + "@" + host + ":" + port + ":" + sid;

    public contexto() {
        try {
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            this.conexion = DriverManager.getConnection(url, usuario, pass);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public Connection obtenerConexion() {
        return conexion;
    }

}
