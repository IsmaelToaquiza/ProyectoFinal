
package ec.edu.epn.ClasesProyectoFinal;
import ec.edu.epn.ClasesProyectoFinal.*;

public class Venta extends Producto{
    
    private String fecha;

    public Venta(String fecha, String id, String nombre, int stock, double costoUnidad, double costoTotal) {
        super(id, nombre, stock, costoUnidad, costoTotal);
        this.fecha = fecha;
    }

}
