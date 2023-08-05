
import java.util.Scanner;


public class ejercicio_8 {
    
        
    public static void main(String[] args) {
        // PEDIR DOS NUMEROS Y MOSTRARLOS ORDENADOS DE MAYOR A MENOR
        
        Scanner sp = new Scanner (System.in);
        System.out.println("INGRESA TU PRIMER NUMERO");
        int numero1 = sp.nextInt();
        System.out.println("INGRESA TU SEGUNDO NUMERO");
        int numero2 = sp.nextInt();
        
        if (numero1 == numero2){
             System.out.println("SON IGUALES");
        } else if (numero1 > numero2){ 
        System.out.println(numero1  + "     " + numero2);
        
    } else {
            System.out.println(numero2 + "    " +numero1);
            
            }
    
        
    }
    
}


