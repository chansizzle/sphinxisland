/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.view;

import java.io.PrintWriter;
import sphinxisland.SphinxIsland;

/**
 *
 * @author sarahbroat
 */
public class ErrorView {

    private static final PrintWriter errorFile = SphinxIsland.getOutFile();
    private static final PrintWriter logFile = SphinxIsland.getLogFile();

    public static void display(String className, String errorMessage) {

        errorFile.println("--------------------------------------------"
                + "\nerror " + errorMessage
                + "--------------------------------------------");

        logFile.println(className + " - " + errorMessage);
    }
}
