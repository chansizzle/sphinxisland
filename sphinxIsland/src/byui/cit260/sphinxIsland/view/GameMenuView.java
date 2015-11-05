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
public class GameMenuView {

    public String getGAMEMENU() {
        return GAMEMENU;
    }
    
    private final String GAMEMENU = "\n"
            +"\n**********************************************************"
            +"\n* Game Menu                                              *"
            +"\n*\t B - Bag - Inventory within bag (map, gems, etc) *"
            +"\n*\t M - Move to a different location                *"
            +"\n*\t S - View list of Sphinx encountered so far      *"
            +"\n*\t P - View list of puzzles solved so far          *"
            +"\n*\t L - Leave the island by boarding the Raft!      *"
            +"\n*\t H - Help!                                       *"
            +"\n*\t R - Return to the Main Menu                     *"
            +"\n**********************************************************";
    
    void displayGameMenu() {
        //System.out.println("*** displayMenu function in GameMenuView called ***");
        
    char gameselection = ' ';
        do {
            
            System.out.println(GAMEMENU); //display the help menu
            
            String input = this.getInput(); // get the user's menu choice
            gameselection = input.charAt(0); // get the first character of string
            
            this.doAction(gameselection); // do action based on selection
            
        } while (gameselection != 'R' || gameselection != 'r'); // a selection is not "exit"
        
    }
        public String getInput() {
        boolean valid = false; // indicates if the input has been retrieved
        String playersInput = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { // while a valid name has not been retrieved
                
        // prompt for the player's input        
        System.out.println("Enter your in-game menu choice below:");
        
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
     * @param gameselection
     */
    }  
    public void doAction(char gameselection) {
       switch (gameselection) {
            case 'B': // enter bag (inventory) to view map, retrieve gems, etc
            case 'b':
                this.bagInventory();
                break;
            case 'M':
            case 'm':
                this.moveLocations();
                break;
            case 'S':
            case 's':
                this.sphinxEncountered();
                break;
            case 'P':
            case 'p':
                this.puzzlesSolved();
                break;
            case 'L':
            case 'l':
                this.boardTheRaft();
                break;               
            case 'H':
            case 'h':
                this.displayHelpMenu();
                break;
            case 'R': // return to main menu
                case 'r':
                this.displayMenu();
                break;
            default: 
                System.out.println("\n*** Invalid selection, please try again ***");
             //   break;
       }
    }

    private void bagInventory() {
        // display the bag's inventory menu
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.displayInventoryMenu();
    }
    
    private void moveLocations() {
        System.out.println("\n*** moveLocations function called ***");
    }
    
    private void sphinxEncountered() {
        System.out.println("\n*** sphinxEncountered function called ***");
    }
    
    private void puzzlesSolved() {
        System.out.println("\n*** puzzlesSolved function called ***");
    }
    
        private void boardTheRaft() {
        BoardRaftView raftView = new BoardRaftView();
        raftView.displayRaft();
    }
    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView(); //need to device way for help menu in game menu to return to game menu
        helpMenu.displayHelpMenu();
    }
    
    private void displayMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    }
 }

