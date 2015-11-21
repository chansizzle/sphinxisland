/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.sphinxIsland.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author sarahbroat
 */
public class Riddle implements Serializable{
    
    private String riddle;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.riddle);
        hash = 29 * hash + Objects.hashCode(this.gem);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.answer) ^ (Double.doubleToLongBits(this.answer) >>> 32));
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
        final Riddle other = (Riddle) obj;
        if (!Objects.equals(this.riddle, other.riddle)) {
            return false;
        }
        if (!Objects.equals(this.gem, other.gem)) {
            return false;
        }
        if (Double.doubleToLongBits(this.answer) != Double.doubleToLongBits(other.answer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Riddle{" + "riddle=" + riddle + ", gem=" + gem + ", answer=" + answer + '}';
    }
    private String gem; 

    public Riddle(String gem) {
        this.gem = gem;
    }

    public String getGem() {
        return gem;
    }

    public void setGem(String gem) {
        this.gem = gem;
    }

    

    public String getRiddle() {
        return riddle;
    }

    public void setRiddle(String riddle) {
        this.riddle = riddle;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }
    private double answer;

    public Riddle(double answer) {
        this.answer = answer;
    }
    
}
