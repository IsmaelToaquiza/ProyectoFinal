/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.epn.ClasesProyectoFinal;
import ec.edu.epn.ClasesProyectoFinal.Compra;
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
    
    public Stock(String id, String nombre, int cantidad, String existencias) {
        super(id, nombre, cantidad);
        this.existencias = existencias;
    }
    
    
    public String verificarStock(int cantidadEntrada, int cantidadSalida){
        int cantidadMercancia=cantidadEntrada-cantidadSalida;
        if (cantidadMercancia < 0) {
            return this.existencias = "Se agotó el producto";
        } else {
            return this.existencias = "Aun cuentas con el producto ";
        }

    }

    public String getExistencias() {
        return existencias;
    }

    public void setExistencias(String existencias) {
        this.existencias = existencias;
    }

    @Override
    public String toString() {
        return super.toString()+this.existencias; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
