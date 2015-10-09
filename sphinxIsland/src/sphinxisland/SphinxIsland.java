/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sphinxisland;

import byui.cit260.sphinxIsland.model.Player;

/**
 *
 * @author chandlel
 */
public class SphinxIsland {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player playerOne = new Player();
        
        playerOne.setName("Saphire");
        playerOne.setCoordinates("beach");
        
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
