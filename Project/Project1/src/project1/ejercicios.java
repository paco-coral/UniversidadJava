package project1;

import java.util.Scanner;

public class ejercicios {
    
     public static void main(String[] args){         
        Scanner consola = new Scanner(System.in);        
        System.out.println("Ingrese el Alto:");
        var alto = consola.nextInt();
        System.out.println("Ingrese el Ancho:");
        var ancho = consola.nextInt();
        var area = alto * ancho;
        System.out.println("area = " + area);
        var perimetro =(alto + ancho) * 2;
        System.out.println("perimetro = " + perimetro);
    }   
    
}
