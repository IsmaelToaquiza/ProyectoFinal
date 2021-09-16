/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.epn.ClasesProyectoFinal;

public class Compra extends Registro{
    
    public double egresoTotal;
    
    public Compra(String id, String nombre, int cantidad, double costoUnidad, double costoTotal) {
        super(id, nombre, cantidad, costoUnidad, costoTotal);
        
    }
   
    public double movimientoEntrada(int cantidad, double costoUnidad){
        return this.egresoTotal= cantidad*costoUnidad;
    }
    
}
