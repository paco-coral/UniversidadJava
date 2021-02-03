package clases;

//Aplicamos herencia para usar los metodos y atributos de la clase padre (extends)
public class ClaseHija_Consulta extends ClasePadre_Abstracta{
    
    //Override nos permite sobre escribir nuestros metodos abtractos
    @Override
    public void Transacciones(){
        System.out.println("--------------------------------");
        System.out.println("Tu Saldo Actual es: "+ getSaldo());
        System.out.println("--------------------------------");
    }
    
}
