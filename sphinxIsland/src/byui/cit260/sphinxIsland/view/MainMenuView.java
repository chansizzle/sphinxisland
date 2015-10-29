/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.view;

import java.util.Scanner;

/**
 *
 * @author sarahbroat
 */
public class MainMenuView {

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
            
        } while (selection != 'E'); // a selection is not "exit"
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
        
        // if the name is invalid (less than 2 characters in length) prompt the user to re-enter it
        if (playersInput.length() < 1) {
            System.out.println("Invalid input - your name must be more than one character.");
            continue; // and repeat 
        }
        break; // exit the repetition
        }
        return null; //this fixed the 'illegal start of expression' on public void doAction(char selection) {
    
    /**
     *
     * @param selection
     */
    }  
    public void doAction(char selection) {
       switch (selection) {
           case 'N': // start a new game
               this.startNewGame();
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
           case 'E': // exit the program
               return;
           default:
               System.out.println("\n*** Invalid selection, please try again ***");
               break;
       }
    }

    
    private void startNewGame() {
        System.out.println("*** startNewGame function called ***");
    }

    private void startSavedGame() {
        System.out.println("*** startSavedGame function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    
}
