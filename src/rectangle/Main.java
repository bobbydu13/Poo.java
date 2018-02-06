/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author dmr
 */
public class Main {

    public static void main(String args[]) {

        Rectangle r = new Rectangle(1, 2);
        Carre c = new Carre(3);        
        Cercle ce= new Cercle(3);

        System.out.println(ce.getSurface());
        afficheSurface(r);
        afficheSurface(c);
        afficheSurface(ce);
    }
    
    public static void affiche(Rectangle r){
        System.out.println(r);
    }
      
    public static void afficheSurface(CalcGeo r){  // r est un objet qui implémente CalcGeo  .CalcGeo est bien un type
        System.out.println(r.getSurface());
    }
    
}
