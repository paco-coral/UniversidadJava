package project1;
import java.util.Scanner;
public class EjeOperadores {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");        
        var valor1 = consola.nextInt();
        System.out.println("Ingrese el segundo valor");
        var valor2 = consola.nextInt();
        System.out.println("El numero mayor es:");
        System.out.println(valor1 > valor2 ? valor1 : valor2);                  
    }    
}
