/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.view;

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
                this.solved();

                break;
            case 'N':
            case 'n':
                this.notSolved();
                break;
            default:
                this.console.println("\ndefault Go find some sphinx and try to solve their riddles.");
                break;
        }
        return false;
    }

    private void solved() {
        int numberRiddlesSolved = 3;
        //this.console.println("How many riddles have you correctly solved?");
        if (numberRiddlesSolved == 3) {
            this.console.println("Board the raft and continue on your journey!");
            this.leave();
        } else if (numberRiddlesSolved != 3) {
            this.console.println("else if.. Go find some sphinx and try to solve their riddles.");
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
        } else {
            this.console.println("else.. Go find some sphinx and try to solve their riddles.");
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
        }
    }

    private void notSolved() {
        this.console.println("\nNo? Go find some sphinx and try to solve their riddles.");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void leave() {
        SailAwayView sail = new SailAwayView();
        sail.sailAway();
        
    }

    @Override
    public Double getDoubleNumber() {
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
