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
public enum Island implements Serializable {

    Columns("4 Columns"),
    Rows("7 Rows");
    
    private final Double columnCount;
    private final Double rowCount;
    private final String description;

    
    Island(String description) {
    this.description = description;
    columnCount = new Double (4.00);
    rowCount = new Double(7.00);
    }

    

    public double getRowCount() {
        return rowCount;
    }

    public String getDescription() {
        return description;
    }

    public Double getColumnCount() {
        return columnCount;
    }
    
    @Override
    public String toString() {
        return "Island{" + "columnCount=" + columnCount + ", rowCount=" + rowCount + '}';
    }

}
