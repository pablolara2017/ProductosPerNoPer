
package com.mycompany.entregagetset;


public class Perecedero extends Productos{
    
    private int diasCad;
    
    //constructor

    public Perecedero(String nombre, double precio,int diasCad) {
        
        super(nombre, precio);  //llama al constructor de la calse padre
        
        this.diasCad=diasCad;
        
    }
    
    //getter setter
    
    public int getDiasCad(){
        
        return this.diasCad;
        
    }
    
    public void setDiasCad(int diasCad){
        
        this.diasCad=diasCad;
        
    }
    
    public double calcular(int cant){
        
        double precioFinal=super.calcular(cant); //sobrescribe el metodo de la calse padre 
        
        if(this.diasCad==1){
            
            precioFinal/=4;
            
        }else if(this.diasCad==2){
            
            precioFinal/=3;
            
        }else if(this.diasCad==3){
            
            precioFinal/=2;
            
        }
        
        return precioFinal;
        
    }
    

   
    
    
    
    
    
}
