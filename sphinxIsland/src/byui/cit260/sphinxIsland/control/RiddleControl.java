/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.control;

import byui.cit260.sphinxIsland.exceptions.RiddleControlExceptions;

/**
 *
 * @author sarahbroat
 */
public class RiddleControl {

    public double calculateFirstRiddle(double slope, double xPoint, double yIntercept) throws RiddleControlExceptions {
        if (slope < 0 || slope > 10) { // slope is negative or greater than 10
            throw new RiddleControlExceptions("Number has to be between 0-10, inclusive.");
        }

        if (xPoint < 0 || xPoint > 10) { // x point is negative or greater than 10
            throw new RiddleControlExceptions("Number has to be between 0-10, inclusive.");
        }

        if (yIntercept < 0 || yIntercept > 10) { // y intercept is negative or greater than 10
            throw new RiddleControlExceptions("Number has to be between 0-10, inclusive.");
        }

        double yPoint = slope * xPoint + yIntercept; // y = mx + b

        return yPoint;

    }

    public double calculateSecondRiddle(double inputOne, double inputTwo, double inputThree) throws RiddleControlExceptions {

        if (inputOne < 0 || inputOne > 100 || inputTwo < 0 || inputTwo > 100 || inputThree < 0 || inputThree > 100) {
            throw new RiddleControlExceptions("Number has to be between 0-100, inclusive.");
        }

        if (inputThree > inputOne + inputTwo) {
            throw new RiddleControlExceptions("The 3rd input must be less than the sum of the 1st 2 inputs.");
        }

        double calculatedSum = inputOne + inputTwo - inputThree;

        return calculatedSum;
    }

    public double calculateFinalRiddle(double sphereDiameter) throws RiddleControlExceptions {
        if (sphereDiameter < 0 || sphereDiameter > 10) {
            throw new RiddleControlExceptions("Number has to be between 0-10, inclusive.");
        }

        double radius = sphereDiameter / 2;
        double fraction = 1.33;

        double calculatedSphereVolume = fraction * 3.14 * (Math.pow(radius, 3));
        double calculatedSphereVolumeRounded = (double) Math.round(calculatedSphereVolume * 100d) / 100d;

        return calculatedSphereVolumeRounded;
    }

    public static void riddlesSolved(int puzzleOne, int puzzleTwo, int puzzleThree) throws RiddleControlExceptions {
        //int puzzleOne = 1;
        //int puzzleTwo = 0;
        //int puzzleThree = 1;
        int sumSolved = 0, arrayOfSovledPuzzles[] = {puzzleOne, puzzleTwo, puzzleThree};

        for (int chandlervariable : arrayOfSovledPuzzles) {
            sumSolved += chandlervariable;
        }
        System.out.println("The sum of the riddles you have solved is " + sumSolved + ".");
        if (sumSolved == arrayOfSovledPuzzles.length) {
            System.out.println("Good job solving all " + arrayOfSovledPuzzles.length + " riddles!");
        }
        System.out.println("The total number of riddles you need to solve is " + arrayOfSovledPuzzles.length + ".");
        System.out.println("You need to find " + (arrayOfSovledPuzzles.length - sumSolved) + " Sphinx and solve their riddle(s).");
    }

    public static void sphinxesVisited(int sphinxOne, int sphinxTwo, int finalSphinx) throws RiddleControlExceptions {
        //int sphinxOne = 1;
        //int sphinxTwo = 0;
        //int finalSphinx = 1;

        int vistedSphinxes = 0, arrayOfSphinxesVisited[] = {sphinxOne, sphinxTwo, finalSphinx};

        for (int sphinx : arrayOfSphinxesVisited) {
            vistedSphinxes += sphinx;
        }
        System.out.println("The number of sphinxes you have visited is " + vistedSphinxes + ".");
        if (vistedSphinxes == arrayOfSphinxesVisited.length) {
            System.out.println("Congratulations, you have visited all of the sphinxes!");
        } else {
            System.out.println("You still need to visit " + (arrayOfSphinxesVisited.length - vistedSphinxes) + " sphinxes.");
        }
    }

}
