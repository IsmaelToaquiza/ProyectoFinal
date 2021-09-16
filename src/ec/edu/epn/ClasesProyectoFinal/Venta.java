
package ec.edu.epn.ClasesProyectoFinal;


public class Venta extends Registro{
    double ingresoTotal;

    public Venta(String id, String nombre, int cantidad, double costoUnidad, double costoTotal) {
        super(id, nombre, cantidad, costoUnidad, costoTotal);
        this.ingresoTotal=ingresoTotal;
    }
    
    
    public double movimientoSalida(int cantidad,double costoUnidad){
        return this.ingresoTotal=cantidad*costoUnidad;
    }     
}
