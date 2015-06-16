/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungergames;

import control.ProgramControl;
import model.*;
import veiw.MainMenuView;
import veiw.MovementView;
import veiw.SetTrapView;
import veiw.StartProgramView;

import java.lang.reflect.Array;
import java.util.Arrays;


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

        // start the program
        stp.startProgram();

        // get name
        String name = stp.getPlayerName();
        System.out.println(name);

        // create the owner'
        Owner owner = ProgramControl.createOwner(name);

        // display welcome message
        stp.displayWelcomeMessage(owner);

        MainMenuView mmv =  new MainMenuView();
        mmv.displayMainMenu();

        Player testPlayer = new Player("name", true);
        int[] thing = {1,2};
        testPlayer.setLocation(thing);
        System.out.println(Arrays.toString(testPlayer.getLocation()));

        MovementView.displayMoveMenu(testPlayer);

        System.out.println(Arrays.toString(testPlayer.getLocation()));


        SetTrapView stv = new SetTrapView();

        Location location = new Location();
        location.setCoordinatesXY(thing);
        stv.displaySetTrap(testPlayer, location);

    }
    
}
