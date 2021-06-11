package Principal;
import Adicionales.Aderezo;
import Adicionales.Crema;
import Adicionales.Frutilla;
import Postres.*;
import Procesos.*;
import Leche.*;
import java.util.ArrayList;

public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Deslactosada
        ArrayList<Postre> arrPostres = new ArrayList<>();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        
        // Producir Helado
        Postre helado_vainilla = new Helado("Vainilla");
        arrPostres.add(helado_vainilla);
        // Producir Pastel
        Postre pastel_chocolate = new Pastel("Chocolate");
        arrPostres.add(pastel_chocolate);
        
        arrPostres.forEach(postre -> {
            postre.addAderezos(new Crema("Crema"));
            postre.addAderezos(new Frutilla("Frutilla"));
            System.out.println(postre);
            mnj_leche.cambiarTipoLeche(new LecheDeslactosada(),postre);
            System.out.println(ManejadorDePrecio.showPrecioFinal(postre));
        });          
    }

        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Descremada
        // Finalmente mostrar el precio final de cada uno
        /*LecheEntera leche = new LecheDescremada();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        
        // Producir Helado
        Helado helado_vainilla = new Helado("Vainilla");
        OperacionesAderezo.anadirAderezoHelado(helado_vainilla, new Crema("Crema"));
        OperacionesAderezo.anadirAderezoHelado(helado_vainilla, new Frutilla("Frutilla"));
        System.out.println(helado_vainilla);
        mnj_leche.cambiarTipoLeche(leche, helado_vainilla);
        System.out.println(helado_vainilla.showPrecioFinal());
        
         //Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        OperacionesAderezo.quitarAderezoPastel(pastel_chocolate, new Crema("Nutella"));
        OperacionesAderezo.anadirAderezoPastel(pastel_chocolate, new Frutilla("Frambuesa"));
        System.out.println(pastel_chocolate);
        mnj_leche.cambiarTipoLeche(leche, pastel_chocolate);
        System.out.println(helado_vainilla.showPrecioFinal());*/
        
    }

