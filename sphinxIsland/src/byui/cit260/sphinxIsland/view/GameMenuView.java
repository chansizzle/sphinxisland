/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.view;

import byui.cit260.sphinxIsland.control.GameControl;
import byui.cit260.sphinxIsland.exceptions.GameControlExceptions;
import byui.cit260.sphinxIsland.exceptions.RiddleControlExceptions;
import byui.cit260.sphinxIsland.model.InventoryItem;
import byui.cit260.sphinxIsland.model.Location;
import byui.cit260.sphinxIsland.model.Island;
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
            case 'Q': // return to main menu
                return true;
            //this.displayMenu();
            //break;
            default:
                System.out.println("\n*** Invalid selection, please try again ***");
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
        System.out.println("\nThe sum of the riddles you have solved is " + sumSolved + ".");
        if (sumSolved == arrayOfSovledPuzzles.length) {
            System.out.println("\nGood job solving all " + arrayOfSovledPuzzles.length + "riddles!");
        }
        System.out.println("\nThe total number of riddles you need to solve is " + arrayOfSovledPuzzles.length + ".");
        System.out.println("\nYou need to find " + (arrayOfSovledPuzzles.length - sumSolved) + " Sphinx and solve their riddle(s).");
    }

    private void boardTheRaft() {
        BoardRaftView raftView = new BoardRaftView();
        raftView.display();
    }

    public void displayMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
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

        System.out.println("\nList of Inventory Items:");
        System.out.println("\nDescription" + "\t" + " In Stock");

        for (InventoryItem inventoryItem : inventory) {
            System.out.println(inventoryItem.getDescription() + "\t   " + inventoryItem.getQuantityInStock());
        }

    }

    private void displayIsland() {
        Island islands = SphinxIsland.getCurrentGame().getIsland();
        Location[][] locations = islands.getLocation();
        int row = islands.getRowCount();
        int column = islands.getColumnCount();

        System.out.println("\n*** THE SPHINX' ISLAND ***");
        System.out.println("\n*   0 | 1 | 2 | 3 | 4 |");
        System.out.println("-----------------------");
        
        for (int i = 0; i < row; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < column; j++) {
                if (locations[i][j].isVisited()) {
                    System.out.print(" X |");
                } else {
                    System.out.print(" ? |");
                }
            }
            System.out.println("\n-----------------------");
        }
    }

    private void moveLocations() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
       System.out.println("The number of sphinxes you have visited is " + vistedSphinxes + ".");
       if (vistedSphinxes == arrayOfSphinxesVisited.length){
           System.out.println("Congratulations, you have visited all of the sphinxes!");
       } else {
       System.out.println("You still need to visit " + (arrayOfSphinxesVisited.length - vistedSphinxes) + " sphinxes.");
            }
        }
    }

