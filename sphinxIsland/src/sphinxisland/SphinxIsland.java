/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sphinxisland;

import byui.cit260.sphinxIsland.model.Game;
import byui.cit260.sphinxIsland.model.InventoryBag;
import byui.cit260.sphinxIsland.model.InventoryItem;
import byui.cit260.sphinxIsland.model.Island;
import byui.cit260.sphinxIsland.model.Location;
import byui.cit260.sphinxIsland.model.Player;
import byui.cit260.sphinxIsland.model.Scene;
import byui.cit260.sphinxIsland.model.Sphinx;
import byui.cit260.sphinxIsland.view.StartProgramView;

/**
 *
 * @author chandlel
 */
public class SphinxIsland {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SphinxIsland.currentGame = currentGame;
    }

    private static Player player = null; //player changed to match Player.java's name variable? is this right?

    public static Player getPlayer() {
        return player; //player changed to match Player.java's name variable? is this right?
    }

    public static void setPlayer(Player player) { //player changed to match Player.java's name variable? is this right?
        SphinxIsland.player = player; //.player and player changed to match Player.java's name variable? is this right?
    }

    public static void main(String[] args) {
        // create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();

    }
}
