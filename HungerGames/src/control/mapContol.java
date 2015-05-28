/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.Map;
import model.Location;
import model.Player;

/**
 *
 * @author mrpenguin616
 */
public class mapContol {
    
    public void move(Player player, Location location){
        int[] newLocation = {location.getRow(), location.getColumn()};
        player.setLocation(newLocation);
        
    }
    public boolean locationHasTrap(Location location){
        return location.isHasTrap();
    }
    
    public void setTrap(Location location){
        location.setHasTrap(true);
    }
    
}
