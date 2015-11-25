/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.control;

import byui.cit260.sphinxIsland.model.Game;
import byui.cit260.sphinxIsland.model.InventoryItem;
import byui.cit260.sphinxIsland.model.Island;
import byui.cit260.sphinxIsland.model.Location;
import byui.cit260.sphinxIsland.model.Player;
import byui.cit260.sphinxIsland.model.Scene;
import sphinxisland.SphinxIsland;

/**
 *
 * @author sarahbroat
 */
public class GameControl {
    public static void createNewGame(Player player) {
        Game game = new Game();
        SphinxIsland.setCurrentGame(game);

        game.setPlayer(player);

        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);

        //Island island = new Island();
        Island island = LocationControl.createIsland();
        game.setIsland(island);

        //LocationControl.moveActorsToStartingLocation(island);
    }
    
    public static Player createNewPlayer(String playersName) {
        
        // Error checking
        if (playersName == null) {
            return null;
        }
        
        // Create new player instance
        Player player = new Player();
        
        // Set the name to the value given
        player.setName(playersName);
        
        // Save the player instance to the main class
        SphinxIsland.setPlayer(player);
        
        // Return the player instance created
        return player;
        
    }

    public enum Item {

        Sapphire,
        Ruby,
        Emerald,
        water,
        berries,
        flute;
    }

    private static InventoryItem[] createInventoryList() {
        InventoryItem[] inventory = new InventoryItem[6];

        InventoryItem sapphire = new InventoryItem();
        sapphire.setDescription("Sapphire");
        //sapphire.setQuantityInStock(0);
        inventory[Item.Sapphire.ordinal()] = sapphire;

        InventoryItem ruby = new InventoryItem();
        ruby.setDescription("Ruby");
        //ruby.setQuantityInStock(0);
        inventory[Item.Ruby.ordinal()] = ruby;

        InventoryItem emerald = new InventoryItem();
        ruby.setDescription("Emerald");
        //emerald.setQuantityInStock(0);
        inventory[Item.Emerald.ordinal()] = emerald;

        InventoryItem water = new InventoryItem();
        ruby.setDescription("water");
        //water.setQuantityInStock(2);
        inventory[Item.water.ordinal()] = water;

        InventoryItem berries = new InventoryItem();
        ruby.setDescription("berries");
        //berries.setQuantityInStock(10);
        inventory[Item.berries.ordinal()] = berries;

        InventoryItem flute = new InventoryItem();
        ruby.setDescription("flute");
        //flute.setQuantityInStock(1);
        inventory[Item.flute.ordinal()] = flute;

        return inventory;
    }

    public static InventoryItem[] getSortedInventoryList() {
        InventoryItem[] originalInventoryList = SphinxIsland.getCurrentGame().getInventoryList();

        InventoryItem[] inventoryList = originalInventoryList.clone();

        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length - 1; i++) {
            for (int j = 0; j < inventoryList.length - 1 - i; j++) {
                if (inventoryList[j].getDescription().compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j + 1];
                    inventoryList[j + 1] = tempInventoryItem;
                }
            }
        }
        return inventoryList;
    }

    
}
