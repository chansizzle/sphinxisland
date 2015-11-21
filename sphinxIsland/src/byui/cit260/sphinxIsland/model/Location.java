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
public class Location implements Serializable {

    // Location class instance variables
    private int column;
    private int row;
    private boolean visited; //changed to boolean
    private int amountRemaining;
    private Player player;
    private Sphinx[] sphinx;
    private ArrayList<Island> island;
    private Scene scene;
    private Location[][] location;

    
    public Location() {
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.column;
        hash = 47 * hash + this.row;
        hash = 47 * hash + (this.visited ? 1 : 0);
        hash = 47 * hash + this.amountRemaining;
        return hash;
    }

    public Location(int column, int row) {
        if (row < 1 || column < 1) {
            System.out.println("The numbers of rows and columns must be greater than zero.");
            return;
        }
        this.row = row;
        this.column = column;
        
        this.location = new Location[row][column];
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                
            Location location = new Location();
            location.setColumn(column);
            location.setRow(row);
            location.setVisited(false);
           
            location[row][column] = location;
            }
        }
    }
    
    public ArrayList<Island> getIsland() {
        return island;
    }

    public void setIsland(ArrayList<Island> island) {
        this.island = island;
    }

    public Sphinx[] getSphinx() {
        return sphinx;
    }

    public void setSphinx(Sphinx[] sphinx) {
        this.sphinx = sphinx;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
        

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(int amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    
    @Override
    public String toString() {
        return "Location{" + "column=" + column + ", row=" + row + ", visited=" + visited + ", amountRemaining=" + amountRemaining + '}';
    }

    @Override


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.column) != Double.doubleToLongBits(other.column)) {
            return false;
        }
        if (Double.doubleToLongBits(this.row) != Double.doubleToLongBits(other.row)) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountRemaining) != Double.doubleToLongBits(other.amountRemaining)) {
            return false;
        }
        return true;
    }

}
