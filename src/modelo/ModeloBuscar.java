/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import datos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import vista.Producto;

/**
 *
 * @author LEARNING CENTER
 */
public class ModeloBuscar {
    
    public ArrayList<Producto> buscarProducto (Integer codigo) throws SQLException{
        String sql = "SELECT CODIGO FROM PRODUCTO";
        PreparedStatement consulta = Conexion.getConnection().prepareStatement(sql);
        ResultSet rs = consulta.executeQuery();
        ArrayList<Producto> listProducto = new ArrayList<Producto>();
        while(rs.next()){
            Producto producto = new Producto();
            producto.setCodigo(rs.getInt("CODIGO"));
            listProducto.add(producto);
              
        }
        return listProducto;
    }
}
