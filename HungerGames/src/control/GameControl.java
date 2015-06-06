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
    
    public static void gameSave(Game game){
        // add logic to save game
        
    }

    public static void createNewGame(){
        //Game game = new Game();
        // TODO set attributes correctly for game, remove comments and println()
        //return game;
        System.out.println("*** inside create new game ***");
    }

    
    public static Game gameLoad(Owner owner){
        // add logic to find owner based of owner.name 
        Game game = new Game(); // will be removed later and changed
        return game;
    }
    
    public static void initMap(){
     // dont know yet
    }
    
    
}
