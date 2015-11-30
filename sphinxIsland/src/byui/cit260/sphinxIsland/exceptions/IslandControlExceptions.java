/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.exceptions;

/**
 *
 * @author chansizzle
 */
public class IslandControlExceptions extends Exception {

    public IslandControlExceptions() {
    }

    public IslandControlExceptions(String message) {
        super(message);
    }

    public IslandControlExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public IslandControlExceptions(Throwable cause) {
        super(cause);
    }

    public IslandControlExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
