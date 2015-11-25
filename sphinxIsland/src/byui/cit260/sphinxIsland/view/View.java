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
        do {
            System.out.println(this.displayMessage); //display the menu
            String value = this.getInput();
            selection = Character.toUpperCase(value.charAt(0));

            this.doAction(selection);

        } while (selection != 'Q'); // a selection is not "exit"

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
}
