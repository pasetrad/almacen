/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author LEARNING CENTER
 */
public class Producto {
    private Integer codigo;
    private String nombreProducto;
    private Integer stock;
    private Integer precio;

    public Producto() {
    }

    public Producto(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Producto(String nombreProducto, Integer stock) {
        this.nombreProducto = nombreProducto;
        this.stock = stock;
    }

    public Producto(String nombreProducto, Integer stock, Integer precio) {
        this.nombreProducto = nombreProducto;
        this.stock = stock;
        this.precio = precio;
    }
    

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
    
            
}
