package Adicionales;

public abstract class Aderezo {
    public String nombre;
    
    public Aderezo(){}
   
    public abstract void setNombre(String nom);
    public abstract String getNombre();

    @Override
    public String toString() {
        return nombre.toUpperCase();
    }
    
    
    
    
}
