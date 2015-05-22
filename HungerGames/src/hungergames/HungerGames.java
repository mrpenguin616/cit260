/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.hungergames;

import model.Map;
import model.Player;
import model.Items;
import model.Location;
import model.Game;


/**
 *
 * @author mrpenguin616
 */
public class HungerGames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player playerOne = new Player("test", true);
        Map map = new Map();
        Game game = new Game();
        
        System.out.println(game.toString());
        System.out.println(playerOne.toString());
        System.out.println(map.toString());
        
        Items itemOne = new Items();
        
        String itemsInfo = itemOne.toString();
        System.out.println(itemsInfo);
    }
    
}
