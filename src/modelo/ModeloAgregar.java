/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import vista.Producto;

/**
 *
 * @author LEARNING CENTER
 */
public class ModeloAgregar {
    
    public boolean agregarProducto (Producto producto) throws SQLException{
        ModeloBuscar modBuscar= new ModeloBuscar();
        ArrayList<Producto> lista = modBuscar.buscarProducto(producto.getCodigo());
        if (lista.isEmpty()){
            String consulta2 = "INSERT INTO PRODUCTO (NOMBRE_PRODUCTO, STOCK, PRECIO) VALUES ('(?)',(?), (?))";
            PreparedStatement preparedStatement2 = acceso.prepareStatement(consulta2);
            preparedStatement2.setString(1, producto.getNombreProducto());
            preparedStatement2.setInt(2, producto.getStock());
            preparedStatement2.setInt(2, producto.getPrecio());
            preparedStatement2.execute();
        }
        boolean flag = false;
        System.out.println("Insertar registro...");
        Statement acceso;
        if (respuesta==true){
            flag = respuesta;
        } else if (respuesta==false){
	    flag = respuesta;          
	    
        } 
        return flag;
    }   
}
