/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import modelo.ModeloAgregar;
import vista.Producto;

/**
 *
 * @author LEARNING CENTER
 */
public class ControladorAgregar {
    public boolean agregarProducto(Producto producto) throws SQLException{
        ModeloAgregar modeloAgregar=new ModeloAgregar();
        boolean respuesta = modeloAgregar.agregarProducto(producto);
	return respuesta;
    }
}
