/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cap4.proyectofinal;
import poo.cap4.proyectofinal.Compra;
/**
 *
 * @author AnitaGabriela
 */
public class Stock extends Registro{
    private String existencias;

    public Stock(String id, String nombre, int cantidad, double costoUnidad, double costoTotal, String existencias) {
        super(id, nombre, cantidad, costoUnidad, costoTotal);
        this.existencias = existencias;
    }
    
    public String verificarStock(int cantidadEntrada, int cantidadSalida){
        int cantidadMercancia=cantidadEntrada-cantidadSalida;
        if (cantidadMercancia < 0) {
            return this.existencias = "Se agotó el producto";
        } else {
            return this.existencias = "Aun cuentas con el producto "+
                    "\nLa cantidad de producto es:"+cantidadMercancia;
        }

    }
          
    
    
    
}
