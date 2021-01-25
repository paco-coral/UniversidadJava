package project1;
import java.util.Scanner;
public class OIgualdad {   
    public static void main(String[] args) {        
        Scanner consola = new Scanner(System.in);
        
        //Operadores de Igualdad 
        var a = 3;
        var b = 2;
        var c = a == b;
        System.out.println("c = " + c);
        var d = a != b;
        System.out.println("d = " + d);
        
        //Operadores de Igualdad en Cadenas (String) 
        var cadena1 = "hola";
        var cadena2 = "hola";
        var e = cadena1 == cadena2; //Compara referencias de objetos
        System.out.println("e = " + e);
        var f = cadena1.equals(cadena2); //Comparamos el contenido de cadenas
        System.out.println("f = " + f);
        
        a = 10;
        b = 7;
        // Operadores Relacionales
        var g = a >= b; //Mayor Que o Mayor Igual
        System.out.println("g = " + g);
        
        //Ejercicios
        if (a % 2 == 0) {
            System.out.println("Es numero Par");            
        } else  {
            System.out.println("Es nuemro inpar");
        }
        
        var edad = 15;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Ya es Adulto");
        } else {
            System.out.println("Es Menor de Edad");
        }
        
    }   
}
