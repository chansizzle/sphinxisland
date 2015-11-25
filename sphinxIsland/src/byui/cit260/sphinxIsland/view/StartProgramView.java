/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.view;

import byui.cit260.sphinxIsland.control.ProgramControl;
import byui.cit260.sphinxIsland.model.Player;
import java.util.Scanner;

/**
 *
 * @author sarahbroat
 */
public class StartProgramView {

    public StartProgramView() {  //changed from startProgramView to StartProgramView and removed void
    }

    public void startProgram() {

        // display the banner screen
        this.displayBanner();

        // prompt the player to enter their name and retrieve player name
        String playersName = this.getPlayersName();

        // create and save the player object
        Player player = ProgramControl.createPlayer(playersName);

        // display a personalized welcome message
        this.displayWelcomeMessage(player);

        // display the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    public void displayBanner() {
        System.out.println("\n\n******************************************");

        System.out.println("*                                        *");

        System.out.println("* Welcome to the Sphinx' Island!         *"
                + "\n* In this game you will solve a          *"
                + "\n* series of riddles give to you by       *"
                + "\n* a cunning Sphinx and her sisters.      *");

        System.out.println("*                                        *"
                + "\n* You are traveling the world in pursuit *"
                + "\n* of knowledge and after a ferocious *"
                + "\n* storm have washed ashore on a strange *"
                + "\n* tropical island. You have no possessions, *"
                + "\n* but have been blessed with a sharp mind. *"
                + "\n* To leave the island and continue your *"
                + "\n* travels, you must successfully best three *"
                + "\n* sphinxes in a battle of wits and collect *"
                + "\n* the precious gems that they will give you *"
                + "\n* as proof of you intellectual mastery to *"
                + "\n* exchange for a raft that will take you *"
                + "\n* safely from their clutches. If you fail, *"
                + "\n* you will be turned to stone and kept as *"
                + "\n* a monument on their island for all eternity.*");

        System.out.println("\n*                                             *"
                + "\n* Good luck- hope you're feeling clever today!*"
                + "\n*                                            *");

        System.out.println("\n\n*****************************************");

    }

    private String getPlayersName() {
        boolean valid = false; // indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); // keyboard input stream

        while (!valid) { // while a valid name has not been retrieved

            // prompt for the player's name        
            System.out.println("Enter your name below:");

            // get the name from the keyboard and trim off the blank spaces
            playersName = keyboard.nextLine();
            playersName = playersName.trim();

            // if the name is invalid (less than 2 characters in length) prompt the user to re-enter it
            if (playersName.length() < 2) {
                System.out.println("Invalid name - your name must be more than 2 characters.");
                continue; // and repeat 
            }
            break; // exit the repetition
        }

        return playersName; // return the name
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n=========================================");
        System.out.println("\nWelcome to the game, " + player.getName() + ".");
        System.out.println("\nEnjoy your stay on the Sphinx' Island!");
        System.out.println("\n=========================================");
    }
}
