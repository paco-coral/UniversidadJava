
package project1;

public class Clase1 {
    
    public static void main(String[] args) {
        // Empezamos nuestro primer proyecto
        
        System.out.println("Clase 1");
//        Clase 1
        System.out.println("Hola Mundo desde Java");

//        Clase 2
        System.out.println("Clase 2");
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);

//        Clase 3
        System.out.println("Clase 3");
        //Modificamos el valor de la variable        
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        //Modificamos el valor de la variable Cadena
        miVariableCadena = "Saludos WebMaster";
        System.out.println(miVariableCadena);

//        Clase 4
//        var - inferencias de tipo en java
        System.out.println("Clase 4");
        var miVar1 = 2;
        System.out.println(miVar1);
        var miVar2 = 'A';
        System.out.println(miVar2);
        var miVar3 = "Hola ecuador es hora de triunfar";
        System.out.println(miVar3);
//      Valores permitidos en variablesen java
        var $var1 = 1;
        var _var2 = 2;
        var var2 = 3;
        System.out.println("La variable tres es = " + miVar3 + "La variable 2 es" + miVar1 + "Mi ultima Variable es " + var2);
        var union = miVar3 + " " + miVar2;
        System.out.println("union = " + union);

//      Clase 5
        var nombre = "Karla";
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comilla Simple: \'" + nombre + "\'");
        System.out.println("Comilla Doble: \"" + nombre + "\"");
 

    }
    
}
