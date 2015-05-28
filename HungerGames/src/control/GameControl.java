/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.Game;
import model.Owner;

/**
 *
 * @author mrpenguin616
 */
public class GameControl {
    public Game gameCreate(){
         Game game = new Game();
         return game;
    }
    
    public void gameSave(Game game){
        // add logic to save game
        
    }
    
    public Game gameLoad(Owner owner){
        // add logic to find owner based of owner.name 
        Game game = new Game(); // will be removed later and changed
        return game;
    }
    
    public void initMap(){
     // dont know yet
    }
    
    
}
