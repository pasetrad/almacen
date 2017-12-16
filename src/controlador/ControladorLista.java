/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import datos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ModeloListar;
import vista.Producto;

/**
 *
 * @author LEARNING CENTER
 */
public class ControladorLista {
ModeloListar listaProducto;
    public ArrayList <Producto> getListadoProducto() throws SQLException{
        listaProducto = new ModeloListar();
        return listaProducto.getListadoProducto(); 
    }
    
    
    
}
