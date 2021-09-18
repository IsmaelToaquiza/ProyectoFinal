/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.epn.ClasesProyectoFinal;

import javax.swing.JTextField;

public class Compra extends Producto{
    
    private String fecha;
    
    public Compra(String fecha,String id, String nombre, int stock, double costoUnidad, double costoTotal) {
        super(id, nombre, stock, costoUnidad, costoTotal);
        this.fecha = fecha;
    }
    
        
  
}
