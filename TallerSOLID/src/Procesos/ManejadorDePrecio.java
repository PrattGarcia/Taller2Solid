/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Postres.Postre;

/**
 *
 * @author HP
 */
public class ManejadorDePrecio {
    
     
     
     public static double calcularPrecioFinal(Postre p){
        double precioFinal;
        precioFinal=(p.precioParcial+(p.precioParcial*0.12))+(p.aderezos.size()*0.50);
        return precioFinal;
    }
     public static String showPrecioFinal(Postre p){
        return "Precio Final: $ " + calcularPrecioFinal(p);
    }
    
}
