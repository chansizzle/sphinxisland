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
    public Double getDoubleNumber() {
        Double number = null;
        return number;
    }
    
    @Override
    public boolean doAction(Object obj) {
        char selection = (char) obj;
        switch (selection) {
            case 'Y':
            case 'y':
                //this.solved();
                int numberRiddlesSolved = 3;
                //this.console.println("How many riddles have you correctly solved?");
                if (numberRiddlesSolved == 3) {
                    this.console.println("Board the raft and continue on your journey!");
                } else if (numberRiddlesSolved != 3) {
                    this.console.println("else if.. Go find some sphinx and try to solve their riddles.");
                } else {
                    this.console.println("else.. Go find some sphinx and try to solve their riddles.");
                }
                break;
            case 'N':
            case 'n':
                this.console.println("\nNo? Go find some sphinx and try to solve their riddles.");
                break;
            default:
                this.console.println("\ndefault Go find some sphinx and try to solve their riddles.");
            //break;
        }
        return false;
    }
}
