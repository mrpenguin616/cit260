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
    
    
    // TODO location occupied
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
                int[] locationToChange = player.getLocation();
                createRandomMovement(locationToChange);
                player.setLocation(locationToChange);
            }
        }
    }
     
    // still working on
    public void createRandomMovement(int[] currentLocation){
        Random rand = new Random();
        //int[] newLocation = currentLocation; // = currentLocation;
        // create a int 0 - 3 and will move a player to a new location based of that int
        int randInt =  ((rand.nextInt(12) * rand.nextInt(31)) % 4);
        System.out.println(randInt);
        switch (randInt){
            case 0: currentLocation[0]++;
                break;
            case 1: currentLocation[0]--;
                break;
            case 2: currentLocation[1]--;
                break;
            case 3: currentLocation[1]++;
                break;
            default:
                break;         
        }
        if (! isValidLocation(currentLocation)){
            //newLocation = currentLocation;
            currentLocation[0] = -1;
            currentLocation[1] = -1;
        }
                       
    }
    
    // TODO needs work
    // relationship between locaiont and play may need to change a bit
    public boolean locationHasPlayer(Location location){
        return false;
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
