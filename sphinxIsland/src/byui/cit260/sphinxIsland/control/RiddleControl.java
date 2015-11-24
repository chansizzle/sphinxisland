/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.control;

import java.util.ArrayList;

/**
 *
 * @author sarahbroat
 */
public class RiddleControl {

    public double calculateFirstRiddle(double slope, double xPoint, double yIntercept) {
        if (slope < 0 || slope > 10) { // slope is negative or greater than 10
            return -999;
        }

        if (xPoint < 0 || xPoint > 10) { // x point is negative or greater than 10
            return -999;
        }

        if (yIntercept < 0 || yIntercept > 10) { // y intercept is negative or greater than 10
            return -999;
        }

        double yPoint = slope * xPoint + yIntercept; // y = mx + b

        return yPoint;

    }

    public double calculateSecondRiddle(double inputOne, double inputTwo, double inputThree) {

        if (inputOne < 0 || inputOne > 100 || inputTwo < 0 || inputTwo > 100 || inputThree < 0 || inputThree > 100) {
            return -999;
        }

        if (inputThree > inputOne + inputTwo) {
            return -999;
        }

        double calculatedSum = inputOne + inputTwo - inputThree;

        return calculatedSum;
    }

    public double calculateFinalRiddle(double sphereDiameter) {
        if (sphereDiameter < 0 || sphereDiameter > 10) {
            return -999;
        }

        double radius = sphereDiameter / 2;
        double fraction = 1.33;

        double calculatedSphereVolume = fraction * 3.14 * (Math.pow(radius, 3));
        double calculatedSphereVolumeRounded = (double) Math.round(calculatedSphereVolume * 100d) / 100d;

        return calculatedSphereVolumeRounded;
    }

    public static void riddlesSolved(int puzzleOne, int puzzleTwo, int puzzleThree) {
        //int puzzleOne = 1;
        //int puzzleTwo = 0;
        //int puzzleThree = 1;
        int sumSolved = 0, arrayOfSovledPuzzles[] = {puzzleOne, puzzleTwo, puzzleThree};

        for (int thingy : arrayOfSovledPuzzles){
            sumSolved += thingy;
         }
        System.out.println("The sum of the riddles you have solved is " + sumSolved + ".");
        if (sumSolved == arrayOfSovledPuzzles.length) {
            System.out.println("Good job solving all " + arrayOfSovledPuzzles.length + " riddles!");
        }
        System.out.println("The total number of riddles you need to solve is " + arrayOfSovledPuzzles.length + ".");
        System.out.println("You need to find " + (arrayOfSovledPuzzles.length - sumSolved) + " Sphinx and solve their riddle(s).");
    }
}
