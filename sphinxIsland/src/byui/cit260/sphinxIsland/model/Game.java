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
public enum Game implements Serializable {
    
    Gems("3 Gems; Sapphire, Ruby, and Emerald"),
    Sphinxes("3 Sphinxes; I'll come up with names later");
    
    // Game class instance variables
    private final Double totalGems; //changed to double
    private  final Double noSphinxes; //changed to double
    private final String description;
    
    private Player player;
    private InventoryBag[] inventoryBag;
    private Island island;
    private Sphinx[] sphinx;
    

    Game(String description) {
    this.description = description;
    totalGems = new Double(3.00);
    noSphinxes = new Double(3.00);
    }

    public String getDescription() {
        return description;
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

   
}
