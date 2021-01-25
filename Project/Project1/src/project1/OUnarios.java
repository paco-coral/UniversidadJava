package project1;

import java.util.Scanner;

public class OUnarios {
    
    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);        
        
        var a = 3;
        var b = -a; //Cambianos de Signo
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true;
        var d = !c; // Se usa para negar un valor boolean
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
    //Incremento
        System.out.println("Incremento");
        // 1. Preincremento (Simbolo antes de la vairable)
        System.out.println(" - Preincremento ++a");
        var e = 3;        
        //System.out.println("e = " + e);
        //++e;                       
        System.out.println("e = " + e);        
        var f = ++e; // Primero se incrementa en su variable y despues se usa su valor   
        System.out.println("f = " + f);
        
        System.out.println(" - Postincremento a++");
        //2. Postincremento (Simbolo despues de la variable)
        var g = 5;
        //System.out.println("g = " + g);
        //g++;
        System.out.println("g = " + g); // Teniamos pendiente un incremento
        var h = g++; //primero se utiliza el valor de la variable y despues se incrementa
        System.out.println("h = " + h); 
        
        System.out.println("Decremento");
        System.out.println(" - Predecremento");
        var i = 3;
        var j = --i;
        System.out.println("i = " + i); // Ya esta decrementado
        System.out.println("j = " + j);
        
        System.out.println(" - Postdecremento");
        var k = 6;
        var l = k--; // primero se usa el valor de la variable y queda pendiente el decremento
        System.out.println("k = " + k); // Tenia pendiente un decremento 
        System.out.println("l = " + l);
        
        
        
        
            
        
        
    }    
}
