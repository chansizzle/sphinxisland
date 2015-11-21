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
        
        Island island = LocationControl.createIsland();
        game.setIsland(island);
        
        LocationControl.moveActorsToStartingLocation(island);
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
        InventoryItem[] inventory = 
                new InventoryItem[6];
        
        InventoryItem sapphire = new InventoryItem();
        sapphire.setDescription("Sapphire");
        sapphire.setQuantityInStock(0);
        inventory[Item.Sapphire.ordinal()] = sapphire;
        
        InventoryItem ruby = new InventoryItem();
        ruby.setDescription("Ruby");
        ruby.setQuantityInStock(0);
        inventory[Item.Ruby.ordinal()] = ruby;
        
        InventoryItem emerald = new InventoryItem();
        ruby.setDescription("Emerald");
        emerald.setQuantityInStock(0);
        inventory[Item.Emerald.ordinal()] = emerald;
        
        InventoryItem water = new InventoryItem();
        ruby.setDescription("water");
        water.setQuantityInStock(0);
        inventory[Item.water.ordinal()] = water;
        
        InventoryItem berries = new InventoryItem();
        ruby.setDescription("berries");
        berries.setQuantityInStock(0);
        inventory[Item.berries.ordinal()] = berries;
        
        InventoryItem flute = new InventoryItem();
        ruby.setDescription("flute");
        flute.setQuantityInStock(0);
        inventory[Item.flute.ordinal()] = flute;
        
        return inventory;            
    }
    
    public static InventoryItem[] getSortedInventoryList() {
        InventoryItem[] originalInventoryBag = SphinxIsland.getCurrentGame().getInventoryBag();
        
        InventoryItem[] inventoryBag = originalInventoryBag.clone();
        
        InventoryItem tempInventoryItem;
        for(int i = 0; i < inventoryBag.length-1; i++) {
            for(int j = 0; j < inventoryBag.length-1-i; j++) {
                if(inventoryBag[j].getDescription().compareToIgnoreCase(inventoryBag[j+1].getDescription()) > 0) {
                    tempInventoryItem = inventoryBag[j];
                    inventoryBag[j] = inventoryBag[j+1];
                    inventoryBag[j+1] = tempInventoryItem;
                    
            }
            }
        }
        return inventoryBag;
    }

    public enum SceneType {
        start,
        sidequest1,
        travel,
        sidequest2,
        sphinx1,
        sidequest3,
        sidequest4,
        sphinx2,
        sidequest5,
        sidequest6,
        finalsphinx,
        boardraft,
        finish;
    }
    
    private static Scene[] createScenes() {
    Game game = SphinxIsland.getCurrentGame;
    
    Scene[] scenes = new Scene[SceneType.values().length];
    
    Scene startingScene = new Scene();
    startingScene.setDescription("You wash up on a beach, we'll add more later.");
    startingScene.setMapSymbol("ST");
    startingScene.setBlocked(false);
    scenes[SceneType.start.ordinal()] = startingScene;
    
    Scene finishScene = new Scene();
    finishScene.setDescription("You get on the raft, we'll add more later.");
    finishScene.setMapSymbol("FN");
    finishScene.setBlocked(false);
    scenes[SceneType.start.ordinal()] = finishScene;
    
    return scenes;
    }
    
    static void assignScenesToLocations(Island island, Scene[] scenes) {
        Location [][] locations = island.getLocation();
        
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.sidequest1.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.travel.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.sidequest2.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.travel.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.travel.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.travel.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.sphinx1.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.travel.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.sidequest3.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.travel.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.sidequest4.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.travel.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.sphinx2.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.travel.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.sidequest5.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.travel.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.sidequest6.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.travel.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.travel.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.travel.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.finalsphinx.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.travel.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.boardraft.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.finish.ordinal()]);
        
    }
}
