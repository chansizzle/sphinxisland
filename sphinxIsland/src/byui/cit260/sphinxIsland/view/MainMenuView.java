/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.view;

import byui.cit260.sphinxIsland.control.GameControl;
import byui.cit260.sphinxIsland.exceptions.GameControlExceptions;
import byui.cit260.sphinxIsland.exceptions.IslandControlExceptions;
import java.util.logging.Level;
import java.util.logging.Logger;
import sphinxisland.SphinxIsland;

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
                + "\n|\t G - Start saved game           |"
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
                System.out.println("\n*** Invalid selection, please try again ***");
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

    private void startSavedGame() {
        System.out.println("*** startSavedGame function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
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
