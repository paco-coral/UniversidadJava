package project2;
import java.util.Scanner;
public class Project2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese un Numero del 0 al 10");
        var num = consola.nextInt();
        var nota = " ";
        switch (num) {
            case 9: case 10:
                nota = "A";
                break;
            case 8:
                nota = "B";
                break;
            case 7:
                nota = "C";
                break;
            case 6:
                nota = "D";
                break;
            case 0: case 1: case 2: case 3: case 4: case 5:
                nota = "F";
                break;
            default:
                nota = "Valor Desconocido";
        }
        System.out.println("nota = " + nota);        
    }    
}
