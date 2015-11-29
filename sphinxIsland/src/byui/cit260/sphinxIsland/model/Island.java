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
    
    private int rowCount;
    private int columnCount;
    private Game game;
    private Location[][] locations;

    public Island(int howManyRows, int howManyColumnns) {
        this.rowCount = howManyRows;
        this.columnCount = howManyColumnns;
        this.locations = new Location[howManyRows][howManyColumnns];
        
        for (int rowNumb = 0; rowNumb < howManyRows; rowNumb++) {
            for (int columnNumb = 0; columnNumb < howManyColumnns; columnNumb++) {
                Location location = new Location();
                location.setColumn(columnNumb);
                location.setRow(rowNumb);
                locations[rowNumb][columnNumb] = location;
            }
        }
    }
    public int getRowCount() {
        return rowCount;
    }
    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }
    
    public int getColumnCount() {
        return columnCount;
    }
    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }
    
    public Location[][] getLocation() {
        return locations;
    }

    public void setLocation(Location[][] locations) {
        this.locations = locations;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Island{" + "columnCount=" + columnCount + ", rowCount=" + rowCount + '}';
    }

}
