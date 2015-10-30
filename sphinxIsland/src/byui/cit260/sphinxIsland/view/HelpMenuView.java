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
public class HelpMenuView {
    private final String HELPMENU = "\n"
            +"\n---------------------------------------------------------------"
            +"\n| Help Menu                                                    |"
            +"\n|\t G - What is the goal of the game?                          |"
            +"\n|\t M - How do I move?                                         |"
            +"\n|\t I - How to store, access, and retrieve inventory items     |"
            +"\n|\t S - How to view list of Sphinx sisters encountered         |"
            +"\n|\t P - How to view list of puzzles solved                     |"
            +"\n|\t R - Return to the Main Menu                                |"
            +"\n---------------------------------------------------------------";
            
    public void displayHelpMenu() {
        
        char selection = ' ';
        do {
            
            System.out.println(HELPMENU); //display the help menu
            
            String input = this.getInput(); // get the user's menu choice
            selection = input.charAt(0); // get the first character of string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'R' || selection != 'r'); // a selection is not "exit"
        
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
           case 'G': // goal of the game
               this.gameGoalHelp();
               break;
           case 'M': // move help
               this.moveHelp();
               break;
           case 'I': // inventory help
               this.inventoryHelp();
               break;
           case 'S': //sphinx help
               this.sphinxHelp();
               break;
           case 'P': // puzzle help
               this.puzzleHelp();
               break;
           case 'R': // return to main menu
            MainMenuView mainMenu = new MainMenuView();
            mainMenu.displayMenu();
           default:
               System.out.println("\n*** Invalid selection, please try again ***");
               break;
       }
    }

    private void gameGoalHelp() {
        System.out.println("*** gameGoalHelp function called ***");
    }

    private void moveHelp() {
        System.out.println("*** moveHelp function called ***");
    }

    private void inventoryHelp() {
        System.out.println("*** inventoryHelp function called ***");
    }

    private void sphinxHelp() {
        System.out.println("*** sphinxHelp function called ***");
    }

    private void puzzleHelp() {
        System.out.println("*** puzzleHelp function called ***");
    }
 }

