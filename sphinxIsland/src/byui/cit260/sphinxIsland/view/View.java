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
public abstract class View implements ViewInterface {

    protected String displayMessage;

    public String getPromptMessage() {
        return displayMessage;
    }

    public View(String displayMessage) {
        this.displayMessage = displayMessage;
    }

    @Override
    public void display() {
        char selection;
        boolean done = false;
        do {

            System.out.println(this.displayMessage); //display the menu
            String value = this.getInput();
            selection = Character.toUpperCase(value.charAt(0));

            done = this.doAction(selection);

        } while (!done); // a selection is not "exit"

    }

    @Override
    public String getInput() {
        boolean valid = false; // indicates if the input has been retrieved
        String value = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream

        while (!valid) { // while a valid name has not been retrieved

            // prompt for the player's input        
            System.out.println("Enter your game menu choice.");

            // get the input from the keyboard and trim off the blank spaces
            value = keyboard.nextLine();
            value = value.trim();

            // if the menu selection is invalid prompt the user to re-enter it
            if (value.length() < 1) {
                System.out.println("Invalid input - you must choose a valid menu option.");
                continue; // and repeat 
            }
            break; // exit the repetition
        }
        return value;
    }
        return value; 
    
    /**
     *
     * @param value
     */
    }  
    
    @Override public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        
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
            case "Q": // exit the program
            case "q":
                return true;
                //System.exit(0);
                //Runtime.getRuntime().halt(0);
                //break;
            default:
            System.out.println("\n*** Invalid selection, please try again ***");
                //break;

        }
          return false;
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
    
    
    public String getDisplayMessage() {
        return displayMessage;
    }

    public void setDisplayMessage(String displayMessage) {
        this.displayMessage = displayMessage;
    }  
        
    }
