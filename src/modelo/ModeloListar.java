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
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.Producto;

/**
 *
 * @author LEARNING CENTER
 */
public class ModeloListar {
    
    public ArrayList<Producto> getListadoProducto() throws SQLException{
        ArrayList<Producto> listProducto = null;
        String sql="SELECT NOMBRE_PRODUCTO FROM PRODUCTO";
        PreparedStatement preparedStatement;
        try {
            listProducto=new ArrayList<>();
            preparedStatement = Conexion.getConnection().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            Producto curso = new Producto();
            curso.setNombreProducto(resultSet.getString("NOMBRE_PRODUCTO"));
            listProducto.add(curso);
        }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloListar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listProducto;
    }
}
