/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.awt.*;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author mrpenguin616
 */
public class Player implements Serializable {
    private String name;
    //private int[] location;
    private boolean isAlive;
    private Point point;
    private boolean isNPC;
    public int skill;
    //private Item inventory;

    public Player(String name, boolean isNPC) {
        this.name = name;
        this.isNPC = isNPC;
        this.isAlive = true;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* public int[] getLocation() {
        return location;
    }

    public void setLocation(int[] location) {
        this.location = location;
    }*/

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean isIsNPC() {
        return isNPC;
    }

    public void setIsNPC(boolean isNPC) {
        this.isNPC = isNPC;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", + ," + " isAlive=" + isAlive + ", isNPC=" + isNPC + ", "+ "skill=" + skill + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + (this.isAlive ? 1 : 0);
        hash = 71 * hash + (this.isNPC ? 1 : 0);
        hash = 71 * hash + this.skill;
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }

        if (this.isAlive != other.isAlive) {
            return false;
        }
        if (this.isNPC != other.isNPC) {
            return false;
        }
        if (this.skill != other.skill) {
            return false;
        }
        return true;
    }


    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
