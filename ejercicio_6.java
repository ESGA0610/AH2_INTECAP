
import java.util.Scanner;


public class ejercicio_6 {
    
        public static void main(String[] args) {
        // PROGRAMA QUE PIDA DOS NUMEROS Y NOS INDIQUE SI SON IGUALES O NO
        Scanner sp = new Scanner (System.in);
            System.out.println("INGRESA TU PRIMER NUMERO");
             int numero1 = sp.nextInt ();
        System.out.println("INGRESA TU SEGUNDO NUMERO");
        int numero2 = sp.nextInt ();
        
        if (numero1 == numero2) {
            System.out.println("NUMERO 1 Y NUMERO 2 SON IGUALES");
            
        }else  {
            System.out.println("NUMERO 1 Y NUMERO 2 NO SON IGUALES");
        }
}
    }
    
   
