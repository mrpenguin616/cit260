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
    public void setTrap(Location location, Player players){
        location.setHasTrap(true);
        int trapLevel;
        if (Player.skill < 20) { // not sure how to fix the error.
            trapLevel = 1; // i was thinking the trap level would determine the
            }              // chances of the trap succeding in killing the NPC
        else if (Player.skill >= 20 && Player.skill < 25) {
            trapLevel = 2; // for example, level 1 would be 25%, 2 would be 50% etc.
        }
        else if (Player.skill >= 25 && Player.skill < 30) {
            trapLevel = 3;
        }
        else {
            trapLevel = 4;
        }
    }
    
    public void moveAllNPC(Player[] players){
        for (Player player : players){
            if (player.isIsNPC()){
                int[] locationToChange = player.getLocation();
                createRandomMovement(locationToChange);
                if (isValidLocation(locationToChange)){
                player.setLocation(locationToChange);
                }else{
                    player.setIsAlive(false);
                    // add kill player stuff
                }
                // TODO add kill player if location is valid && player died if that happens
              
            }
        }
    }
     
    // still working on
    public void createRandomMovement(int[] currentLocation){
        Random rand = new Random();
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
    
    private void encounter(){
    // TODO add logic to call encounter
        
    }
    
    
}