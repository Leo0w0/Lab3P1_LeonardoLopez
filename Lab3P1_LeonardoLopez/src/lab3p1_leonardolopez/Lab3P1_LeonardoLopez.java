/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_leonardolopez;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Lab3P1_LeonardoLopez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int opcion = 0;
           System.out.println("-----Menu-----");
           System.out.println("0. Salir");
           System.out.println("1. Division sin '/'");
           System.out.println("2. Piedra, papel, o tijeras");
           System.out.println("3. Zigzag");
           System.out.print("Escoja: ");
           opcion = leer.nextInt();
       while (opcion != 0){
           
           
           while (opcion < 0 || opcion >= 4){
            System.out.print(" ingrese la opcion correcta: ");
            opcion= leer.nextInt();
           } 
            
           switch (opcion){
               case 1:{
                   int dividendo = 0;
                    int divisor = 0;

        
                while (dividendo <= 1) {
                    System.out.print("Ingrese un numero dividendo mayor a 1: ");
                    dividendo = leer.nextInt();
                if (dividendo <= 1) {
                    System.out.println("Número invalido. Intente de nuevo.");
                }
            }

                while (divisor <= 1) {
                    System.out.print("Ingrese un numero divisor mayor a 1: ");
                    divisor = leer.nextInt();
                if (divisor <= 1) {
                    System.out.println("Número invalido. Intente de nuevo.");
                }
                }

    
                int cociente = 0;
                int residuo = dividendo;

                while (residuo >= divisor) {
                    residuo -= divisor;
                    cociente++;
                }

                System.out.println("El resultado de la division es: " + cociente);
                System.out.println("El residuo es: " + residuo);
           }
            case 2:{
         
                   
                    
                     
            }
           
       }
       
    }
    
    }
}
