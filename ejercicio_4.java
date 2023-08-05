
import java.util.Scanner;


public class ejercicio_4 {
    
     public static void main(String[] args) {
        // PROGRAMA QUE LEA UNA CANTIDAD DE GRADOS CENTIGRADOS Y LA PASE A GRADOS FAHRENHEIT. LA FORMULA ES : F = 32 + (9*C/5)
        
        Scanner eg = new Scanner (System.in);
        System.out.println("INGRESE LA TEMPERATURA");
        System.out.println("LA TEMPERATURA EN FAH ES: " +(32+(9*(eg.nextInt()/5))));
        
    }
    
}
    

