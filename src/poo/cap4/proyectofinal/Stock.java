/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.cap4.proyectofinal;

/**
 *
 * @author AnitaGabriela
 */
public class Stock extends Registro{
    private String existencias;

    public Stock(String id, String nombre, int cantidad, double costoUnidad, double costoTotal) {
        super(id, nombre, cantidad, costoUnidad, costoTotal);
        this.existencias = existencias;
    }
    
    
    
    
}
