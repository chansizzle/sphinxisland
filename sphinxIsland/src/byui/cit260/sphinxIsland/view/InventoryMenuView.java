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
        return MENU;
    }

    private final String MENU = "\n"
            + "\n**********************************************************"
            + "\n* Inventory Bag                                           *"
            + "\n*\t S - Store item                                        *"
            + "\n*\t F - Fetch item                                        *"
            + "\n*\t R - Quit and return to the Game Menu                  *"
            + "\n**********************************************************";

    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        switch (value) {
            case "S": // save an item in inventory
                this.storeInventoryItem();
                break;
            case "F":
                this.fetchInventoryItem(); // fetch an item from inventory
                break;
            case "Q": // return to game menu
                this.display();
                break;
            default:
                System.out.println("\n*** Invalid selection, please try again ***");
            //   break;
        }
        return false;
    }

    private void storeInventoryItem() {
        System.out.println("\n*** storeInventoryItem function called ***");
    }

    private void fetchInventoryItem() {
        System.out.println("\n*** fetchInventoryItem function called ***");
    }

    public void display() {
        HelpMenuView helpMenu = new HelpMenuView(); //need to device way for help menu in game menu to return to game menu
        helpMenu.display();
    }

    public void displayMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

}
