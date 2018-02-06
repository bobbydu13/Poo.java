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
public class Carre extends Rectangle{
    private int cote;

    
    
    public Carre(int cote) {
        super(cote,cote);
        System.out.println("public Carre(int cote)");
        this.cote = cote;
    }
    
    public Carre() {
        System.out.println("public Carre()");
        this.cote = 0;
    }

   
    public int getCote() {
        return cote;
    }

    public void setCote(int cote) {
        this.cote = cote;
    }

    @Override
    public String toString() {
        return "Carre{" + "cote=" + cote + '}';
    }
   
    
    
    
    
    
}
