/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.util.Scanner;

/**
 *
 * @author PC-COL8
 */
public class orden {//
    
     public static void main(String[] args) {   
         
      int id=1;
      
      Scanner Orden = new Scanner (System.in);
      System.out.println("Ingrese numero de id de la computadora que desea comprar: \n");
      int idComputadora = Orden.nextInt();   
      System.out.println("Ingrese el precio de la computadora que desea comprar: \n");
      int precio = Orden.nextInt();
      
      System.out.println("Facturacion: \n"); 
      System.out.println("Id Orden: " +id);  
      System.out.println("Id computadora: "+idComputadora); 
      System.out.println("Precio: "+precio); 
      
    }
   
    
     
   
}         

