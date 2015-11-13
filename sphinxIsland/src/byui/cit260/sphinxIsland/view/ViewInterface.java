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
    public interface ViewInterface {
        public void display();
        public void getInput();
        public boolean doAction(Object obj);
    
    public abstract class View implements ViewInterface {
        
    private String promptMessage;
    
    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    @Override
        public void display() {
        String value = "";
        boolean done = false;
        do {            
            System.out.println(this.promptMessage); //display the help menu
            value = this.getInput();
            done = this.doAction(value);
            
        } while (!done); // a selection is not "exit"  
    }
        
    @Override
        public String getInput() {
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        boolean valid = false; // indicates if the input has been retrieved
        String value = null;        
        
        while(!valid) { // while a valid name has not been retrieved
        
        // get the input from the keyboard and trim off the blank spaces
        value = keyboard.nextLine();
        value = value.trim();
        
        // if the menu selection is invalid prompt the user to re-enter it
        if (value.length() < 1) {
            System.out.println("Invalid input - you must choose a valid input.");
            continue; // and repeat 
        }
        break; // exit the repetition
    }
    return value; 

    }  
    

    @Override 
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        return value;
    }    
       
    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }  
     }    
    }

