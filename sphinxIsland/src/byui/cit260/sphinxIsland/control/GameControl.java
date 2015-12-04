/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.control;

import byui.cit260.sphinxIsland.exceptions.GameControlExceptions;
import byui.cit260.sphinxIsland.exceptions.IslandControlExceptions;
import byui.cit260.sphinxIsland.model.Game;
import byui.cit260.sphinxIsland.model.InventoryItem;
import byui.cit260.sphinxIsland.model.Island;
import byui.cit260.sphinxIsland.model.Player;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import sphinxisland.SphinxIsland;

/**
 *
 * @author sarahbroat
 */
public class GameControl {
    public static void createNewGame(Player player) throws GameControlExceptions, IslandControlExceptions {
        Game game = new Game();
        SphinxIsland.setCurrentGame(game);

        game.setPlayer(player);

        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);

        Island island = IslandControl.createIsland(); //create new island/map
        game.setIsland(island); //save the island/map in game

        LocationControl.moveActorsToStartingLocation(island);
    }
    
    public static Player createNewPlayer(String playersName) throws GameControlExceptions {
        Player player = new Player();
        player.setName(playersName);
        SphinxIsland.setPlayer(player);
        return player;        
    }

    public static void saveGame(Game game, String filePath) throws GameControlExceptions {
 
        try(FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        }catch(IOException e){ 
            throw new GameControlExceptions(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) throws GameControlExceptions{
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream output = new ObjectInputStream(fips);
            game = (Game) output.readObject();
        }catch(FileNotFoundException fnfe){
            throw new GameControlExceptions(fnfe.getMessage());
        }catch(Exception e) {
            throw new GameControlExceptions(e.getMessage());
        }
        SphinxIsland.setCurrentGame(game);
    }

    public enum Item {

        Sapphire,
        Ruby,
        Emerald,
        water,
        berries,
        flute;
    }

    /**
     *
     * @return
     * @throws GameControlExceptions
     */
    public static InventoryItem[] createInventoryList() throws GameControlExceptions {
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

    public static InventoryItem[] getSortedInventoryList() throws GameControlExceptions {
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
