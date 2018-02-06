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
public class Cercle implements CalcGeo{
    
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }
    public Cercle() {
        rayon = 0;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double getSurface() {
        return Math.pow(rayon, 2)*Math.PI;
    }
 
    
    
}
