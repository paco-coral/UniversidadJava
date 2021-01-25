package ejercicioschardo;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Bienvenido a Software Gonzalito");
        System.out.println("");
        System.out.println("Primer Triangulo");        
        for (int i = 0; i <= 10; i++) {            
            for (int j = 0; j < i; j++) {                                
                System.out.print("*");                
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Segundo Triangulo");
        System.out.println("");
        for (int x = 0; x <= 10; x++) {            
            for (int y = 10; y > x; y--) {                                
                System.out.print("*");                
            }
            System.out.println("");
        }
        
        
        
        System.out.println("");
       // System.out.println("Tercer Triangulo");
        System.out.println("");
        for (int i = 0; i <= 10; i++) {            
            for (int j = 0; j <= i; j++) {                                                   
                for (int k = 10; k == i; k--) {
                    System.out.print("*");   
                }
                System.out.print("-");
            }
            System.out.println("");
        }
        

    
    
    
    }
}
