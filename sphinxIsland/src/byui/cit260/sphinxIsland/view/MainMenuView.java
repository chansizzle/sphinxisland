/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.view;

import byui.cit260.sphinxIsland.control.GameControl;
import byui.cit260.sphinxIsland.exceptions.GameControlExceptions;
import byui.cit260.sphinxIsland.exceptions.IslandControlExceptions;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import sphinxisland.SphinxIsland;
import java.text.SimpleDateFormat;

/**
 *
 * @author sarahbroat
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n------------------------------------"
                + "\n| Main Menu                             |"
                + "\n|\t N - Start new game             |"
                + "\n|\t G - Get and Start a saved game |"
                + "\n|\t H - Get help with the game     |"
                + "\n|\t S - Save the game              |"
                + "\n|\t Q - Quit                       |"
                + "\n------------------------------------");
    }

    @Override
    public Double getDoubleNumber() {
        Double number = null;
        return number;
    }

    @Override
    public boolean doAction(Object obj) {
        char selection = (char) obj;
        //selection = selection.toUpperCase();

        switch (selection) {
            case 'N': {
                try {
                    // start a new game
                    this.startNewGame();
                } catch (GameControlExceptions ex) {
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'G': // start a saved game
                this.listFiles();
                this.startSavedGame();
                break;
            case 'H': // access the help menu
                this.displayHelpMenu();
                break;
            case 'S': //save the current game
                this.saveGame();
                break;
            case 'Q': // exit the program
                System.exit(0);
                //Runtime.getRuntime().halt(0);
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection, please try again ***");
            //break;
        }
        return false;
    }

    private void startNewGame() throws GameControlExceptions {
        try {
            // create a new a game
            GameControl.createNewGame(SphinxIsland.getPlayer()); //new method needed to be using does not work
        } catch (IslandControlExceptions ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        GameMenuView gameMenu = new GameMenuView(); //old method before L10 does work but doesn't return player
        gameMenu.display(); //old method before L10 does work but doesn't return player
    }

    private void listFiles() {
        String path = "."; //same file path as program
        File directory = new File(path);
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a"); //variable to hold files datetime stamps
        this.console.println("\nList of files to chose from:");
        this.console.printf("\033[34;2m"); //darkblue bold
        this.console.printf("%-4s%-20s%30s", "No.", "Filename", "DateTime Stamp \n");
        this.console.printf("\033[39;0m"); //defaults
        this.console.printf("%-4s%-20s%30s", "---", "--------------------", "------------------------------\n");
        int index = 1; //file numbering system
        File[] fileList = directory.listFiles(); //array of files named fileList. cycle through files
        
        for (File file : fileList) {
            if (file.isFile()) {
                this.console.printf("%-4d%-20s%30s", index, file.getName(), sdf.format(file.lastModified())); //print the list of files. saved games don't have an extension
                this.console.println();
                index ++;
            }
        }
    }
    
    private void startSavedGame() {
        this.console.println("\nEnter the file name of one of the saved game.");
        String filePath = this.getInput();
        try {
            GameControl.getSavedGame(filePath);
            this.console.printf("\nSaved game \"\033[34;2m"+ filePath +"\"\033[39;0m started.");
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
        } catch (Exception e) {
            ErrorView.display("MainMenuView", e.getMessage());
        }
    }

    private void saveGame() {
        this.console.println("\n\nEnter the file name for saving this game.");
        String filePath = this.getInput();

        try {
            GameControl.saveGame(SphinxIsland.getCurrentGame(), filePath);
        } catch (Exception e) {
            ErrorView.display("MainMenuView", e.getMessage());
        }
    }

    public void displayMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView(); //need to device way for help menu in game menu to return to game menu
        helpMenu.display();
    }
}
