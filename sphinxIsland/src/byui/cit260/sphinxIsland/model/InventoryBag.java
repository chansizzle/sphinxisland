/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.model;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author sarahbroat
 */
public class InventoryBag implements Serializable {

    // Inventory Bag instance variables
    private String inventoryType;
    private int quantityInStock;
    private InventoryItem[] inventoryItem;
    private String[] game;

    public String[] getGame() {
        return game;
    }

    public void setGame(String[] game) {
        this.game = game;
    }

    public InventoryItem[] getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(InventoryItem[] inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public InventoryBag() {
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public int getQuantityInStock(int i) {
        return quantityInStock;
    }

    public void setQuantityInStock(int i) {
        this.quantityInStock = quantityInStock;
    }

   

    

    public Object getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @Override
    public String toString() {
        return "InventoryBag{" + "inventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + ", inventoryItem=" + inventoryItem + ", game=" + game + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.inventoryType);
        hash = 97 * hash + this.quantityInStock;
        hash = 97 * hash + Arrays.deepHashCode(this.inventoryItem);
        hash = 97 * hash + Arrays.deepHashCode(this.game);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InventoryBag other = (InventoryBag) obj;
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventoryItem, other.inventoryItem)) {
            return false;
        }
        if (!Arrays.deepEquals(this.game, other.game)) {
            return false;
        }
        return true;
    }

    
}
