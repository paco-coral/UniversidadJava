package project1;

import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        int a = 23, b = 4;
        var resutado = a + b;
        System.out.println("La Suma es = " + resutado);
        resutado = a - b;
        System.out.println("La Resta es = " + resutado);
        resutado = a * b;
        System.out.println("La Multiplicacion es = " + resutado);
        float resutado2 = a / b;
        System.out.println("La Division es = " + resutado2);
        resutado = a % b;
        System.out.println("El Modulo  es = " + resutado);
        
        if (a % 2 ==0) {
            System.out.println("La variable a es par");            
        } else{
            System.out.println("La variable a es inpar");
        }       
    }
}
