/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungergames;

import control.ProgramControl;
import model.*;
import veiw.StartProgramView;


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
//        Player playerOne = new Player("test", true);
//        Map map = new Map();
//        Game game = new Game();
//        Location locationOne = new Location();
//        Items itemOne = new Items();
//
//
//        System.out.println(locationOne.toString());
//        System.out.println(game.toString());
//        System.out.println(playerOne.toString());
//        System.out.println(map.toString());
//        System.out.println(itemOne.toString());

        StartProgramView stp = new StartProgramView();
        stp.startProgram();
        String name = stp.getPlayerName();
        System.out.println(name);
        Owner owner = ProgramControl.createOwner(name);

        System.out.println(owner);

    }
    
}
