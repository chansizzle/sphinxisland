/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.view;

import byui.cit260.sphinxIsland.control.GameControl;
import sphinxisland.SphinxIsland;

/**
 *
 * @author sarahbroat
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n------------------------------------"
                + "\n| Main Menu                        |"
                + "\n|\t N - Start new game             |"
                + "\n|\t G - Start saved game           |"
                + "\n|\t H - Get help with the game     |"
                + "\n|\t S - Save the game              |"
                + "\n|\t Q - Quit                       |"
                + "\n------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        char selection = (char) obj;
        //selection = selection.toUpperCase();

        switch (selection) {
            case 'N': // start a new game
            case 'n':
                this.startNewGame();
                break;
            case 'G': // start a saved game
            case 'g':
                this.startSavedGame();
                break;
            case 'H': // access the help menu
            case 'h':
                this.displayHelpMenu();
                break;
            case 'S': //save the current game
            case 's':
                this.saveGame();
                break;
            case 'Q': // exit the program
            case 'q':
                System.exit(0);
                //Runtime.getRuntime().halt(0);
                break;
            default:
                System.out.println("\n*** Invalid selection, please try again ***");
            //break;
        }
        return false;
    }

    private void startNewGame() {
        // create a new a game 
        GameControl.createNewGame(SphinxIsland.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        //goes to void displayGameMenu() in gamemenuview to start MENU in Gameplay
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
