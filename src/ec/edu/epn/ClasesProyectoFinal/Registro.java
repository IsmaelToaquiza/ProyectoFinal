/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.epn.ClasesProyectoFinal;

/**
 *
 * @author Ismael
 */
public class Registro {
    
    //declaracion de variables
    protected String id;
    protected String nombre;
    protected int cantidad;
    protected double costoUnidad;
    protected double costoTotal;

    public Registro(String id, String nombre, int cantidad, double costoUnidad, double costoTotal) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.costoUnidad = costoUnidad;
        this.costoTotal = costoTotal;
    }
    public Registro(String id, String nombre,int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCostoUnidad() {
        return costoUnidad;
    }

    public void setCostoUnidad(double costoUnidad) {
        this.costoUnidad = costoUnidad;
    }

    public double getCostoTotal() {
        return costoTotal= this.cantidad*this.costoUnidad;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public String toString() {
        return this.id+this.nombre+this.cantidad; //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
