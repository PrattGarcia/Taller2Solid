package Leche;

public class LecheDescremada extends LecheEntera {
    
    @Override
    public void usarHelado() {
        System.out.println("Usando leche descremada");
    }

    @Override
    public boolean usarPastel() {
        System.out.println("Usando leche descremada");
        return true;
    }
    
}
