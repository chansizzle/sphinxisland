/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.view;

import byui.cit260.sphinxIsland.control.ProgramControl;
import byui.cit260.sphinxIsland.exceptions.ProgramControlExceptions;
import byui.cit260.sphinxIsland.model.Player;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sarahbroat
 */
public class StartProgramView extends View {

    public StartProgramView() {
        super("\n\n******************************************"
                + "*                                        *"
                + "* Welcome to the Sphinx' Island!         *"
                + "\n* In this game you will solve a          *"
                + "\n* series of riddles give to you by       *"
                + "\n* a cunning Sphinx and her sisters.      *"
                + "*                                        *"
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
                + "\n* a monument on their island for all eternity.*"
                + "\n*                                             *"
                + "\n* Good luck- hope you're feeling clever today!*"
                + "\n*                                            *"
                + "\n\n*****************************************"
        );
    }

    /**
     *
     * @throws ProgramControlExceptions
     */
    public void startProgram() throws ProgramControlExceptions {

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
        this.console.println("\n\n******************************************");

        this.console.println("*                                        *");

        this.console.println("* Welcome to the Sphinx' Island!         *"
                + "\n* In this game you will solve a          *"
                + "\n* series of riddles give to you by       *"
                + "\n* a cunning Sphinx and her sisters.      *");

        this.console.println("*                                        *"
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

        this.console.println("\n*                                             *"
                + "\n* Good luck- hope you're feeling clever today!*"
                + "\n*                                            *");

        this.console.println("\n\n*****************************************");

    }

    private String getPlayersName() {
        boolean valid = false; // indicates if the name has been retrieved
        String playersName = null;

        while (!valid) { // while a valid name has not been retrieved

            // prompt for the player's name        
            this.console.println("Enter your name below:");

            try {
                // get the name from the keyboard and trim off the blank spaces
                playersName = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(StartProgramView.class.getName()).log(Level.SEVERE, null, ex);
            }
            playersName = playersName.trim();

            // if the name is invalid (less than 2 characters in length) prompt the user to re-enter it
            if (playersName.length() < 2) {
                ErrorView.display(this.getClass().getName(), "Invalid name - your name must be more than 2 characters.");
                continue; // and repeat 
            }
            break; // exit the repetition
        }

        return playersName; // return the name
    }

    private void displayWelcomeMessage(Player player) {
        this.console.println("\n=========================================");
        this.console.println("\nWelcome to the game, " + player.getName() + ".");
        this.console.println("\nEnjoy your stay on the Sphinx' Island!");
        this.console.println("\n=========================================");
    }

    @Override
    public Double getDoubleNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
