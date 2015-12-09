/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.view;

import byui.cit260.sphinxIsland.control.GameControl;
import byui.cit260.sphinxIsland.exceptions.GameControlExceptions;
import byui.cit260.sphinxIsland.exceptions.ProgramControlExceptions;
import byui.cit260.sphinxIsland.exceptions.RiddleControlExceptions;
import byui.cit260.sphinxIsland.model.InventoryItem;
import byui.cit260.sphinxIsland.model.Location;
import byui.cit260.sphinxIsland.model.Island;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import sphinxisland.SphinxIsland;

/**
 *
 * @author sarahbroat
 */
public class GameMenuView extends View {
    //private Object island;

    public GameMenuView() {
        super("\n"
                + "\n**********************************************************"
                + "\n* Game Menu                                              *"
                + "\n*\t B - Bag - Inventory within bag (map, gems, etc) *"
                + "\n*\t I - Island - See a map of the island            *"
                + "\n*\t M - Move to a different location                *"
                + "\n*\t S - View list of Sphinxes encountered so far    *"
                + "\n*\t P - View list of puzzles solved so far          *"
                + "\n*\t L - Leave the island by boarding the Raft!      *"
                + "\n*\t H - Help!                                       *"
                + "\n*\t X - Print Island Report to log file             *"
                + "\n*\t W - Print Sphinx Report to log file             *"
                + "\n*\t Q - Quit and return to the Main Menu            *"
                + "\n**********************************************************");
    }

    @Override
    public boolean doAction(Object obj) {
        char selection = (char) obj;

        switch (selection) {
            case 'B': // enter bag (inventory) to view map, retrieve gems, etc
                this.bagInventory();
                break;
            case 'I':
                this.displayIsland();
                break;
            case 'M':
                this.moveLocations();
                break;
            case 'S':
                this.SphinxesVisited();
                break;
            case 'P':
                this.puzzlesSolved();
                break;
            case 'L':
                this.boardTheRaft();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'X':
                this.printIslandReport();
                break;
            case 'W':
        {
            try {
                this.printSphinxReport();
            } catch (ProgramControlExceptions ex) {
                Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case 'Q': // return to main menu
                return true;
            //this.displayMenu();
            //break;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection, please try again ***");
            //   break;
        }
        return false;
    }

    private void puzzlesSolved() {
        int puzzleOne = 1;
        int puzzleTwo = 0;
        int puzzleThree = 1;
        int sumSolved = 0, arrayOfSovledPuzzles[] = {puzzleOne, puzzleTwo, puzzleThree};

        for (int i : arrayOfSovledPuzzles) {
            sumSolved += i;
        }
        this.console.println("\nThe sum of the riddles you have solved is " + sumSolved + ".");
        if (sumSolved == arrayOfSovledPuzzles.length) {
            this.console.println("\nGood job solving all " + arrayOfSovledPuzzles.length + "riddles!");
        }
        this.console.println("\nThe total number of riddles you need to solve is " + arrayOfSovledPuzzles.length + ".");
        this.console.println("\nYou need to find " + (arrayOfSovledPuzzles.length - sumSolved) + " Sphinx and solve their riddle(s).");
    }

    private void boardTheRaft() {
        BoardRaftView raftView = new BoardRaftView();
        raftView.display();
    }

    public void displayMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
    public void printIslandReport() {
        this.console.println("This is where I'm putting the code to print island contents/map.");
    }

    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView(); //need to device way for help menu in game menu to return to game menu
        helpMenu.display();
    }

    public void bagInventory() {
        // display the bag's inventory menu
        //InventoryMenuView inventoryMenu = new InventoryMenuView();
        //inventoryMenu.display();

        InventoryItem[] inventory = null;
        try {
            inventory = GameControl.getSortedInventoryList();
        } catch (GameControlExceptions ex) {
            Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.console.println("\nList of Inventory Items:");
        this.console.println("\nDescription" + "\t" + " In Stock");

        for (InventoryItem inventoryItem : inventory) {
            this.console.println(inventoryItem.getDescription() + "\t   " + inventoryItem.getQuantityInStock());
        }

    }

    private void displayIsland() {
        Island islands = SphinxIsland.getCurrentGame().getIsland();
        Location[][] locations = islands.getLocation();
        int row = islands.getRowCount();
        int column = islands.getColumnCount();

        this.console.println("\n*** THE SPHINX' ISLAND ***");
        this.console.println("\n*   0 | 1 | 2 | 3 | 4 |");
        this.console.println("-----------------------");

        for (int i = 0; i < row; i++) {
            this.console.print(i + " |");
            for (int j = 0; j < column; j++) {
                if (locations[i][j].isVisited()) {
                    this.console.print(" X |");
                } else {
                    this.console.print(" ? |");
                }
            }
            this.console.println("\n-----------------------");
        }
    }

    private void moveLocations() {
        this.console.println("Not supported yet."); 
    }

    @Override
    public Double getDoubleNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void SphinxesVisited() {
        int sphinxOne = 1;
        int sphinxTwo = 0;
        int finalSphinx = 1;

        int vistedSphinxes = 0, arrayOfSphinxesVisited[] = {sphinxOne, sphinxTwo, finalSphinx};

        for (int sphinx : arrayOfSphinxesVisited) {
            vistedSphinxes += sphinx;
        }
        this.console.println("The number of sphinxes you have visited is " + vistedSphinxes + ".");
        if (vistedSphinxes == arrayOfSphinxesVisited.length) {
            this.console.println("Congratulations, you have visited all of the sphinxes!");
        } else {
            this.console.println("You still need to visit " + (arrayOfSphinxesVisited.length - vistedSphinxes) + " sphinxes.");
        }
    }

    private void printSphinxReport() throws ProgramControlExceptions {
        this.console.println("\nEnter the file name Sphinx Log File.");
        String filePath = this.getInput();
        try {
            //GameControl.getSavedGame(filePath);
            //Location.
            this.console.printf("\nSphinx Log File printed "+ filePath);
        } catch (Exception e) {
            ErrorView.display("GameMenuView", e.getMessage());
        }
    }
}

