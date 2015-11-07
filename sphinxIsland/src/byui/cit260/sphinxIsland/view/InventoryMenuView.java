/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.view;

import java.util.Scanner;

/**
 *
 * @author chandlel
 */
public class InventoryMenuView {

    
    public String getGINVENTORYMENU() {
        return INVENTORYMENU;
    }
    
    private final String INVENTORYMENU = "\n"
            +"\n**********************************************************"
            +"\n* Inventory Bag                                           *"
            +"\n*\t S - Store item                                        *"
            +"\n*\t F - Fetch item                                        *"
            +"\n*\t R - Return to the Game Menu                           *"
            +"\n**********************************************************";
    
    void displayInventoryMenu() {
        //System.out.println("*** displayInventoryMenu function in InventoryMenuView called ***");
        
    char inventoryselection = ' ';
        do {
            
            System.out.println(INVENTORYMENU); //display the help menu
            
            String input = this.getInput(); // get the user's menu choice
            inventoryselection = input.charAt(0); // get the first character of string
            
            this.doAction(inventoryselection); // do action based on selection
            
        } while (inventoryselection != 'R' || inventoryselection != 'r'); // a selection is not "exit"
        
    }
        public String getInput() {
        boolean valid = false; // indicates if the input has been retrieved
        String playersInput = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { // while a valid name has not been retrieved
                
        // prompt for the player's input        
        System.out.println("Enter your inventory bag choice below:");
        
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
     * @param inventoryselection
     */
    }  
    public void doAction(char inventoryselection) {
       switch (inventoryselection) {
            case 'S': // save an item in inventory
            case 's':
                this.storeInventoryItem();
                break;
            case 'F':
            case 'f':
                this.fetchInventoryItem(); // fetch an item from inventory
                break;
            case 'R': // return to game menu
                case 'r':
                this.displayMenu();
                break;
            default: 
                System.out.println("\n*** Invalid selection, please try again ***");
             //   break;
       }
    }

    private void storeInventoryItem() {
        System.out.println("\n*** storeInventoryItem function called ***");
    }

    private void fetchInventoryItem() {
        System.out.println("\n*** fetchInventoryItem function called ***");
    }

    private void displayMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    
    
}
