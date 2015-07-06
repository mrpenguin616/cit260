package veiw;

import Exceptions.SetTrapException;
import control.MapContol;
import model.Location;
import model.Map;
import model.Player;

import java.awt.*;
import java.util.Scanner;

/**
 * Created by mrpenguin616 on 6/11/15.
 */
public class SetTrapView extends View {
    public Player player;
    private Location location;
    private MapContol mc;

    public SetTrapView(Player player, Map map){
        super( "%n****************%n"
                + "%n*  Set Trap    *"
                + "%n*==============*"
                + "%n*  A - Attempt *"
                + "%n*  E - Exit    *"
                + "%n****************%n");
        this.player = player;
        Point p = player.getPoint();
        this.location = map.getBoard()[p.x][p.y];
        this.mc = new MapContol();
    }

    @Override
    public boolean doAction(Object obj) {
        // TODO add case to move players character
        String stuff =(String) obj;
        char input = stuff.toUpperCase().charAt(0);
        switch(input) {
            case 'A':
                attemptToSetTrap();
                break;
            case 'E':
                break;
            default:
                break;
        }
        return true;
    }

    public void attemptToSetTrap() {
        displayQuestion();

        String stuff =(String) getInput();
        char input = stuff.toUpperCase().charAt(0);
        int answer = -1;
        answer = getIntNumber(stuff);

        try {
            mc.setTrap(this.location, this.player, answer);
        }catch(SetTrapException st){
            System.out.println("you failed");
        }
    }

    private static int convertInput(char input) {
        switch (input){
            case 'A':
                return 7;
            case 'B':
                return 13;
            case 'C':
                return 2;
            case 'D':
                return 17;
            default:
                return 5;
        }


    }

    public int getIntNumber(String stuff){
        int numb = 0;
        try {
            numb = Integer.parseInt(stuff);
        }catch(NumberFormatException nf){
            System.out.println("You didnt enter a number so we gave you a wrong one");
        }
        int[] Lost = {4,8,15,16,23,42};
        return numb;
    }

    private static void displayQuestion() {
        System.out.printf("Enter one of the Lost numbers and see if they were magic?%n"
        );

    }
}
