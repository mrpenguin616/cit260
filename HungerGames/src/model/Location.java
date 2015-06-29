/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Casey
 */
public class Location implements Serializable {
    private int[] coordinatesXY;
    private boolean visited;
    private boolean hasTrap;
    
    public int[] getCoordinatesXY() {
        return coordinatesXY;
    }

    public void setCoordinatesXY(int[] coordinatesXY) {
        this.coordinatesXY = coordinatesXY;
    }

    public boolean isHasTrap() {
        return hasTrap;
    }

    public void setHasTrap(boolean hasTrap) {
        this.hasTrap = hasTrap;
    }
    private String description;

    public Location() {
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Arrays.hashCode(this.coordinatesXY);
        hash = 61 * hash + (this.visited ? 1 : 0);
        hash = 61 * hash + (this.hasTrap ? 1 : 0);
        hash = 61 * hash + Objects.hashCode(this.description);
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
        final Location other = (Location) obj;
        if (!Arrays.equals(this.coordinatesXY, other.coordinatesXY)) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (this.hasTrap != other.hasTrap) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
    
      @Override
    public String toString() {
        return "Location{" + "coordinatesXY=" + Arrays.toString(coordinatesXY) + ", visited=" + visited + ", hasTrap=" + hasTrap + ", description=" + description + '}';
    }

    
}
