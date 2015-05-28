/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.Map;
import model.Location;
import model.Player;
import java.util.Random;

/**
 *
 * @author mrpenguin616
 */
public class MapContol {
    
    public final int MAP_X_MAX = 7;
    public final int MAP_Y_MAX = 7;
    
    public void move(Player player, Location location){
        int[] newLocation = location.getCoordinatesXY();
        player.setLocation(newLocation);
        
    }
    
    // works 
    public boolean locationHasTrap(Location location){
        return location.isHasTrap();
    }
    
    
    // needs work
    // casey ?
    public void setTrap(Location location){
        location.setHasTrap(true);
    }
    
    public void moveAllNPC(Player[] players){
        for (Player player : players){
            if (player.isIsNPC()){
                int[] locationToChange = createRandomMovement(player.getLocation());
                player.setLocation(locationToChange);
            }
        }
    }
     
    // still working on
    public int[] createRandomMovement(int[] currentLocation){
        Random rand = new Random();
        int[] newLocation = currentLocation; // = currentLocation;
        // create a int 0 - 3 and will move a player to a new location based of that int
        int randInt =  ((rand.nextInt(12) * rand.nextInt(31)) % 4);
        System.out.println(randInt);
        switch (randInt){
            case 0: newLocation[0] = currentLocation[0]++;
                break;
            case 1: newLocation[1] = currentLocation[0]--;
                break;
            case 2: newLocation[0] = currentLocation[1]--;
                break;
            case 3: newLocation[1] = currentLocation[1]++;
                break;
            default:
                break;         
        }
        if (! isValidLocation(newLocation)){
            newLocation = currentLocation;
        }
        return newLocation;               
    }
    
 
    public boolean isValidLocation(int[] location){
        if(location[0] < 0 || location[1] < 0 || location[0] > MAP_X_MAX || location[1] > MAP_Y_MAX ){
            return false;
        }
        return true;
    }
    
    protected void encounter(){
    // TODO add logic to call encounter
    }
    
    
}
