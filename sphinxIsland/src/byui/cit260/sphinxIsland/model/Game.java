/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.model;

import java.io.Serializable;

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
    private Player player;
    private InventoryItem[] inventory; //same as inventoryitem in example program
    private Island island; //same as map in example program
    private Sphinx[] sphinx; //same as actors in example program

    public Game() {
    }

    public double getTotalGems() {
        return totalGems;
    }

    public void setTotalGems(double totalGems) {
        this.totalGems = totalGems;
    }

    public double getNoSphinxes() {
        return noSphinxes;
    }

    public void setNoSphinxes(double noSphinxes) {
        this.noSphinxes = noSphinxes;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    //public InventoryBag[] getInventoryBag() {
        //return inventoryBag;
    //}

    //public void setInventoryBag(InventoryBag[] inventoryBag) {
        //this.inventoryBag = inventoryBag;
    //}

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

    @Override
    public String toString() {
        return "Game{" + "totalGems=" + totalGems + ", noSphinxes=" + noSphinxes + '}';
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public InventoryItem[] getInventoryList() {
        return inventory;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
