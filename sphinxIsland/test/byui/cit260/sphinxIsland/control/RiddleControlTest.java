/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sarahbroat
 */
public class RiddleControlTest {
    
    public RiddleControlTest() {
    }

    /**
     * Test of calculateFirstRiddle method, of class RiddleControl.
     */
    @Test
    public void testCalculateFirstRiddle() {
        System.out.println("calculateFirstRiddle");
        
        // input values
        double slope = 3.0;
        double xPoint = 4.0;
        double yIntercept = 2.0;
        
        // expected result
        double expResult = 14.0;
        
        // new instance variable
        RiddleControl instance = new RiddleControl();
        
        // result of function
        double result = instance.calculateFirstRiddle(slope, xPoint, yIntercept);
        
        // comparing expected result and actual result
        assertEquals(expResult, result, 00.0);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculateSecondRiddle method, of class RiddleControl.
     */
    @Test
    public void testCalculateSecondRiddle() {
        System.out.println("calculateSecondRiddle");
        
        // input values
        double inputOne = 3.0;
        double inputTwo = 4.0;
        double inputThree = 2.0;
        
        // expected result
        double expResult = 5.0;
        
        // new instance variable
        RiddleControl instance = new RiddleControl();
        
        // result of function
        double result = instance.calculateSecondRiddle(inputOne, inputTwo, inputThree);
        
        // comparing expected result and actual result
        assertEquals(expResult, result, 0.0);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculateFinalRiddle method, of class RiddleControl.
     */
    @Test
    public void testCalculateFinalRiddle() {
        System.out.println("calculateFinalRiddle");
        
        // input values
        double sphereDiameter = 4.0;
        
        // expected result
        double expResult = 33.41;

        // new instance variable
        RiddleControl instance = new RiddleControl();
        
        // result of function
        double result = instance.calculateFinalRiddle(sphereDiameter);
        
        // comparing expected result and actual result
        assertEquals(expResult, result, 0.01);
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
