/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.control;

import byui.cit260.sphinxIsland.exceptions.IslandControlExceptions;
import byui.cit260.sphinxIsland.model.Game;
import byui.cit260.sphinxIsland.model.Island;
import byui.cit260.sphinxIsland.model.Scene;
import sphinxisland.SphinxIsland;

/**
 *
 * @author chansizzle
 */
public class IslandControl {

    public static Island createIsland() throws IslandControlExceptions {

        Island island = new Island(5, 5);
        Scene[] scenes = createScenes();
        LocationControl.assignScenesToLocations(island, scenes);
        return island;

    }
    public static void moveActorsToStartingLocation(Island island) {
    
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

    private static Scene[] createScenes() throws IslandControlExceptions {
        Game game = SphinxIsland.getCurrentGame();

        Scene[] scenes = new Scene[SceneType.values().length];

        Scene startingScene = new Scene();
        startingScene.setDescription("You wash up on a strange beach, covered with palm trees"
                                    +" on the edge of a dark and mysterious jungle forest."
                                    +" Nearby you see a statue of a fantastic creature- a lion"
                                    +" with the head of a beautiful woman. Lying near the"
                                    +" statue's feet is a bag containing some water, berries,"
                                    +" and a wooden flute. It seems like an odd situation indeed,"
                                    +" but you have travelled the world seeking adventure and"
                                    +" decide to explore this mysterious island.");
        startingScene.setMapSymbol("ST");
        startingScene.setBlocked(false);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene sideQuestOneScene = new Scene();
        startingScene.setDescription("You venture a couple hundred yards into the jungle"
                                    +" and come across another statue- this time it's a"
                                    +" young man with this hands raised up above his head"
                                    +" in a defenisive position, his face frozen in fear."
                                    +" What kind of place have you washed ashore on?");
        startingScene.setMapSymbol("SQ1");
        startingScene.setBlocked(false);
        scenes[SceneType.sidequest1.ordinal()] = sideQuestOneScene;
        
        Scene travelScene = new Scene();
        startingScene.setDescription("You travel deepers into the jungle, passing many"
                                    +" strange and beautiful flowers and trees along the"
                                    +" way. You're still not sure where the path you follow"
                                    +" will lead you, or who inhabits this odd place.");
        startingScene.setMapSymbol("T");
        startingScene.setBlocked(false);
        scenes[SceneType.travel.ordinal()] = travelScene;
        
        Scene sideQuestTwoScene = new Scene();
        startingScene.setDescription("The sun has risen high in the sky, and you are beginning"
                                    +" to get thirsty. Maybe it's time to pull that water pouch"
                                    +" out of your bag?");
        startingScene.setMapSymbol("SQ2");
        startingScene.setBlocked(false);
        scenes[SceneType.sidequest2.ordinal()] = sideQuestTwoScene;
        
        Scene sphinxOneScene = new Scene();
        startingScene.setDescription("Sphinx One");
        startingScene.setMapSymbol("SP1");
        startingScene.setBlocked(false);
        scenes[SceneType.sphinx1.ordinal()] = sphinxOneScene;
        
        Scene sideQuestThreeScene = new Scene();
        startingScene.setDescription("That was a harrowing experience! After leaving the first"
                                    +" sphinx you come across a peaceful waterfall and rest by"
                                    +" its side until you regain your composure and soldier on.");
        startingScene.setMapSymbol("SQ3");
        startingScene.setBlocked(false);
        scenes[SceneType.sidequest3.ordinal()] = sideQuestThreeScene;
        
        Scene sideQuestFourScene = new Scene();
        startingScene.setDescription("Side Quest 4");
        startingScene.setMapSymbol("SQ4");
        startingScene.setBlocked(false);
        scenes[SceneType.sidequest4.ordinal()] = sideQuestFourScene;
        
        Scene sphinxTwoScene = new Scene();
        startingScene.setDescription("Sphinx 2");
        startingScene.setMapSymbol("SP2");
        startingScene.setBlocked(false);
        scenes[SceneType.sphinx2.ordinal()] = sphinxTwoScene;
        
        Scene sideQuestFiveScene = new Scene();
        startingScene.setDescription("Side Quest 5");
        startingScene.setMapSymbol("SQ5");
        startingScene.setBlocked(false);
        scenes[SceneType.sidequest5.ordinal()] = sideQuestFiveScene;
        
        Scene sideQuestSixScene = new Scene();
        startingScene.setDescription("It's been a long and exhausting day, consider"
                                    +" replenishing your strength by taking a breather"
                                    +" and snacking on the berries in your bag.");
        startingScene.setMapSymbol("SQ6");
        startingScene.setBlocked(false);
        scenes[SceneType.sidequest6.ordinal()] = sideQuestSixScene;
        
        Scene finalSphinxScene = new Scene();
        startingScene.setDescription("Final Sphinx");
        startingScene.setMapSymbol("FS");
        startingScene.setBlocked(false);
        scenes[SceneType.finalsphinx.ordinal()] = finalSphinxScene;
        
        Scene boardRaftScene = new Scene();
        startingScene.setDescription("Board Raft");
        startingScene.setMapSymbol("BR");
        startingScene.setBlocked(false);
        scenes[SceneType.boardraft.ordinal()] = boardRaftScene;
        
        Scene finishScene = new Scene();
        startingScene.setDescription("Finish");
        startingScene.setMapSymbol("FN");
        startingScene.setBlocked(false);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        return scenes;
    }

    /*private static void assignScenesToLocations(Island island, Scene[] scenes) throws IslandControlExceptions {
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
    //}
}
