/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.control;

import byui.cit260.sphinxIsland.model.Island;
import byui.cit260.sphinxIsland.model.Scene;

/**
 *
 * @author sarahbroat
 */
public class LocationControl {

    static void moveActorsToStartingLocation(Island island) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Island createIsland() {
        Island island = new Island(5, 5);

        Scene[] scenes = createScenes();

        GameControl.assignScenesToLocations(island, scenes);

        return island;
    }

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
