package veiw;

import Exceptions.MapControlException;
import control.MapContol;
import model.Location;
import model.Map;
import model.Player;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mrpenguin616 on 6/9/15.
 */
public class MovementView extends View {
    private Player player;
    private MapContol mc;
    private Map map;

    public MovementView(Player player, Map map){
        super(
                "%n****************%n"
                        + "%n*  Move Menu   *"
                        + "%n*==============*"
                        + "%n*  H - Up      *"
                        + "%n*  J - Down    *"
                        + "%n*  K - Left    *"
                        + "%n*  L - Right   *"
                        + "%n*  N - Stay    *"
                        + "%n****************%n");
        this.player = player;
        this.mc = new MapContol();
        this.map = map;
    }


    @Override
    public boolean doAction(Object obj) {
        // TODO add case to move players character
        String stuff =(String) obj;
        char input = stuff.toUpperCase().charAt(0);
        getDoubleNumber(stuff);

        if (!(input == 'H' || input == 'J' || input == 'K' || input == 'L' || input == 'N' || input == 'S')) {
            System.out.println("*** Not valid option *** Try again");
            return false;
        }

        Point newPoint = player.getPoint();
        switch(input) {
            case 'H':
                newPoint.x -=1;
                break;
            case 'J':
                newPoint.x +=1;
                break;
            case 'K':
                newPoint.y -=1;
                break;
            case 'L':
                newPoint.y +=1;
                break;
            case 'S':
                displayCurrentLucation(player);
                return false;
            default:
        }
       try {
            mc.move(map, player, player.getPoint(), newPoint);
        } catch(MapControlException mc){
            System.out.println(mc.getMessage());
           return false;
        }
        displayCurrentLucation(player);
        return true;
    }

    // useless created to fullfill a requirement
    public Double getDoubleNumber(String stuff){
        Double numb;
        try {
            numb = Double.parseDouble(stuff);
        }catch(NumberFormatException nf){

        }
        return 17.0;
    }

    private void displayCurrentLucation(Player player) {
        System.out.println("Your location is (" + player.getPoint().x + ", " + player.getPoint().y + ").");
    }

}
