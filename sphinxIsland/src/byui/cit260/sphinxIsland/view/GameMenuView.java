/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.view;

import byui.cit260.sphinxIsland.control.GameControl;
import byui.cit260.sphinxIsland.model.InventoryItem;
import byui.cit260.sphinxIsland.model.Location;
import java.util.Scanner;

/**
 *
 * @author sarahbroat
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n**********************************************************"
                + "\n* Game Menu                                              *"
                + "\n*\t B - Bag - Inventory within bag (map, gems, etc) *"
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
            case 'b':
                this.bagInventory();
                break;
            case 'I':
            case 'i':
                this.displayIsland();
            case 'M':
            case 'm':
                this.moveLocations();
                break;
            case 'S':
            case 's':
                this.checkSphinxesVisited();
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
            case 'Q': // return to main menu
            case 'q':
                return true;
            //this.displayMenu();
            //break;
            default:
                System.out.println("\n*** Invalid selection, please try again ***");
            //   break;
        }
        return false;
    }

        

    private void checkSphinxesVisited() {
        SphinxesVisitedView sphinxesVisited = new SphinxesVisitedView();
        sphinxesVisited.display();
    }

    private void puzzlesSolved() {
        System.out.println("\n*** puzzlesSolved function called ***");
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
        
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items:");
        System.out.println("\nDescription"+ "\t" + " In Stock");
        
        for(InventoryItem inventoryItem : inventory) {
            System.out.println(inventoryItem.getDescription() + "\t   " + inventoryItem.getQuantityInStock());
        }
        
    }

    private void Location[][] displayIsland(locations) {
        Location[][] islandMove;
        //System.out.println("\n*** moveLocations function called ***");
        //MoveToNewLocationView newLocationView = new MoveToNewLocationView();
        //newLocationView.display();
        Location[][] row;
        Location[][] column;
        Location [][] locations = islandMove;
        
        System.out.println("\n***** THE SPHINX' ISLAND *****");
        System.out.println("\n** 0 * 1 * 2 * 3 * 4 **");
        
        for(int i = 0; i < row.length; i++) {
            System.out.println("\n-----------------------");
            for(int j=0; i < column.length; j++) {
                System.out.println("\n  | | | | | |  }"); {
                Location[][] = locations[;
            }
            }
        }
        
        
    }
    }


