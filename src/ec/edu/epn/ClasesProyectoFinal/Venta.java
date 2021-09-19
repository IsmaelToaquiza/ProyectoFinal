
package ec.edu.epn.ClasesProyectoFinal;
import javax.swing.JOptionPane;

public class Venta {
    private double costoTotal;
    private int cantidad;
    private Producto producto;
    private String fecha;

    public Venta(String fecha, String id, String nombre, int stock, double costoUnidad, double costoTotal) {
        for (Producto p : Listas.getProductos()) {
            if (p.getId().equals(id)) {
                if (p.getStock()< stock) {
                    JOptionPane.showMessageDialog(null, "No hay stock para realizar esta venta");
                }else{
                p.setStock(p.getStock() - stock);
                }
                
                this.producto = new Producto(p.getId(), p.getNombre(), p.getStock(), p.getCostoUnidad(), p.getCostoTotal());
            }
            this.fecha = fecha;
            this.cantidad = stock;
            this.costoTotal = stock * costoUnidad;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
    
    
}
