
import java.util.Scanner;


public class ejercicio_9 {
     public static void main(String[] args) {
        // PEDIR 3 NUMEROS Y MOSTRARLOS ORDENADOS DE MAYOR A MENOR
        
        Scanner eg = new Scanner (System.in);
        System.out.println("INGRESA TU PRIMER NUMERO");
        int numero1 = eg.nextInt();
        System.out.println("INGRESA TU SEGUNDO NUMERO");
        int numero2 = eg.nextInt();
        System.out.println("INGRESA TU TERCER NUMERO");
        int numero3 = eg.nextInt();
        if (numero1 > numero3) {
                if (numero1 > numero2){
                if (numero1 > numero3){
                if (numero2> numero3){
                    System.out.println(numero1+ " " +numero2+ " " +numero3);    
                } else {
                    System.out.println(numero1+ " " +numero3+ " " +numero2);
                }
                } else {
                        System.out.println(numero3 + " " +numero1+ " " +numero2);
                        }
                        } else { 
                                if (numero2 > numero3){
                                    if (numero1>numero3) {
                                        System.out.println(numero2+ " " +numero1+ " " +numero3);
                                    } else {
                                        System.out.println(numero2+ " " +numero3+ " " +numero1);
                                    }
                                }else {
                                    System.out.println(numero3+ " " +numero2+ " " +numero1);
                                
                                }
                                }
                      
                        }
                        }
        }
