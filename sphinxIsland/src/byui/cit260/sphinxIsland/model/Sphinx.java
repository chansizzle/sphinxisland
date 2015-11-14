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
public class Sphinx implements Serializable {

    // Sphinx class instance variables& redo the  hash & tostring
    private double itemNumber;
    private String name;
    private String description;
    private String riddle;
    private String answer;
    private String gem;

    public double getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(double itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRiddle() {
        return riddle;
    }

    public void setRiddle(String riddle) {
        this.riddle = riddle;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getGem() {
        return gem;
    }

    public void setGem(String gem) {
        this.gem = gem;
    }

    public Sphinx() {
    }

    @Override
    public String toString() {
        return "Sphinx{" + "itemNumber=" + itemNumber + ", name=" + name + ", description=" + description + ", riddle=" + riddle + ", answer=" + answer + ", gem=" + gem + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.itemNumber) ^ (Double.doubleToLongBits(this.itemNumber) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + Objects.hashCode(this.riddle);
        hash = 23 * hash + Objects.hashCode(this.answer);
        hash = 23 * hash + Objects.hashCode(this.gem);
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
        final Sphinx other = (Sphinx) obj;
        if (Double.doubleToLongBits(this.itemNumber) != Double.doubleToLongBits(other.itemNumber)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.riddle, other.riddle)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        if (!Objects.equals(this.gem, other.gem)) {
            return false;
        }
        return true;
    }

}
