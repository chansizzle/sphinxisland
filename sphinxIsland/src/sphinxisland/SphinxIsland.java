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
        //Game Class
        Game newGame = new Game();
        newGame.setTotalGems(3);
        newGame.setNoSphinxes(4);
        
        //InventoryBag Class
        InventoryBag newInventoryBag = new InventoryBag();
        newInventoryBag.setInventoryType("the inventory bag inventoryType is a gem");
        newInventoryBag.setQuantityInStock(31);
        newInventoryBag.setRequiredAmount(100);
        
        //InventoryItem Class
        InventoryItem newInventoryItem = new InventoryItem();
        newInventoryItem.setName("the inventory item is a gem");
        newInventoryItem.setDescription("this gem is really fancy and must not be ignored");
        
        //Island Class
        Island newIsland = new Island();
        newIsland.setColumnCount(12);
        newIsland.setRowCount(34);
        
        //Location Class
        Location newLocation = new Location();
        newLocation.setColumn(21);
        newLocation.setRow(43);
        newLocation.setVisited(true);
        newLocation.setAmountRemaining(65);
        
        //Player Class
        Player newPlayer = new Player();
        newPlayer.setName("Saphire The Sphinx Seeker");
        newPlayer.setCoordinates(1234);
        
        //Scene Class
        Scene newScene = new Scene();
        newScene.setDescription("Raft");
        
        //Sphinx Class
        Sphinx newSphinx = new Sphinx();
        newSphinx.setItemNumber(87);
        newSphinx.setName("Uglyface le Sphinx");
        newSphinx.setDescription("She so ugly!");
        newSphinx.setRiddle("WHAT is your favorite color?");
        newSphinx.setAnswer("Blue!");
        newSphinx.setGem("The Gem of Aggravation");
        
        //DISPLAYING THE CLASSES DATA IN THE ATTRIBUTES
        String gameInfo = newGame.toString();
        System.out.println(gameInfo);
        
        String inventorybagInfo = newInventoryBag.toString();
        System.out.println(inventorybagInfo);
        
        String inventoryitemInfo = newInventoryItem.toString();
        System.out.println(inventoryitemInfo);
        
        String islandInfo = newIsland.toString();
        System.out.println(islandInfo);
        
        String locationInfo = newLocation.toString();
        System.out.println(locationInfo);
        
        String playerInfo = newPlayer.toString();
        System.out.println(playerInfo);
        
        String sceneInfo = newScene.toString();
        System.out.println(sceneInfo);
        
        String sphinxInfo = newSphinx.toString();
        System.out.println(newSphinx);
    }
}
