package project1;

import java.util.Scanner;

public class Clase2 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
//        Clase 6        
        /*
        System.out.println("Clase 6");
        System.out.println("Proporciona el Titulo:");
        String titulo = consola.nextLine();
        System.out.println("Proporciona el Autor:");
        String autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
        */
//        Clase 8        
//        Tipos de variables con var
        /*
        System.out.println("Clase 8");
        //Ejecutar el codigo paso a paso desde esta ubicacion 
        var numeroEntero = 10;
        var numeroDouble = 10.0;
        var numeroFloat = 10.0F;
        
        var caracter = 'A';
        var caracterUnicode = '\u0025';
        var caracterDecimal = (char) 35;
        System.out.println("caracter = " + caracter);
        System.out.println("caracterUnicode = " + caracterUnicode);
        System.out.println("caracterDecimal = " + caracterDecimal);
        
        boolean varV = true;
        boolean varF = false;        
        var variableVerdadera = true;
        var variableFalsa = false;
                
        
        var oracion = "Hola Ecuador Presente";
        
        do {
            System.out.println("El programa se ejecuta");
            System.out.println("Desea parar el programa ingrese 1");
            int varprogam = consola.nextInt();
            if (varprogam == 1) {
                variableVerdadera = false;
            }
        } while (variableVerdadera);
        */
        
//        Clase 10
//        Conversion de tipos primitivos en java
        /*
        var edad = Integer.parseInt("20");        
        System.out.println("edad = " + (edad + 1));        
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        System.out.println("Ingrese un Valor Numerico");
        var variable = consola.nextLine();
        int variableNueva = 0;
        
        System.out.println("El Valor en string " + (variable + 20));
        variableNueva = Integer.parseInt(variable);
        System.out.println("El valor en int es " + (variableNueva + 20));
        
        
//      Otra Forma de convertir de String a int
        var variableF = 0;
        System.out.println("Ingrese un Valor:");
        variableF = Integer.parseInt( consola.nextLine() );
        System.out.println("El valor en int es " + (variableF + 30));
        */
        
        //convertimos de tipo entero a tipo String
        var edadTexto = String.valueOf(18);
        System.out.println("edadTexto = " + edadTexto);
        //Caracter a Recuperar de una cadena de texto        
        var caracter = "Hola".charAt(3);
        System.out.println("caracter = " + caracter);
        //Guardamos el primer caracter de la cadena 
        System.out.println("Proporciona un Caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("Caractes es:" + caracter);
        
    }

}
