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
public class DeliverGems extends View {

    public DeliverGems() {

        super("\n*** Would you like to give the Sphinx your gems? Y/N ***");
    }

    @Override
    public boolean doAction(Object obj) {
        char selection = (char) obj;
        //selection = selection.toUpperCase();
        switch (selection) {
            case 'Y':
            case 'y':
                this.deliverGems(); //deliverGems is in InventoryControl but I have recreated a stub of it below for testing purposes
                break;
            case 'N':
            case 'n':
                System.out.println("\nYou must give the Sphinx the gems to leave her island!");
                break;
            default:
                System.out.println("\ndefault You must give the Sphinx the gems to leave her island!");
            //break;

        }
        return false;
    }

    private void deliverGems() {
        System.out.println("*** deliverGems function called in InventoryControl***");
    }
}
