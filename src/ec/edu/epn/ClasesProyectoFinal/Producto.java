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
public class Producto {
    
    //declaracion de variables
    protected String id;
    protected String nombre;
    protected double costoUnidad;
    protected double costoTotal;
    protected int stock;
    protected String existencias;
    
    public Producto(String id, String nombre, int stock,double costoUnidad , double costoTotal) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.costoUnidad = costoUnidad;
        this.costoTotal = costoTotal;
    }
    
    public Producto(String id, String nombre,int stock) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
    }    
    
    public Producto(String id, String nombre,int stock,double costoUnidad) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.costoUnidad = costoUnidad;
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
    
    public double getCostoUnidad() {
        return costoUnidad;
    }

    public void setCostoUnidad(double costoUnidad) {
        this.costoUnidad = costoUnidad;
    }

    public double getCostoTotal() {
        return costoTotal= this.stock*this.costoUnidad;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getExistencias() {
        return existencias;
    }

    public void setExistencias(String existencias) {
        this.existencias = existencias;
    }


    
    
    
}
