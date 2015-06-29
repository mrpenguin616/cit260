/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
import java.util.Arrays;
/**
 *
 * @author mrpenguin616
 */
public class Map implements Serializable {
    private int rows = 7;
    private int cols  = 7;
    private Location[][] board;

    public Map() {
        this.board = new Location[rows][cols];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; i < cols; i++) {
                Location location = new Location();
                int[] setLocationData = {i, j};
                location.setCoordinatesXY(setLocationData);
                location.setHasTrap(false);
                location.setDescription("default as of now");
                this.board[i][j] = location;
            }
        }

    }
    
    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int col) {
        this.cols = col;
    }

    public Location[][] getBoard() {
        return board;
    }

    public void setBoard(Location[][] board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return "Map{" + "rows=" + rows + ", col=" + cols + ", board=" + Arrays.toString(board) + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.rows;
        hash = 53 * hash + this.cols;
        hash = 53 * hash + Arrays.deepHashCode(this.board);
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
        final Map other = (Map) obj;
        if (this.rows != other.rows) {
            return false;
        }
        if (this.cols != other.cols) {
            return false;
        }
        if (!Arrays.deepEquals(this.board, other.board)) {
            return false;
        }
        return true;
    }
    
}
