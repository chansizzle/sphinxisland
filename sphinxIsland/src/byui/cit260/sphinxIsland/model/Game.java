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
public class Game implements Serializable{
    // Game class instance variables
    private String totalGems;
    private String sphinxName;

    
    public String getTotalGems() {
        return totalGems;
    }

    public void setTotalGems(String totalGems) {
        this.totalGems = totalGems;
    }

    public String getSphinxName() {
        return sphinxName;
    }

    public void setSphinxName(String sphinxName) {
        this.sphinxName = sphinxName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.totalGems);
        hash = 59 * hash + Objects.hashCode(this.sphinxName);
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
        if (!Objects.equals(this.totalGems, other.totalGems)) {
            return false;
        }
        if (!Objects.equals(this.sphinxName, other.sphinxName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalGems=" + totalGems + ", sphinxName=" + sphinxName + '}';
    }
    
    
    
}
