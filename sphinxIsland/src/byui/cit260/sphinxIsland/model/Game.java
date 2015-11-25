/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author sarahbroat
 */
public class Game implements Serializable {

    //Gems("3 Gems; Sapphire, Ruby, and Emerald"),
    //Sphinxes("3 Sphinxes; I'll come up with names later");
    // Game class instance variables
    private double totalGems; //changed to double
    private double noSphinxes; //changed to double
    //private final String description;

    private Player player;
    private InventoryBag[] inventoryBag;
    private Island island;
    private Sphinx[] sphinx;

    public Game() {

    }
    //this.description = description;
    //totalGems = new Double(3.00);
    //noSphinxes = new Double(3.00);
    //public String getDescription() {
    //return description;
    //}
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    public Island getIsland() {
        return island;
    }

    public void setIsland(Island island) {
        this.island = island;
    }

    public Sphinx[] getSphinx() {
        return sphinx;
    }

    public void setSphinx(Sphinx[] sphinx) {
        this.sphinx = sphinx;
    }

    public InventoryBag[] getInventoryBag() {
        return inventoryBag;
    }

    public void setInventoryBag(InventoryBag[] inventoryBag) {
        this.inventoryBag = inventoryBag;
    }

    //private InventoryBag<> inventoryBag;
    public double getTotalGems() {
        return totalGems;
    }

    public double getNoSphinxes() {
        return noSphinxes;
    }

    @Override
    public String toString() {
        return "Game{" + "totalGems=" + totalGems + ", noSphinxes=" + noSphinxes + '}';
    }

    public void setInventory(InventoryItem[] inventoryList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public InventoryItem[] getInventoryList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setInventory(ArrayList<InventoryItem> inventoryList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
