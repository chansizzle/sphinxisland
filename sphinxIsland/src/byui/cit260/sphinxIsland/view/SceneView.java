/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.view;

import byui.cit260.sphinxIsland.model.Island;
import byui.cit260.sphinxIsland.model.Location;
import byui.cit260.sphinxIsland.model.Scene;

/**
 *
 * @author chansizzle
 */
public class SceneView {

    public String getMENU() {
        return MENU;
    }
    private final String MENU = "\nAre you ready for this scene?\t"
            + "Y/N";
    
    public boolean doAction(Object obj) {
        String selection = (String) obj;
        selection = selection.toUpperCase();
        
        switch (selection) {
            case "Y":
            case "y":
                this.yesIDo();
                break;
            case "N":
            case "n":
                System.out.println("\nNo? Okay, then go somewhere else, or hang out here for awhile.\n\n");
                GameMenuView gameMenu = new GameMenuView();
                gameMenu.display();
                break;
            default: 
                System.out.println("\n*** Invalid selection, please try again ***");
        }
        return true;
    }
    void whatScene(Location location) {
        System.out.println(MENU);
    }
    private void yesIDo() {
        
    }
}
