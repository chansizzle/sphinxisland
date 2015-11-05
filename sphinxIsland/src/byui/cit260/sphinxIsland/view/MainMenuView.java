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
public class MainMenuView {

    public String getMENU() {
        return MENU;
    }
    
    private final String MENU = "\n"
            +"\n-----------------------------------------"
            +"\n| Main Menu                             |"
            +"\n|\t N - Start new game             |"
            +"\n|\t G - Start saved game           |"
            +"\n|\t H - Get help with the game     |"
            +"\n|\t S - Save the game              |"
            +"\n|\t E - Exit                       |"
            +"\n-----------------------------------------";
            
    public void displayMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(MENU); //display the main menu
            
            String input = this.getInput(); // get the user's menu choice
            selection = input.charAt(0); // get the first character of string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'E' || selection != 'e'); // a selection is not "exit"
     }

    public String getInput() {
        boolean valid = false; // indicates if the input has been retrieved
        String playersInput = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { // while a valid name has not been retrieved
                
        // prompt for the player's input        
        System.out.println("Enter your menu choice below:");
        
        // get the input from the keyboard and trim off the blank spaces
        playersInput = keyboard.nextLine();
        playersInput = playersInput.trim();
        
        // if the menu selection is invalid prompt the user to re-enter it
        if (playersInput.length() < 1) {
            System.out.println("Invalid input - you must choose a valid menu option.");
            continue; // and repeat 
        }
        break; // exit the repetition
    }
        return playersInput; 
    
    /**
     *
     * @param selection
     */
    }  
    public void doAction(char selection) {
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
            case 'E': // exit the program
            case 'e':
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
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();   //goes to "public class GameMenuView {" in GameMenuView.java to start new game. perhaps this should not have "VIEW" in it
        gameMenu.displayGameMenu();                       //goes to void displayGameMenu() in gamemenuview to start MENU in Gameplay
    }

    private void startSavedGame() {
        System.out.println("*** startSavedGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenu();
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    
}