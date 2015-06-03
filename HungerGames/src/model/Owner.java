/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import model.Player;

/**
 *
 * @author mrpenguin616
 */
public class Owner implements Serializable {
    
    public String name;
    public Date lastDatePlayed;
    public Player myPlayer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastDatePlayed() {
        return lastDatePlayed;
    }

    public void setLastDatePlayed(Date lastDatePlayed) {
        this.lastDatePlayed = lastDatePlayed;
    }

    public Player getMyPlayer() {
        return myPlayer;
    }

    public void setMyPlayer(Player myPlayer) {
        this.myPlayer = myPlayer;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.lastDatePlayed);
        hash = 59 * hash + Objects.hashCode(this.myPlayer);
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
        final Owner other = (Owner) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.lastDatePlayed, other.lastDatePlayed)) {
            return false;
        }
        if (!Objects.equals(this.myPlayer, other.myPlayer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Owner{" + "name=" + name + ", lastDatePlayed=" + lastDatePlayed + ", myPlayer=" + myPlayer + '}';
    }
    
    
    
}
