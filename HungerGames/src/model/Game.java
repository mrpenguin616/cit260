/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.model;

import java.io.Serializable;
import java.util.Arrays;
// import java.sql.Time;

/**
 *
 * @author mrpenguin616
 */
public class Game implements Serializable {

    public Game() {
    
    }

    @Override
    public String toString() {
        return "Game{" + "remainingTributes=" + remainingTributes + '}';
    }
    private Player[] remainingTributes;
    // private Time time;
    // private int movesCount; 
    
    
    public Player[] getRemainingTributes() {
        return remainingTributes;
    }

    public void setRemainingTributes(Player[] remainingTributes) {
        this.remainingTributes = remainingTributes;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Arrays.deepHashCode(this.remainingTributes);
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
        if (!Arrays.deepEquals(this.remainingTributes, other.remainingTributes)) {
            return false;
        }
        return true;
    }
    
    
    
  
    
}
