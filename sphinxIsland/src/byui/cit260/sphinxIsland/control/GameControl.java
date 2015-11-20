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

    public enum SceneType {
        start,
        sidequest1,
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
    
    private static void assignScenesToLocations(Island island, Scenes[] scenes) {
        Location [][] locations = island.getLocation();
        
        
    }
}
