

package com.mycompany.entregagetset;

import java.util.*;


public class EntregaGetSet {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduce el total de productos perecederos: ");
        
        int cantPer=sc.nextInt();
        
        Perecedero[]perecederos=new Perecedero[cantPer];
        
        for(int i=0;i<cantPer;i++){  //agregamos productos perecederos
            
            System.out.println("Nombre: ");
            
            String nombre=sc.next();
            
            System.out.println("Precio: ");
            
            double precio=sc.nextDouble();
            
            System.out.println("Cuantos dias faltan para caducar?");
            
            int dias=sc.nextInt();
            
            perecederos[i]=new Perecedero(nombre,precio,dias);
            
        }
        
        System.out.println("Introduce total de productos no perecederos");
        
        int cantNoP=sc.nextInt();
        
        NoPerecedero[]noPerecederos=new NoPerecedero[cantNoP];
        
        for(int i=0;i<cantNoP;i++){  //agregamos productos perecederos
            
            System.out.println("Nombre: ");
            
            String nombre=sc.next();
            
            System.out.println("Precio: ");
            
            double precio=sc.nextDouble();
            
            System.out.println("Tipo de producto");
            
            String tipo=sc.next();
            
            noPerecederos[i]=new NoPerecedero(nombre,precio,tipo);
            
        }
        
        System.out.println("PRODUCTOS PERECEDEROS");
        
        for(int i=0;i<cantPer;i++){  //info de productos perecederos
            
            System.out.println("Introduce cantidad del productos : " + perecederos[i].getNombre());
            
            int cant=sc.nextInt();
            
            System.out.println("Producto: " + perecederos[i].getNombre() + 
                    "\nDias para caducar: " + perecederos[i].getDiasCad() + 
                    "\nPrecio final: " + perecederos[i].calcular(cant));
            
        }
        
        System.out.println("PRODUCTOS NO PERECEDEROS");
        
        for(int i=0;i<cantNoP;i++){  //info de productos perecederos
            
            System.out.println("Introduce cantidad del productos : " + noPerecederos[i].getNombre());
            
            int cant=sc.nextInt();
            
            System.out.println("Producto: " + noPerecederos[i].getNombre() + 
                    "\nTipo: " + noPerecederos[i].getTipo() + 
                    "\nPrecio final: " + noPerecederos[i].calcular(cant));
            
        }
        
    }
}
