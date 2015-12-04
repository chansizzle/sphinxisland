/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.view;

import byui.cit260.sphinxIsland.control.GameControl;
import java.util.Scanner;
import sphinxisland.SphinxIsland;

/**
 *
 * @author chansizzle
 */
public class MoveToNewLocationView extends View {

    public MoveToNewLocationView() {
        super("You have chosen to move to a different location on the island."
                + "\nWhich direction you want to go?"
                + "\n N/U/8 North/Up"
                + "\n E/R/6 East/Right"
                + "\n S/D/2 South/Down"
                + "\n W/L/4 West/Left"
                + "\n Q to quite moving and return to the game menu.");
    }

    @Override
    public Double getDoubleNumber() {
        Double number = null;

        while (number == null) { // while a valid name has not been retrieved

            String value = this.getInput();
            value = value.trim().toUpperCase();

            if (value.equals("Q")) {
                break; // exit the repetition
            }
            try {
                number = Double.parseDouble(value);
            } catch (NumberFormatException nf) {
                ErrorView.display(this.getClass().getName(), "\nYou must enter a valid number. Try again or hit 'Q' to quit.");
            }
        }
        return number;
    }

    @Override
    public boolean doAction(Object obj) {
        char selection = (char) obj;
        switch (selection) {
            case 'N':
            case 'U':
            case '8':
                this.console.println("\nGoing North/Up function called");
                break;
            case 'E':
            case 'R':
            case '6':
                this.console.println("\nGoing East/Right function called");
                break;
            case 'S':
            case 'D':
            case '2':
                this.console.println("\nGoing South/Down function called");
                break;
            case 'W':
            case 'L':
            case '4':
                this.console.println("\nGoing West/Left function called");
                break;
            case 'Q':
                return true;
            //GameControl.createNewGame(SphinxIsland.getPlayer());
            //GameMenuView gameMenu = new GameMenuView();
            //gameMenu.display();
            default:
                this.console.println("\ndefault Go find some sphinx and try to solve their riddles.");
            //break;
        }
        return false;
    }
}
