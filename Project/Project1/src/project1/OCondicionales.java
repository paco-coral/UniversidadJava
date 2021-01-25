package project1;


public class OCondicionales {
    public static void main(String[] args) {
        
        //Operadores Condicionales && (And)
        var a = 5;
        var vMinimo = 0;
        var vMaximo = 10;
        var resultado = a >= vMinimo && a <= vMaximo;
        System.out.println("resultado = " + resultado);
        if (resultado) {
            System.out.println("Dentro de Rango");            
        } else {
            System.out.println("Fuera de Rango");
        }        
        
        //Operadores Condicionales || (or)
        var vacaciones = false;
        var diaDescanso = true;
        if (vacaciones || diaDescanso) {
            System.out.println("Puede Asistir al juego del hijo");            
        } else {
            System.out.println("El padre esta ocupado");
        }
        
        
    }
    
}
