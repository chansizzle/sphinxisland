/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.control;

import byui.cit260.sphinxIsland.model.Island;
import byui.cit260.sphinxIsland.model.Location;
import byui.cit260.sphinxIsland.model.Scene;

/**
 *
 * @author sarahbroat
 */
public class LocationControl {

    public static void moveActorsToStartingLocation(Island island) {

    }

    static void assignScenesToLocations(Island island, Scene[] scenes) {
        Location[][] locations = island.getLocation();

        locations[0][0].setScene("start");
        locations[0][1].setScene("sidequest1");
        locations[0][2].setScene("travel");
        locations[0][3].setScene("sidequest2");
        locations[0][4].setScene("travel");
        locations[1][0].setScene("travel");
        locations[1][1].setScene("travel");
        locations[1][2].setScene("sphinx1");
        locations[1][3].setScene("travel");
        locations[1][4].setScene("sidequest3");
        locations[2][0].setScene("travel");
        locations[2][1].setScene("sidequest4");
        locations[2][2].setScene("travel");
        locations[2][3].setScene("sphinx2");
        locations[2][4].setScene("travel");
        locations[3][0].setScene("sidequest5");
        locations[3][1].setScene("travel");
        locations[3][2].setScene("sidequest6");
        locations[3][3].setScene("travel");
        locations[3][4].setScene("travel");
        locations[4][0].setScene("travel");
        locations[4][1].setScene("finalsphinx");
        locations[4][2].setScene("travel");
        locations[4][3].setScene("boardraft");
        locations[4][4].setScene("finish");

    }
}
