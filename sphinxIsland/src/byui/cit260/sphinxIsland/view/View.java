/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import sphinxisland.SphinxIsland;

/**
 *
 * @author sarahbroat
 */
public abstract class View implements ViewInterface {

    protected final BufferedReader keyboard = SphinxIsland.getInFile();
    protected final PrintWriter console = SphinxIsland.getOutFile();
    protected String displayMessage;
    public static PrintWriter outFile = null;
    public static BufferedReader inFile = null;
    public static PrintWriter logFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        View.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        View.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        View.logFile = logFile;
    }
    

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
            this.console.println(this.displayMessage); //display the menu
            String value = this.getInput();
            selection = Character.toUpperCase(value.charAt(0));

            this.doAction(selection);

        } while (selection != 'Q'); // a selection is not "exit"

    }

    @Override
    public String getInput() {
        boolean valid = false; // indicates if the input has been retrieved
        String value = null;
        try {
            while (!valid) { // while a valid name has not been retrieved

                // prompt for the player's input        
                this.console.println("Enter your game menu choice.");

                // get the input from the keyboard and trim off the blank spaces
                value = this.keyboard.readLine();
                value = value.trim();

                // if the menu selection is invalid prompt the user to re-enter it
                if (value.length() < 1) {
                    ErrorView.display(this.getClass().getName(), "Invalid input - you must choose a valid menu option.");
                    continue; // and repeat 
                }
                break; // exit the repetition
            }
        } catch (Exception e) {
            this.console.println("Error reading input: " + e.getMessage());
        }
        return value;
    }
}
