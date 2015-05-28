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
    public boolean locationHasTrap(Location location){
        return location.isHasTrap();
    }
    
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
        
    public int[] createRandomMovement(int[] currentLocation){
        Random rand = new Random();
        int[] newLocation = currentLocation;
        // create a int 0 - 3 and will move a player to a new location based of that int
        switch ((rand.nextInt(12) * rand.nextInt(31)) % 4){
            case 0: newLocation[0] += 1;
                break;
            case 1: newLocation[1] += 1;
                break;
            case 2: newLocation[0] -= 1;
                break;
            case 3: newLocation[1] -= 1;
                break;
            default:
                break;         
        }
        if (isValidLocation(newLocation)){
            newLocation = currentLocation;
        }
        return newLocation;               
    }
    
    public boolean isValidLocation(int[] location){
        if(location[0] < 0 || location[1] < 0 || location[0] < MAP_X_MAX || location[1] < MAP_Y_MAX ){
            return false;
        }
        return true;
    }
    
    
    
}
