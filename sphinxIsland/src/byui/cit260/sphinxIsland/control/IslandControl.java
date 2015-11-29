/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.control;


import byui.cit260.sphinxIsland.model.Game;
import byui.cit260.sphinxIsland.model.Island;
import byui.cit260.sphinxIsland.model.Location;
import byui.cit260.sphinxIsland.model.Scene;
import sphinxisland.SphinxIsland;

/**
 *
 * @author chansizzle
 */
public class IslandControl {
    
    public static Island createIsland() {

    Island island = new Island(5, 5);
    Scene[] scenes = createScenes();
    IslandControl.assignScenesToLocations(island, scenes);
    return island;
        
    }
    public enum SceneType {

        start,
        sidequest1,
        travel,
        sidequest2,
        sphinx1,
        sidequest3,
        sidequest4,
        sphinx2,
        sidequest5,
        sidequest6,
        finalsphinx,
        boardraft,
        finish;
    }
    private static Scene[] createScenes() {
        Game game = SphinxIsland.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
       
        return scenes;
    }

    private static void assignScenesToLocations(Island island, Scene[] scenes) {
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
  /*
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.sidequest1.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.travel.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.sidequest2.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.travel.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.travel.ordinal()]);
        locations[1][1].setScene(scenes[LocationControl.SceneType.travel.ordinal()]);
        locations[1][2].setScene(scenes[LocationControl.SceneType.sphinx1.ordinal()]);
        locations[1][3].setScene(scenes[LocationControl.SceneType.travel.ordinal()]);
        locations[1][4].setScene(scenes[LocationControl.SceneType.sidequest3.ordinal()]);
        locations[2][0].setScene(scenes[LocationControl.SceneType.travel.ordinal()]);
        locations[2][1].setScene(scenes[LocationControl.SceneType.sidequest4.ordinal()]);
        locations[2][2].setScene(scenes[LocationControl.SceneType.travel.ordinal()]);
        locations[2][3].setScene(scenes[LocationControl.SceneType.sphinx2.ordinal()]);
        locations[2][4].setScene(scenes[LocationControl.SceneType.travel.ordinal()]);
        locations[3][0].setScene(scenes[LocationControl.SceneType.sidequest5.ordinal()]);
        locations[3][1].setScene(scenes[LocationControl.SceneType.travel.ordinal()]);
        locations[3][2].setScene(scenes[LocationControl.SceneType.sidequest6.ordinal()]);
        locations[3][3].setScene(scenes[LocationControl.SceneType.travel.ordinal()]);
        locations[3][4].setScene(scenes[LocationControl.SceneType.travel.ordinal()]);
        locations[4][0].setScene(scenes[LocationControl.SceneType.travel.ordinal()]);
        locations[4][1].setScene(scenes[LocationControl.SceneType.finalsphinx.ordinal()]);
        locations[4][2].setScene(scenes[LocationControl.SceneType.travel.ordinal()]);
        locations[4][3].setScene(scenes[LocationControl.SceneType.boardraft.ordinal()]);
        locations[4][4].setScene(scenes[LocationControl.SceneType.finish.ordinal()]);
        */
    }

    private static void assignScenesToLocations(Island land) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
