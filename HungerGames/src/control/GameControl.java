/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import control.MapContol;

/**
 *
 * @author mrpenguin616
 */
public class GameControl {
    Random rand = new Random();
    
    public static void gameSave(Game game){
        // add logic to save game
        
    }

    /*
      steps for method
        create game
        set moves
        create map
        set tributes
        return game
     */
    public Game createNewGame(Owner owner){
        Game game = new Game(owner);
        game.setMovesCount(0);
        game.setMap(MapContol.createMap());
        game.setTributes(initPlayersList(game.getOwner()));
        return game;
    }

    private ArrayList<Player> initPlayersList(Owner owner) {
        ArrayList<Player> list = new ArrayList<>();
        list.add(owner.getMyPlayer());
        for (int i = 0; i < 11; i++){
            Player player = new Player(NamesEnum.values()[i].name(), true);
            player.setLocation(NamesEnum.values()[i].getLocation());
            player.setSkill(rand.nextInt(8));
            list.add(player);
        }
        return list;
    }


    public static Game gameLoad(Owner owner){
        // add logic to find owner based of owner.name 
        Game game = new Game(owner); // will be removed later and changed
        return game;
    }

    
}
