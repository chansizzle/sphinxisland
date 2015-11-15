/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.view;

import byui.cit260.sphinxIsland.control.GameControl;
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
            +"\n Q to quite moving and return to the game menu.");
    }
    
   @Override  
public boolean doAction(Object obj) {
char selection = (char) obj;  
    switch (selection) {
        case 'N':
        case 'n':
        case 'U':
        case 'u':
        case '8':
            System.out.println("\nGoing North/Up function called");
        break;
        case 'E':
        case 'e':
        case 'R':
        case 'r':
        case '6':
            System.out.println("\nGoing East/Right function called");
        break;
        case 'S':
        case 's':
        case 'D':
        case 'd':
        case '2':
            System.out.println("\nGoing South/Down function called");
        break;
        case 'W':
        case 'w':
        case 'L':
        case 'l':
        case '4':
            System.out.println("\nGoing West/Left function called");
        break;
        case 'Q':
        case 'q':
            return true;
            //GameControl.createNewGame(SphinxIsland.getPlayer());
            //GameMenuView gameMenu = new GameMenuView();
            //gameMenu.display();
        default:
            System.out.println("\ndefault Go find some sphinx and try to solve their riddles.");
        //break;
    }
        return false;
}
}