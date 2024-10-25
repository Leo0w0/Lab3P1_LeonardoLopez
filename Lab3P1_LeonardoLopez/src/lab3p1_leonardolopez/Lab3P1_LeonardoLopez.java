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
       char continuar;
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
                
                System.out.print("Desea realizar otra operacion? (s/n): ");
                continuar = leer.next().charAt(0);
                    if (continuar == 'n' || continuar == 'N') {
                        opcion = 0;
                    } else {
                        System.out.print("Escoja: ");
                        opcion = leer.nextInt();

                }
               }
            case 2:{
                int opcionJ1 = -1;
                int opcionJ2 = -1;
                while (opcionJ1 < 0 || opcionJ1 > 2) {
                    System.out.println("0. Piedra");
                    System.out.println("1. Papel");
                    System.out.println("2. Tijera");
                    System.out.print("Ingrese su opcion (j1): ");
                    opcionJ1 = leer.nextInt();
                    if (opcionJ1 < 0 || opcionJ1 > 2) {
                        System.out.println("Opcion incorrecta. Intente de nuevo.");
                    }
                }

                while (opcionJ2 < 0 || opcionJ2 > 2) {
                    System.out.println("0. Piedra");
                    System.out.println("1. Papel");
                    System.out.println("2. Tijera");
                    System.out.print("Ingrese su opcion (j2): ");
                    opcionJ2 = leer.nextInt();
                        if (opcionJ2 < 0 || opcionJ2 > 2) {
                            System.out.println("Opcion incorrecta. Intente de nuevo.");
                        }
                }

      
                if (opcionJ1 == opcionJ2) {
                    System.out.println("Empate.");
                } else if ((opcionJ1 == 0 && opcionJ2 == 2) || (opcionJ1 == 1 && opcionJ2 == 0) || (opcionJ1 == 2 && opcionJ2 == 1)) {
                    System.out.println("Jugador 1 gana.");
                } else {
                    System.out.println("Jugador 2 gana.");
                }

                System.out.print("Desea realizar otra operacion? (s/n): ");
                continuar = leer.next().charAt(0);
                    if (continuar == 'n' || continuar == 'N') {
                    opcion = 0;
                    } else {
                        System.out.print("Escoja: ");
                        opcion = leer.nextInt();
            }     
            }       
            case 3:{
               int base;

                    System.out.print("Introduce un número entero mayor o igual a 6: ");
                    base = leer.nextInt();

                    while (base < 6) {
                        System.out.print("Número inválido. Introduce un número entero mayor o igual a 6: ");
                        base = leer.nextInt();
                    }

                    int altura = base - 1;
                    boolean derecha = true;

                    for (int i = 0; i < altura; i++) {
                        for (int j = 0; j < base; j++) {
                            if (i % 2 == 0) {
                                System.out.print("*");
                            } else {
                                if (derecha && j == base - 1) {
                                    System.out.print("*");
                                } else if (!derecha && j == 0) {
                                    System.out.print("*");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                        }
                        System.out.println();
                        if (i % 2 != 0) {
                            base -= 2; // Eliminar un punto de ambos lados
                            derecha = !derecha;
                        }
                    }

                    // Preguntar al usuario si desea realizar otra operación
                    System.out.print("¿Desea realizar otra operación? (s/n): ");
                    continuar = leer.next().charAt(0);
                    if (continuar == 'n' || continuar == 'N') {
                        opcion = 0;
                    } else {
                        System.out.print("Escoja: ");
                        opcion = leer.nextInt();
                    }
                    break;
            }    
            }
       
        }
    System.out.println("Saliendo del menu principal");
    }
}
