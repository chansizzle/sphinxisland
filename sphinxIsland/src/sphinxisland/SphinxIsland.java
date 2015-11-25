/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sphinxisland;

import byui.cit260.sphinxIsland.model.Game;
import byui.cit260.sphinxIsland.model.Player;
import byui.cit260.sphinxIsland.view.StartProgramView;

/**
 *
 * @author chandlel
 */
public class SphinxIsland {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame;
    public static Game getCurrentGame;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SphinxIsland.currentGame = currentGame;
    }
    
    public static Player getPlayer() {
        return player; //player changed to match Player.java's name variable? is this right?
    }

    public static void setPlayer(Player player) { //player changed to match Player.java's name variable? is this right?
        SphinxIsland.player = player; //.player and player changed to match Player.java's name variable? is this right?
    }

    public static void main(String[] args) {
        // create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        try {
        startProgramView.startProgram();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.displayBanner();
        }    
    }
}
