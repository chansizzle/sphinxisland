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
/////////////TEST CASES ///////////////////        

        System.out.println("\nTestCase1");
//        ***************
//        * TestCase1
//        ***************
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

        System.out.println("\nTestCase2");
//        ***************
//        * TestCase2
//        ***************
        // input values
        inputOne = 1.0;
        inputTwo = 2.0;
        inputThree = 4.0;

        // expected result
        expResult = -999.0;

        // result of function
        result = instance.calculateSecondRiddle(inputOne, inputTwo, inputThree);

        // comparing expected result and actual result
        assertEquals(expResult, result, 0.0);
        System.out.println("\nTestCase3");
//        ***************
//        * TestCase3
//        ***************
        // input values
        inputOne = -1.0;
        inputTwo = 4.0;
        inputThree = 2.0;

        // expected result
        expResult = -999.0;

        // result of function
        result = instance.calculateSecondRiddle(inputOne, inputTwo, inputThree);

        // comparing expected result and actual result
        assertEquals(expResult, result, 0.0);
        System.out.println("\nTestCase4");
//        ***************
//        * TestCase4
//        ***************
        // input values
        inputOne = 4.0;
        inputTwo = -1.0;
        inputThree = 2.0;

        // expected result
        expResult = -999.0;

        // result of function
        result = instance.calculateSecondRiddle(inputOne, inputTwo, inputThree);

        // comparing expected result and actual result
        assertEquals(expResult, result, 0.0);
        System.out.println("\nTestCase5");
//        ***************
//        * TestCase5
//        ***************
        // input values
        inputOne = 3.0;
        inputTwo = 4.0;
        inputThree = -1.0;

        // expected result
        expResult = -999.0;

        // result of function
        result = instance.calculateSecondRiddle(inputOne, inputTwo, inputThree);

        // comparing expected result and actual result
        assertEquals(expResult, result, 0.0);
        System.out.println("\nTestCase6");
//        ***************
//        * TestCase6
//        ***************
        // input values
        inputOne = 0.0;
        inputTwo = 100.0;
        inputThree = 100.0;

        // expected result
        expResult = 0.0;

        // result of function
        result = instance.calculateSecondRiddle(inputOne, inputTwo, inputThree);

        // comparing expected result and actual result
        assertEquals(expResult, result, 0.0);
        System.out.println("\nTestCase7");
//        ***************
//        * TestCase7
//        ***************
        // input values
        inputOne = 100.0;
        inputTwo = 0.0;
        inputThree = 100.0;

        // expected result
        expResult = 0.0;

        // result of function
        result = instance.calculateSecondRiddle(inputOne, inputTwo, inputThree);

        // comparing expected result and actual result
        assertEquals(expResult, result, 0.0);
        System.out.println("\nTestCase8");
//        ***************
//        * TestCase8
//        ***************
        // input values
        inputOne = 100.0;
        inputTwo = 100.0;
        inputThree = 0.0;

        // expected result
        expResult = 200.0;

        // result of function
        result = instance.calculateSecondRiddle(inputOne, inputTwo, inputThree);

        // comparing expected result and actual result
        assertEquals(expResult, result, 0.0);
/////////////END TEST CASES////////////////////
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

    /**
     * Test of riddlesSolved method, of class RiddleControl.
     */
    @Test
    public void testRiddlesSolved() {
        System.out.println("riddlesSolved");
//        ***************
//        * TestCase1
//        ***************        
        int puzzleOne = 1;
        int puzzleTwo = 1;
        int puzzleThree = 1;
        RiddleControl instance = new RiddleControl();
        int expResult = 0;
        int result = instance.riddlesSolved(puzzleOne, puzzleTwo, puzzleThree);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("\nTestCase1");
//        ***************
//        * TestCase2
//        ***************        
        puzzleOne = 2;
        puzzleTwo = 0;
        puzzleThree = 0;
        expResult = -999;
        result = instance.riddlesSolved(puzzleOne, puzzleTwo, puzzleThree);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("\nTestCase2");
//        ***************
//        * TestCase3
//        ***************        
        puzzleOne = -1;
        puzzleTwo = 1;
        puzzleThree = 1;
        expResult = -999;
        result = instance.riddlesSolved(puzzleOne, puzzleTwo, puzzleThree);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("\nTestCase3");
//        ***************
//        * TestCase4
//        ***************        
        puzzleOne = 1;
        puzzleTwo = 0;
        puzzleThree = 1;
        expResult = 2;
        result = instance.riddlesSolved(puzzleOne, puzzleTwo, puzzleThree);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("\nTestCase4");

    }

}
