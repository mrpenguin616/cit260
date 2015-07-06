/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import Exceptions.MapControlException;
import Exceptions.SetTrapException;
import model.Map;
import model.Location;
import model.Player;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author mrpenguin616
 */
public class MapContol {
    
    public final int MAP_X_MAX = 7;
    public final int MAP_Y_MAX = 7;

    public static Map createMap(){
        Map map = new Map();
        //TODO nothing
        return map;
    }

    /*


     */

    
    // TODO logic needs some work
    public void move (Map map, Player player, Point oldPoint, Point newPoint)throws MapControlException{
        Location[][] locations = map.getBoard();
        if(isValidLocation(newPoint)){
            updateLocation(locations, player, oldPoint, newPoint);
        }
        else{
            throw new MapControlException("Cant move that way , its off the map");
        }
        map.setBoard(locations);
    }

    //Kills npcs that move off of the map
    private void updateLocation(Location[][] locations, Player player, Point oldPoint) {
            if (locations[oldPoint.x][oldPoint.y].getPlayer() != null) {
                locations[oldPoint.x][oldPoint.y].setPlayer(null);
            }
    }
    //moves any player and clears last location
    private void updateLocation(Location[][] locations, Player player,Point oldPoint, Point newPoint){
        locations[oldPoint.x][oldPoint.y].setPlayer(null);
        locations[newPoint.x][newPoint.y].setPlayer(player);
        player.setPoint(newPoint);
    }


    // works 
    public boolean locationHasTrap(Location location){
        return location.isHasTrap();
    }
    
    
    // needs work
    // casey ?
    public void setTrap(Location location, Player player, int answer)  throws SetTrapException {
        if (calculateWasSuccessful(answer)){
            location.setHasTrap(true);
            int trapLevel;
        
        /*
            this is a good idea and this is 2 ways we can fix it
        
            so we need to give locationa attribute so that we can have a trapLevel var
        
            we can create a new float or int trapLevel inside location and give it percentages or ints like below.
        
            after its created we can just call location.setTrapLevel(var);
        */

            if(!isValidLocation(player.getPoint())){
                throw new SetTrapException();
            }


            if (player.skill < 20) { // not sure how to fix the error.
                trapLevel = 1; // i was thinking the trap level would determine the
            }              // chances of the trap succeding in killing the NPC
            else if (player.skill >= 20 && player.skill < 25) {
                trapLevel = 2; // for example, level 1 would be 25%, 2 would be 50% etc.
            } else if (player.skill >= 25 && player.skill < 30) {
                trapLevel = 3;
            } else {
                trapLevel = 4;
            }
        }
    }

    private static boolean calculateWasSuccessful(int answer) {
        Random rand = new Random();
        int delta = rand.nextInt(75);
        int alpha = rand.nextInt(35);
        int trunk = 4; // guaranteed to be random due to dice roll
        int calculation = (answer * (delta * alpha / trunk))%4;
        if (calculation > 2){
            return true;
        }
        return false;
    }

    public int sumAllSkills(ArrayList<Player> players){
        int sum = 0;
        for(Player player: players){
            sum += player.getSkill();
        }
        return sum;
    }


/*    public void moveAllNPC(ArrayList<Player> players){
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
     */
    // still working on
/*    public void createRandomMovement(int[] currentLocation){
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
                       
    }*/
    
    // TODO needs work
    // relationship between locaiont and play may need to change a bit
    public boolean locationHasPlayer(Location location){
        return false;
    }
 
    public boolean isValidLocation(Point point){
        if(point.x < 0 || point.y < 0 || point.x > 7 || point.y > 7 ){
            return false;
        }
        return true;
    }
    
    private void encounter(){
    // TODO add logic to call encounter
        
    }
    
    
}
