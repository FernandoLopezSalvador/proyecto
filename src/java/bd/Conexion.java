/* 
*    Autor:Pérez Hernández Jazziel.
*    Fecha creación: 08 de marzo del 2022.
*    Fecha actualización: 08 de marzo del 2022.
*    Descripción: Creacion de la clase conexion.
*/
package bd;

import java.sql.*;

public class Conexion {
    private Connection connection;
    private String url="jdbc:postgresql://localhost/";
    private String user="postgres";
    private String pwd="perez24";

    public Conexion() {
    }
    
    public void conectar(){
       try{
           Class.forName("org.postgresql.Driver");
           connection = DriverManager.getConnection(url,user,pwd);
           System.out.println("conexión establecida"); 
       }catch(Exception ex){
           System.out.println("Error al conectar:"+ ex.getMessage());
       }
    }

    public void desconectar(){
        try {
            connection.close();
            System.out.println("Conexion cerrada");
        } catch (Exception e) {
            System.out.println("No existe conexion");
        }
        
    }
    
    public Connection getConnection() {
        return connection;
    }
    
    public static void main(String[] args) {
        Conexion c1 = new Conexion();
        c1.conectar();
        c1.desconectar();
    }
}
