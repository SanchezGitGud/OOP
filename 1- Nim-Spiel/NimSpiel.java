/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nim.spiel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author franzka
 */
public class NimSpiel {
    
    private Spieler gewinner;
    private Spieler spieler;
    private Spieler startSpieler;
    private Spielsteine spielsteine;
    private String spielregeln;
    private List<Spieler> spielerdaten;
    private int dran;
    private int spielrunden;
    
    public NimSpiel(String name) {
        
        this.spieler = new Spieler(name, false);
        Spieler computer = new Spieler("Computer", true);
        
        this.spielerdaten = new ArrayList<>();
        this.spielerdaten.add(spieler);
        this.spielerdaten.add(computer);
        
        this.spielsteine = new Spielsteine();
        
        this.spielregeln = "spielregeln";
        
        this.startSpieler = randomStartspieler();
        
        this.dran = this.spielerdaten.indexOf(this.startSpieler);
        
    }
    
    public Spieler randomStartspieler() {
        
        int random_0_1= 0 + (int)(Math.random() * 1);
        
         return this.spielerdaten.get(random_0_1);
    }
    
    public void spielen() {
        
        
        
    }
    
}
