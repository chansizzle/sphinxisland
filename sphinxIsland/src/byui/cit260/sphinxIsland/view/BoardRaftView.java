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
public class BoardRaftView extends View {

    public BoardRaftView() {

        super("Did you solve all 3 riddles? Y/N");
    }

    @Override
    public boolean doAction(Object obj) {
        char selection = (char) obj;
        switch (selection) {
            case 'Y':
            case 'y':
                //this.solved();
                int numberRiddlesSolved = 3;
                //System.out.println("How many riddles have you correctly solved?");
                if (numberRiddlesSolved == 3) {
                    System.out.println("Board the raft and continue on your journey!");
                } else if (numberRiddlesSolved != 3) {
                    System.out.println("else if.. Go find some sphinx and try to solve their riddles.");
                } else {
                    System.out.println("else.. Go find some sphinx and try to solve their riddles.");
                }
                break;
            case 'N':
            case 'n':
                System.out.println("\nNo? Go find some sphinx and try to solve their riddles.");
                break;
            default:
                System.out.println("\ndefault Go find some sphinx and try to solve their riddles.");
            //break;
        }
        return false;
    }
}
