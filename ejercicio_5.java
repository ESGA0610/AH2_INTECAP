
import java.util.Scanner;


public class ejercicio_5 {
    
       public static void main(String[] args) {
        //PROGRAMA QUE LEE POR TECLADO EL VALOR DEL RADIO DE UNA CIRCUNFERENCIA, CALCULA Y MUESTRA POR PANTALLA LA LONGITUD, AREA DE LA CIRCUNFERENCIA
        //LONGITUD DE LA CIRCUNFERENCIA = 2*PI*RADIO
        //AREA DE LA CIRCUNFERENCIA = PI*RADIO^2
        
        Scanner es = new Scanner (System.in);
        System.out.println("INGRESE EL RADIO");
        int radio = es.nextInt();
        int longitud = (int) (2*Math.PI*radio);
        int area = (int) (Math.PI * (radio * radio)) ;
        System.out.println("LA LONGITUD ES: "+longitud);
        System.out.println("EL AREA ES: "+area);
        
        
        
        
        
    }
    
}

