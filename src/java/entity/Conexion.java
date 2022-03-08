/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author labtw13
 */
public class Conexion {
      private Conection conection;
      private String url;
      private String user;
      private String pwd;

    public Conexion(Conection conection, String url, String user, String pwd) {
        this.conection = conection;
        this.url = url;
        this.user = user;
        this.pwd = pwd;
    }

    public Conection getConection() {
        return conection;
    }
      
      
      
      
}
