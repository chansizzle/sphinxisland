/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sphinxisland;

import byui.cit260.sphinxIsland.exceptions.ProgramControlExceptions;
import byui.cit260.sphinxIsland.model.Game;
import byui.cit260.sphinxIsland.model.Player;
import byui.cit260.sphinxIsland.view.ErrorView;
import byui.cit260.sphinxIsland.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author chandlel
 */
public class SphinxIsland {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    //public static Game getCurrentGame;
    private static Player player = null;
    public static PrintWriter outFile = null;
    public static BufferedReader inFile = null;
    public static PrintWriter logFile = null;

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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        SphinxIsland.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        SphinxIsland.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        SphinxIsland.logFile = logFile;
    }

    public static void main(String[] args) throws ProgramControlExceptions {
        // create StartProgramView and start the program

        try {
            SphinxIsland.inFile = new BufferedReader(new InputStreamReader(System.in));
            SphinxIsland.outFile = new PrintWriter(System.out, true);

            String filePath = "log.txt";
            SphinxIsland.logFile = new PrintWriter(filePath);

            StartProgramView startProgramView = new StartProgramView();
            startProgramView.startProgram();
        } catch (IOException e) {
            //  ErrorView.display(SphinxIsland.class.getName(), e.getMessage());
            ErrorView.display(SphinxIsland.class.getName(), "Exception: " + e.toString()
                    + "\nCause" + e.getCause()
                    + "\nMessage" + e.getMessage());

        } finally {
            try {
                if (SphinxIsland.inFile != null) {
                    SphinxIsland.inFile.close();
                }

                if (SphinxIsland.outFile != null) {
                    SphinxIsland.outFile.close();
                }

                if (SphinxIsland.logFile != null) {
                    SphinxIsland.logFile.close();
                }

            } catch (IOException ex) {
                //seems to work// ErrorView.display("SphinxIsland", "Error closing file(s)");
                ErrorView.display(SphinxIsland.class.getName(), "Error reading input: " + ex.getMessage());
                return;
                //Logger.getLogger(SphinxIsland.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
