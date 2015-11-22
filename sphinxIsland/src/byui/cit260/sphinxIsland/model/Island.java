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

    private int columnCount;
    private int rowCount;
    private String[] game;
    private Location[][] location;

    public Island(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

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

    public int getRowCount() {
        return rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public String toString() {
        return "Island{" + "columnCount=" + columnCount + ", rowCount=" + rowCount + '}';
    }

    public Island getIsland() {
        Island island = null;
        return island;
    }

}
