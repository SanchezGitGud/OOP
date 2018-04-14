/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nim.spiel;

/**
 *
 * @author franzka
 */
public class Spieler {
    
    private String name;
    private Boolean isComputer;
    private NimSpiel spiel;
    
    public Spieler(String name, Boolean isComputer) {
        this.name = name;
        this.isComputer = isComputer;
        this.spiel = spiel;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Boolean isComputer() {
        return this.isComputer;
    }
    
    public void zieheSteine(int zug) {
        
        Spielsteine steine = new Spielsteine();
        
        if ( this.isComputer ) {
            optimalerZug();
        } else {
            if (steine.ueberpruefe_Zugsteine(zug)) {
                return zug;
            } else {
                System.out.println("Gebe eine Zahl zwischen 1 und 3 ein");
            }
        }
    }
    
    public void optimalerZug() {
        
    }
    
}
