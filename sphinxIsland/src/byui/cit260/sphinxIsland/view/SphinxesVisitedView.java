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
public class SphinxesVisitedView {

    public void displaySphinxesVisited() {
        System.out.println("\n*** sphinxesVisited function called ***");

        char userselection = ' ';
        do {

            System.out.println("Would you like to see how many sphinxes you have visited? Y/N");

            String input = this.getInput(); // get the user's menu choice
            userselection = input.charAt(0); // get the first character of string

            this.doAction(userselection); // do action based on selection

        } while (userselection != 'Y' && userselection != 'y' && userselection != 'N' && userselection != 'n');
    }

    public String getInput() {
        boolean valid = false; // indicates if the input has been retrieved
        String playersInput = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream

        while (!valid) { // while a valid name has not been retrieved                

            // get the input from the keyboard and trim off the blank spaces
            playersInput = keyboard.nextLine();
            playersInput = playersInput.trim();

            // if the menu selection is invalid prompt the user to re-enter it
            if (playersInput.length() < 1 || playersInput.length() > 1) {
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
            case 'Y':
            case 'y':
                //this.visited();
                int numberSphinxesVisited = 3;
                //System.out.println("How many riddles have you correctly solved?");
                if (numberSphinxesVisited == 3) {
                    System.out.println("Congratulations! You have outwitted all of the sphinxes on The Sphinx' Island!");
                } else if (numberSphinxesVisited == 2) {
                    System.out.println("You have bested two of the sphinxes, only one left to beat. Can you do it?");
                } else if (numberSphinxesVisited == 1) {
                    System.out.println("You have only outsmarted one sphinx so far. Better get a move on unless you want to become a statue!");
                } else if (numberSphinxesVisited == 0) {
                    System.out.println("You haven't beaten any sphinxes yet- what are you waiting for?");
                } else {
                    System.out.println("Invalid number of sphinxes.");
                }
                break;
            case 'N':
            case 'n':
                System.out.println("\nNo? Okay, then return to the game and get back to solving those riddles!");
                break;
            default:
                System.out.println("\ndefault No? Okay, then return to the game and get back to solving those riddles!");
            //break;

        }
    }
}
