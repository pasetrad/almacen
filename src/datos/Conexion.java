/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LEARNING CENTER
 */
public class Conexion {
    Conexion() {
    }
    private static Connection conectar=null;
    public static Connection getConnection(){
        try{
            if (conectar==null){
             String driver="oracle.jdbc.driver.OracleDriver";
             String url= "jdbc:oracle:thin:@localhost:1521:xe";
             String user="system";
             String pass="lcgroup";
             Class.forName(driver);
             conectar= DriverManager.getConnection(url, user, pass);
             System.out.println("Se conectó correctamente a la base de datos.");
             }
        }
            catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
            return conectar;  
        }
}
