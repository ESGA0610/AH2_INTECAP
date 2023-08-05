
import java.util.Scanner;

public class ejercicio_3 {
    
        
    public static void main(String[] args) {
        // PROGRAMA JAVA QUE LEA UN NUMERO ENTERO POR TECLADO, OBTIENE Y MUESTRA POR PANTALLA EL DOBLE Y EL TRIPLE DE ESE NUMERO
        
        Scanner eg = new Scanner (System.in);
        System.out.println("ESCRIBE UN NUMERO");
        int numero;
        numero = eg.nextInt();
        
        System.out.println("EL VALOR MULTIPLICADO 2 VECES ES  " +(numero*numero));
        System.out.println("EL VALOR MULTIPLICADO 3 VECES ES  " +(numero*numero*numero));
        
    }

}


