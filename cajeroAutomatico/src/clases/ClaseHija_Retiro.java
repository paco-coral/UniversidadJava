package clases;

public class ClaseHija_Retiro extends ClasePadre_Abstracta{
    
    @Override
    public void Transacciones(){                        
        System.out.println("---------------------------");
        System.out.println("Menu de Retiro");
        System.out.println("    1. $20      4. $100  ");
        System.out.println("    2. $40      5. $200  ");
        System.out.println("    3. $60      6. Salir  ");
        System.out.println("Elija un monto de retiro: ");
        System.out.println("---------------------------");
        Retiro();
        switch (retiro) {
            case 1:
                retiro = 20;
                break;
            case 2:
                retiro = 40;
                break;
            case 3:
                retiro = 60;
                break;
            case 4:
                retiro = 100;
                break;
            case 5:
                retiro = 200;
                break;    
            case 6:
                retiro = 0;
                break;
        }
                        
        //Para que el usuario no retire mas de lo que tiene
        if (retiro <= getSaldo()) {
            transaciones = getSaldo();
            setSaldo(transaciones - retiro);
            if (retiro == 0) {
                System.out.println("--------------------");
                System.out.println("Transación Cancelada");
                System.out.println("--------------------");
            }else{
                System.out.println("-----------------------------------");
                System.out.println("Retiraste: " + retiro);
                System.out.println("Tu Saldo Actual es: " + getSaldo());            
                System.out.println("Ya puede tomar el dinero");
                System.out.println("-----------------------------------");
            }
            
        }else{
            System.out.println("-------------------");
            System.out.println("Saldo Insuficiente");
            System.out.println("-------------------");
        }
    }
        
}
