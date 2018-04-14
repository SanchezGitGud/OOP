/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nim.spiel;

import java.util.ArrayList;

/**
 *
 * @author franzka
 */
public class Spielsteine {
    
    private int steine;
    
    public Spielsteine() {
        this.steine = randomSteine();
    }
    
    public int randomSteine() {
      
        int random_20_30 = 20 + (int)(Math.random() * 30);
        return random_20_30;
    }
    
    public boolean ueberpruefe_Zugsteine(int zug) {
       
        ArrayList<Integer> zugsteine = new ArrayList<>();
        zugsteine.add(1);
        zugsteine.add(2);
        zugsteine.add(3);
        
        if (zugsteine.contains(zug)) {
            return true;
        } else {
            return false;
        }
        
    }
    
}
