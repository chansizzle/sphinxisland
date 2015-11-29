/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.view;

/**
 *
 * @author sarahbroat
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
                + "\n---------------------------------------------------------------"
                + "\n| Help Menu                                                    |"
                + "\n|\t G - What is the goal of the game?                     |"
                + "\n|\t M - How do I move?                                    |"
                + "\n|\t I - How to store, access, and retrieve inventory items|"
                + "\n|\t S - How to view list of Sphinx sisters encountered    |"
                + "\n|\t P - How to view list of puzzles solved                |"
                + "\n|\t Q - Quit and return to the Main Menu                  |"
                + "\n---------------------------------------------------------------");
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
            case 'G': // goal of the game
                this.gameGoalHelp();
                break;
            case 'M': // move help
               this.moveHelp();
                break;
            case 'I': // inventory help
                this.inventoryHelp();
                break;
            case 'S': //sphinx help
                this.sphinxHelp();
                break;
            //sphinx help
            case 'P': // puzzle help
                this.puzzleHelp();
                break;
            case 'Q': // return to main menu
                this.displayMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection, please try again ***");
            //   break;
        }
        return false;
    }

    private void gameGoalHelp() {
        //System.out.println("*** gameGoalHelp function called ***");
        //2 DIFFERENT WAYS TO DO THIS: 1=BY CALLING A MENU UP ABOVE OR 2=BY DOING A PRINT LINE RIGHT HERE
        // method #1: System.out.println(GAMEGOALHELP);
        System.out.println("\n\n===========================================================================================================================");
        System.out.println("\nTHE GOAL OF THE SPHINX ISLAND GAME");
        System.out.println("\nThe goal of this game is traverse the entire island looking for items that will help you in your journey, and help you to ultimately leave the islane.");
        System.out.println("\n\nYou will encounter a few Sphinx sisters who will offer you gems in exchange for successfully decyphering their riddles.");
        System.out.println("The gems will help you gain passage off of the island. If you incorrectly decypher any of the riddles, you will be turned to stone.");
        System.out.println("\n\nGood luck not being dead or turned to stone like a big stony loser.");
        System.out.println("\n============================================================================================================================");
    }

    private void moveHelp() {
        System.out.println("\n\n===========================================================================================================================");
        System.out.println("\nMOVING AROUND THE SPHINX ISLAND");
        System.out.println("\nTo move from location to location in exploring the sphinx island you will use the arrow keys. The UP arrow key to move North/forward,");
        System.out.println("\nthe RIGHT arrow key to move East/right, the DOWN arrrow key to move South/back, and the LEFT arror key to move West/left.");
        System.out.println("\n===========================================================================================================================");
    }

    public void inventoryHelp() {
        System.out.println("\n\n===========================================================================================================================");
        System.out.println("\nINVENTORY VIEWING AND USE");
        System.out.println("\nYou have a bag that you may store items collected on the island. Use the 'TBD' key to view inventory and the 'TBD' key to retrieve/use an inventory item for use.");
        System.out.println("\nSaving items to inventory will be a prompted with Yes/No (Y key and N key) choices.");
        System.out.println("\n\n===========================================================================================================================");
    }

    private void sphinxHelp() {
        System.out.println("\n\n===========================================================================================================================");
        System.out.println("\nSPHINX HELP");
        System.out.println("\n\nTo view a list of the sphinx encountered press the 'TBD' key.");
        System.out.println("\n\n===========================================================================================================================");
    }

    private void puzzleHelp() {
        System.out.println("\n\n===========================================================================================================================");
        System.out.println("\nPUZZLES HELP");
        System.out.println("\nEach of the sphinxes will present you with riddles in the form of mathmetical calculations to perform.");
        System.out.println("\nUse a calculator or a piece of paper and a pencil so you don't get turned to stone.");
        System.out.println("\nOnce you accept a ridlde challenge you must complete it.");
        System.out.println("\n\nTo view a list of puzzles completed press the 'TBD' key.");
        System.out.println("\n\n===========================================================================================================================");
    }

    public void displayMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
}
