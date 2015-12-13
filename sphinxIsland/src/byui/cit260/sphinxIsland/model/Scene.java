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
public class Scene implements Serializable {
    
    private String mapSymbol;
    private String description;
    private Location[][] location;
    private Scene[] scenes;
    private int positioning;

    public Scene(String mapSymbol, String description, int positioning) {
        this.mapSymbol = mapSymbol;
        this.description = description;
        this.positioning = positioning;
    }

    public Scene() {
//System.out.println("working on scene garbage");
    }

    
    public Location[][] getLocation() {
        return location;
    }

    public void setLocation(Location[][] location) {
        this.location = location;
    }

    public Scene[] getScenes() {
        return scenes;
    }

    public void setScenes(Scene[] scenes) {
        this.scenes = scenes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public int getPositioning() {
        return positioning;
    }

    public void setPositioning(int positioning) {
        this.positioning = positioning;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.description);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + '}';
    }

    public void setMapSymbol(String st) {
       this.mapSymbol = mapSymbol; 
    }
    
    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setBlocked(boolean b) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
