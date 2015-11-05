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
class BoardRaftView {

    public void displayRaft() {
        System.out.println("\n*** puzzlesSolved function called ***");
    
    char userselection = ' ';
        do {
            
            System.out.println("Did you solve all 3 riddles? Y/N"); //display the help menu
            
            String input = this.getInput(); // get the user's menu choice
            userselection = input.charAt(0); // get the first character of string
            
            this.doAction(userselection); // do action based on selection
            
        } while (userselection != 'Y' || userselection != 'y' || userselection != 'N' || userselection != 'n');
        //} while (userselection != 'E' || selection != 'e'); // a selection is not "exit"
    }
    
    public String getInput() {
        boolean valid = false; // indicates if the input has been retrieved
        String playersInput = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream
        
        while(!valid) { // while a valid name has not been retrieved
                
        
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
     * @param userselection
     */
    }
    public void doAction(char userselection) {
       switch (userselection) {
            case 'Y': // start a new game
            case 'y':
                int riddlesSolved = 3;
                if(riddlesSolved == 3){
                  System.out.println("Board the raft and continue on your journey!");
                }
                else if (riddlesSolved < 3){
                  System.out.println("Go find some sphinx and try to solve their riddles.");
                   }
                else {
                  System.out.println("Go find some sphinx and try to solve their riddles.");
                   }
                break;
            case 'N': // exit the program
            case 'n':
                System.out.println("\nGo find some sphinx and try to solve their riddles.");
                break;
            default:
            System.out.println("\nGo find some sphinx and try to solve their riddles.");
                //break;
       }
    }
    
}