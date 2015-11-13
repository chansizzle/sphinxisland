/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.control;

import byui.cit260.sphinxIsland.model.Player;
import sphinxisland.SphinxIsland;

/**
 *
 * @author sarahbroat
 */
public class ProgramControl {

    public static Player createPlayer(String playersName) {
        
        if (playersName == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        SphinxIsland.setPlayer(player); // save the player
        
        return player;
    }
    
    public static Player getInput(String value) {
        
        if (value == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(value);
        SphinxIsland.setPlayer(player); // save the player
        
        return player;
    }
    
}
