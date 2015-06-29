/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
// import java.sql.Time;

/**
 *
 * @author mrpenguin616
 */
public class Game implements Serializable {
    private int movesCount;
    private Map map;
    private Owner owner;
    ArrayList<Player> tributes = new ArrayList<>();

    public Game(Owner owner) {
        this.owner = owner;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public ArrayList<Player> getTributes() {
        return tributes;
    }

    public void setTributes(ArrayList<Player> tributes) {
        this.tributes = tributes;
    }

    public int getMovesCount() {
        return movesCount;
    }

    public void setMovesCount(int movesCount) {
        this.movesCount = movesCount;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game)) return false;

        Game game = (Game) o;

        if (getMovesCount() != game.getMovesCount()) return false;
        if (!getMap().equals(game.getMap())) return false;
        if (!getOwner().equals(game.getOwner())) return false;
        return getTributes().equals(game.getTributes());

    }

    @Override
    public int hashCode() {
        int result = getMovesCount();
        result = 31 * result + getMap().hashCode();
        result = 31 * result + getOwner().hashCode();
        result = 31 * result + getTributes().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Game{" +
                "movesCount=" + movesCount +
                ", map=" + map +
                ", owner=" + owner +
                ", tributes=" + tributes +
                '}';
    }
}
