/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.epn.ClasesProyectoFinal;

import java.util.ArrayList;
import ec.edu.epn.ClasesProyectoFinal.*;

/**
 *
 * @author Ismael
 */
public class Listas {
    static ArrayList<Compra> compras = new ArrayList<>();
    static ArrayList<Venta> ventas = new ArrayList<>();
    static ArrayList<Producto> productos = new ArrayList<>();

    public static ArrayList<Compra> getCompras() {
        return compras;
    }

    public static ArrayList<Venta> getVentas() {
        return ventas;
    }

    public static ArrayList<Producto> getProductos() {
        return productos;
    }
    
}
