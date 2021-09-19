/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.epn.ClasesProyectoFinal;

import javax.swing.JTextField;

public class Compra {
    private int cantidad;
    private Producto producto;
    private String fecha;

    public Compra(String fecha, String id, String nombre, int stock, double costoUnidad, double costoTotal) {

        for (Producto p : Listas.getProductos()) {
            if (p.getId().equals(id)) {
                p.setStock(  p.getStock() + stock);
                this.producto = new Producto(p.getId(), p.getNombre(), p.getStock(), p.getCostoUnidad(), p.getCostoTotal());
            }
        }
        this.fecha = fecha;
        this.cantidad = stock;
    }

    public String getFecha() {
        return fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
