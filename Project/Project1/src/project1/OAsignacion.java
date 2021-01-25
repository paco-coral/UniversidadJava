package project1;

import java.util.Scanner;

public class OAsignacion {
    
    public static void main(String[] args){
        Scanner consola = new Scanner(System.in);
        int a = 3, b = 2;
        int c = a + 5 - b; 
        System.out.println("c = " + c);
        
        a += 3; // a = a + 1;
        System.out.println("a += " + a);               
        a -= 2; // a = a - 2;
        System.out.println("a -= " + a);
        a *= 2; // a = a * 2;
        System.out.println("a *= " + a);
        a /= 2; // a = a / 1;
        System.out.println("a /= " + a);
        a %= 2; // a = a % 2;
        System.out.println("a %= " + a);
             
    }       
    
}
