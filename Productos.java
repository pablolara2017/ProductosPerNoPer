
package com.mycompany.entregagetset;


public class Productos {
    
    private String nombre;
    
    private double precio;
    
    //constructor
    
    public Productos(String nombre,double precio){
        
        this.nombre=nombre;
        
        this.precio=precio;
        
    }
    
    //getter setter
    
    public String getNombre(){
        
        return this.nombre;
        
    }
    
    public void setNombre(String nombre){
        
        this.nombre=nombre;
        
    }
    
    public double getPrecio(double precio){
        
        return this.precio;
        
    }
    
    public void setPrecio(double precio){
        
        this.precio=precio;
        
    }
    
    public double calcular(int cantidad){
        
        return cantidad*this.precio;
        
    }
    
}
