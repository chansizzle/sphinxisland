/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author sarahbroat
 */
public enum Sphinx implements Serializable {

    Sphinx1("Insert Name Here"),
    Sphinx2("Insert Name Here"),
    FinalSphinx("Insert Name Here");

    private final String description;
    private final Point coordinates;
    /*private Location[][] location;
    private String[] game;

    public String[] getGame() {
        return game;
    }
    public void setGame(String[] game) {
        this.game = game;
    }
    public Location[][] getLocation() {
        return location;
    }
    public void setLocation(Location[][] location) {
        this.location = location;
    }
*/
    Sphinx(String description) {
        this.description = description;
        coordinates = new Point(1, 1);
    }
    
    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
    

}
