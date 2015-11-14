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
public class GameMenuView extends View {

    public GameMenuView() {
       
        super("\n"
            +"\n**********************************************************"
            +"\n* Game Menu                                              *"
            +"\n*\t B - Bag - Inventory within bag (map, gems, etc) *"
            +"\n*\t M - Move to a different location                *"
            +"\n*\t S - View list of Sphinxes encountered so far    *"
            +"\n*\t P - View list of puzzles solved so far          *"
            +"\n*\t L - Leave the island by boarding the Raft!      *"
            +"\n*\t H - Help!                                       *"
            +"\n*\t Q - Quit and return to the Main Menu            *"
            +"\n**********************************************************");
    }
    

    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();

        switch (value) {
            case "B": // enter bag (inventory) to view map, retrieve gems, etc
            case "b":
                this.bagInventory();
                break;
            case "M":
            case "m":
                this.moveLocations();
                break;
            case "S":
            case "s":
                this.checkSphinxesVisited();
                break;
            case "P":
            case "p":
                this.puzzlesSolved();
                break;
            case "L":
            case "l":
                this.boardTheRaft();
                break;
            case "H":
            case "h":
                this.display();
                break;
            case "Q": // return to main menu
            case "q":
                this.display();
                break;
            default:
                System.out.println("\n*** Invalid selection, please try again ***");
            //   break;
        }
        return false;
    }

    private void moveLocations() {
        System.out.println("\n*** moveLocations function called ***");
    }

    private void checkSphinxesVisited() {
        SphinxesVisitedView sphinxesVisited = new SphinxesVisitedView();
        sphinxesVisited.displaySphinxesVisited();
    }

    private void puzzlesSolved() {
        System.out.println("\n*** puzzlesSolved function called ***");
    }

    private void boardTheRaft() {
        BoardRaftView raftView = new BoardRaftView();
        raftView.displayRaft();
    }

    public void displayMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    public void display() {
        HelpMenuView helpMenu = new HelpMenuView(); //need to device way for help menu in game menu to return to game menu
        helpMenu.display();
    }

    public void bagInventory() {
        // display the bag's inventory menu
        InventoryMenuView inventoryMenu = new InventoryMenuView();
        inventoryMenu.display();
    }

}
