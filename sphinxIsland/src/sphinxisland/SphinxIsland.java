/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sphinxisland;

import byui.cit260.sphinxIsland.model.Game;
import byui.cit260.sphinxIsland.model.InventoryBag;
import byui.cit260.sphinxIsland.model.InventoryItem;
import byui.cit260.sphinxIsland.model.Island;
import byui.cit260.sphinxIsland.model.Location;
import byui.cit260.sphinxIsland.model.Player;
import byui.cit260.sphinxIsland.model.Scene;
import byui.cit260.sphinxIsland.model.Sphinx;

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
        Scene newScene = new Scene();
        newScene.setDescription("Raft");
        
        
        String sceneInfo = newScene.toString();
        System.out.println(sceneInfo);
    }
}
