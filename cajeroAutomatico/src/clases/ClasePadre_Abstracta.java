package clases;

import java.util.Scanner;

//En esta clase van las funciones principales
public abstract class ClasePadre_Abstracta {

    //Vamos a heredad atributos es necesario utilizar un encapsulamiento de tipo protected
    protected int transaciones, retiro, deposito;
    //Oculta las variables que no queremos compartir con otras clases
    private static int saldo;
    Scanner consola = new Scanner(System.in);

    //Creamos el primer metodo
    public void Operaciones() {
        //Base de datos
        int [][] baseDatos = new int[3][5]; 
        baseDatos[0][0] = 12345;
        baseDatos[1][0] = 54321;
        baseDatos[2][0] = 1000;
        int bandera = 0, banderaCuenta = 0, seleccion = 0;        
        int cuenta = 12345, nip = 54321;      
        
        
        //Controlamos el Ingreso del Usuario/NIP Correcto
        do {
            System.out.print("Ingrese Numero de cuenta: ");
            int vCuenta = consola.nextInt();
            System.out.print("Ingrese Numero de NIP: ");
            int vNip = consola.nextInt();
            if (vCuenta == cuenta && vNip == nip) {
                banderaCuenta = 1;                                
            } else {
                System.out.println("----------------------------------------------");
                System.out.println("Usuario o NIP Incorrecto Ingrese Nuevamente: ");                                
                System.out.println("----------------------------------------------");                
            }            
        } while (banderaCuenta == 0);
        System.out.println("Bienvenido a Banco Gonzalito");        
        do {
            //Validamos que nuestro usuario no ingrese otros valores            
            do {                
                System.out.println("Por favor selecione una opción : ");
                System.out.println("    1 . Consultar Saldo");
                System.out.println("    2 . Retirar efectivo");
                System.out.println("    3 . Depositar fondos");
                System.out.println("    4 . Salir de Cuenta");
                seleccion = consola.nextInt();
                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Opción no disponible, vuelva a intentar porfavor.");
                    System.out.println("---------------------------------------------------");
                }
            } while (bandera == 0);
            //Verificamos cada una de las opciones
            if (seleccion == 1) {
                //Instancias de Consulta de Saldos
                ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
                mensajero.Transacciones();
            }else if (seleccion == 2) {
                //Instancia de Retiro                
                ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
                mensajero.Transacciones();
            }else if (seleccion == 3) {
                //Instancia de Deposito
                ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
                mensajero.Transacciones();
            }else if (seleccion == 4){
                //Instancia Salir
                System.out.println("-----------------------------------------");
                System.out.println("Gracias, vuelva pronto a bancos Gonzalito");
                System.out.println("-----------------------------------------");
                bandera = 2;
            }
        } while (bandera != 2);
    }
    
    //Metodo para solicitar cantidad de retiro
    public void Retiro(){
        retiro = consola.nextInt();        
    }
    
    //Metodo para solicitar deposito
    public void Deposito(){
        deposito = consola.nextInt();
    }
    
    //Metodo Abstracto
    public abstract void Transacciones();
    
    //Metodos setter y getter
    public int getSaldo(){
        return saldo;
    }
    
    public void setSaldo(int saldoN){
        this.saldo = saldoN;
    }
    
    

}
