package project1;

public class SentenciaSwitch {
    
    public static void main(String[] args) {
        
        int mes = 5;
        String estacion = "Estacion invalida";
        
        switch (mes) {
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Invierno";
                break;
            case 6: case 7: case 8:
                estacion = "Invierno";
                break;
            case 9: case 10: case 11:
                estacion = "Invierno";
                break;                            
        }
        System.out.println("estacion = " + estacion);

    }
    
}
