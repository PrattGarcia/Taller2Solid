/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

/**
 *
 * @author HP
 */
public class Crema extends Aderezo {
    
    public Crema(){
        super();
    }
    
    public Crema(String nomCrema){
        this.nombre = nomCrema;
    }
    @Override
    public void setNombre(String nom) {
        nombre=nom;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }
    
    
}
