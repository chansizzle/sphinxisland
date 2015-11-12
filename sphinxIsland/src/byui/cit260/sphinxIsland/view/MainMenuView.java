/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.view;

import byui.cit260.sphinxIsland.control.GameControl;
import java.util.Scanner;
import sphinxisland.SphinxIsland;

/**
 *
 * @author sarahbroat
 */
public class MainMenuView extends View {

    public MainMenuView() {
    
    
    
    super("\n"
            +"\n------------------------------------"
            +"\n| Main Menu                        |"
            +"\n|\t N - Start new game             |"
            +"\n|\t G - Start saved game           |"
            +"\n|\t H - Get help with the game     |"
            +"\n|\t S - Save the game              |"
            +"\n|\t Q - Quit                       |"
            +"\n------------------------------------");
    }

    
    public boolean doAction(Object obj) { 
       switch (value) {
            case "N": // start a new game
            case "n":
                this.startNewGame();
                break;
            case "G": // start a saved game
            case "g":
                this.startSavedGame();
                break;
            case "H": // access the help menu
            case "h":
                this.display();
                break;
            case "S": //save the current game
            case "s":
                this.saveGame();
                break;
            case "E": // exit the program
            case "e":
                System.exit(0);
                //Runtime.getRuntime().halt(0);
                break;
            default:
            System.out.println("\n*** Invalid selection, please try again ***");
                //break;
       }
    }

    private void startNewGame() {
        // create a new a game 
        GameControl.createNewGame(SphinxIsland.getPlayer());
        
                       //goes to void displayGameMenu() in gamemenuview to start MENU in Gameplay
    }

    private void startSavedGame() {
        System.out.println("*** startSavedGame function called ***");
    }



    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    
}