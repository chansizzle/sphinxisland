/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.model;

import java.io.Serializable;
/**
 *
 * @author sarahbroat
 */
public class Game implements Serializable{
    // Game class instance variables
    private double totalGems; //changed to double
    private double noSphinxes; //changed to double

    public Game() {
    }

    public double getTotalGems() {
        return totalGems;
    }

    public void setTotalGems(double totalGems) {
        this.totalGems = totalGems;
    }

    public double getNoSphinxes() {
        return noSphinxes;
    }

    public void setNoSphinxes(double noSphinxes) {
        this.noSphinxes = noSphinxes;
    }

    @Override
    public String toString() {
        return "Game{" + "totalGems=" + totalGems + ", noSphinxes=" + noSphinxes + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.totalGems) ^ (Double.doubleToLongBits(this.totalGems) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.noSphinxes) ^ (Double.doubleToLongBits(this.noSphinxes) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalGems) != Double.doubleToLongBits(other.totalGems)) {
            return false;
        }
        if (Double.doubleToLongBits(this.noSphinxes) != Double.doubleToLongBits(other.noSphinxes)) {
            return false;
        }
        return true;
    }
    
}
