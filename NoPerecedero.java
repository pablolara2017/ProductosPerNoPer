
package com.mycompany.entregagetset;


public class NoPerecedero extends Productos{
    
    String tipo;
    
    public NoPerecedero(String nombre, double precio, String tipo) {
        
        super(nombre, precio);
        
        this.tipo=tipo;
        
    }
    
    //getter setter
    
    public String getTipo(){
        
        return this.tipo=tipo;
        
    }
    
    public void setTipo(String tipo){
        
        this.tipo=tipo;
        
    }
    
    
    public double calcular(int cant){
        
        return super.calcular(cant);  //sobreescribimos el metodo
        
    }
    
}
