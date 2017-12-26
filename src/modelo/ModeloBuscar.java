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
    
    public ArrayList<Producto> buscarProducto (Producto producto) throws SQLException{
        
        String sql = "SELECT CODIGO FROM PRODUCTO WHERE NOMBRE_PRODUCTO = '(?)' AND "
                + "PRECIO = (?)";
        
        PreparedStatement consulta = Conexion.getConnection().prepareStatement(sql);
        consulta.setString(1, producto.getNombreProducto());
        consulta.setInt(2, producto.getPrecio());
        ResultSet rs = consulta.executeQuery();
        ArrayList<Producto> listProducto = new ArrayList<Producto>();
        while(rs.next()){
            producto.setCodigo(rs.getInt("CODIGO"));
            listProducto.add(producto);
              
        }
        return listProducto;
    }
    
    public ArrayList<Producto> buscarProducto (Integer codigo) throws SQLException{
        Producto producto = new Producto();
        String sql = "SELECT (CODIGO, NOMBRE_PRODUCTO, PRECIO, STOCK)) FROM PRODUCTO WHERE CODIGO = (?)";
        PreparedStatement consulta1 = Conexion.getConnection().prepareStatement(sql);
        consulta1.setInt(1, producto.getCodigo());
        ResultSet rs = consulta1.executeQuery();
        ArrayList<Producto> listProducto = new ArrayList<Producto>();
        while(rs.next()){
            producto.setCodigo(rs.getInt("CODIGO"));
            listProducto.add(producto);
              
        }
        return listProducto;
    }
}
