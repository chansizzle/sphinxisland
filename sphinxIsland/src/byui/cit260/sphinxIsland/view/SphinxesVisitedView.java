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
public class SphinxesVisitedView extends View {

    public SphinxesVisitedView() {
        
        super("\n*** sphinxesVisited function called ***");
    }

        

    @Override
     public boolean doAction(Object obj) {
        char selection = (char) obj;
        //selection = selection.toUpperCase();
        switch (selection) {
            case 'Y':
            case 'y':
                //this.visited();
                int numberSphinxesVisited = 3;
                //System.out.println("How many riddles have you correctly solved?");
                if (numberSphinxesVisited == 3) {
                    System.out.println("Congratulations! You have outwitted all of the sphinxes on The Sphinx' Island!");
                } else if (numberSphinxesVisited == 2) {
                    System.out.println("You have bested two of the sphinxes, only one left to beat. Can you do it?");
                } else if (numberSphinxesVisited == 1) {
                    System.out.println("You have only outsmarted one sphinx so far. Better get a move on unless you want to become a statue!");
                } else if (numberSphinxesVisited == 0) {
                    System.out.println("You haven't beaten any sphinxes yet- what are you waiting for?");
                } else {
                    System.out.println("Invalid number of sphinxes.");
                }
                break;
            case 'N':
            case 'n':
                System.out.println("\nNo? Okay, then return to the game and get back to solving those riddles!");
                break;
            default:
                System.out.println("\ndefault No? Okay, then return to the game and get back to solving those riddles!");
            //break;

        }
        return false;
    }
}
