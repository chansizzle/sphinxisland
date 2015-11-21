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
public class Island implements Serializable {

    
    private double columnCount;

    public void setColumnCount(double columnCount) {
        this.columnCount = columnCount;
    }

    public void setRowCount(double rowCount) {
        this.rowCount = rowCount;
    }
    private double rowCount;
    private String[] game;
    private Location [][] location;

    public Location[][] getLocation() {
        return location;
    }

    public void setLocation(Location[][] location) {
        this.location = location;
    }

    public String[] getGame() {
        return game;
    }

    public void setGame(String[] game) {
        this.game = game;
    }

    
    Island() {
    
    }

    

    public double getRowCount() {
        return rowCount;
    }


    public Double getColumnCount() {
        return columnCount;
    }
    
    @Override
    public String toString() {
        return "Island{" + "columnCount=" + columnCount + ", rowCount=" + rowCount + '}';
    }

}
