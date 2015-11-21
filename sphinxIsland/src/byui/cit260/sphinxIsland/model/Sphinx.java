/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author sarahbroat
 */
public enum Sphinx implements Serializable {

    // Sphinx class instance variables& redo the  hash & tostring
    Sphinx1("Insert Name Here"),
    Sphinx2("Insert Name Here"),
    FinalSphinx("Insert Name Here");

    private final String description;
    private String[] game;

    public String[] getGame() {
        return game;
    }

    public void setGame(String[] game) {
        this.game = game;
    }

    private Location[][] location;

    public Location[][] getLocation() {
        return location;
    }

    public void setLocation(Location[][] location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    Sphinx(String description) {
        this.description = description;

    }

}
