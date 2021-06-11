/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public abstract class Postre {
    public String sabor;
    public double precioParcial;
    public  ArrayList<Aderezo> aderezos;
    
    public abstract ArrayList<Aderezo> getAderezos();
    
    public abstract String toString();
    
    public static void anadirAderezoHelado(Helado helado,Aderezo aderezo){
        helado.getAderezos().add(aderezo);
    }
    
    public static void quitarAderezoHelado(Helado helado,Aderezo aderezo){
        helado.getAderezos().remove(aderezo);
    }
    
    public static void anadirAderezoPastel(Pastel pastel,Aderezo aderezo){
        pastel.getAderezos().add(aderezo);
    }
    
    public static void quitarAderezoPastel(Pastel pastel,Aderezo aderezo){
        pastel.getAderezos().remove(aderezo);
    }
    public void addAderezos(Aderezo a){
        aderezos.add(a);
    }
    

    
    
    
}
