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
public class Rectangle implements CalcGeo{

    private int longueur;
    private int largeur;
    private  static int count = 0;
    
    Rectangle(){
        System.out.println("Rectangle()");
        longueur = 0;
        largeur = 0;
        count ++;
    }
    
    Rectangle(int longueur, int largeur){
        
        System.out.println("Rectangle(int longueur,int largeur)");
        this.longueur = longueur;
        this.largeur = largeur;
        count ++;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
    
    @Override
    public double getSurface(){
        return longueur*largeur; //propriete virtuelle
    }
    
    
    public static int getCount(){
        return count;
    }

    @Override //annotation on surcharge 
    public String toString() {
        //return super.toString(); //super fait reference a la classe mere
        String s = "Rectangle, longueur : "+this.longueur+", largeur: "+this.largeur;
        return s;
    }

    @Override
    public boolean equals(Object o) {
        boolean ret = false;
        Rectangle rcomp = (Rectangle)o;
        
        if(this.longueur == rcomp.longueur &&
                this.largeur == rcomp.largeur){
            ret = true;
        }
        
        return ret;
    }
    
    
    
}
