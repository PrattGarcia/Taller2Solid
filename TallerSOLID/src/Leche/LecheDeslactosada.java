package Leche;

import java.util.Scanner;

public class LecheDeslactosada extends LecheEntera {
    
    @Override
    public void usarHelado() {
        System.out.println("Usando leche deslactosada");
    }

    public boolean usarPastel() {
        
        Scanner lector = new Scanner(System.in);
        // Lanzar error No se puede usar en pastel
        //throw new RuntimeException(this.getClass() + ": No se puede usar en pastel");
        System.out.println("No se puede usar en pastel, desea usar helado Y/N?");
        String res = lector.nextLine();
        if(res == "Y".toUpperCase()){
            usarHelado();
            return true;
        }else{
            System.out.println("Entendido no se cambiara la leche");
            return false;
        }
        
    }
        
}
