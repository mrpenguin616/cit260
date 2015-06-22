package veiw;

import control.MapContol;
import model.Location;
import model.Player;

import java.util.Scanner;

/**
 * Created by mrpenguin616 on 6/11/15.
 */
public class SetTrapView extends View {
    public Player player;
    public Location location;

    public SetTrapView(Player player, Location location){
        super( "%n****************%n"
                + "%n*  Set Trap    *"
                + "%n*==============*"
                + "%n*  A - Attempt *"
                + "%n*  E - Exit    *"
                + "%n****************%n");
        this.player = player;
        this.location = location;
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
        int answer;
        answer = convertInput(input);
        MapContol.setTrap(this.location, this.player, answer);
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

    private static void displayQuestion() {
        System.out.printf("Wheres the ducky come from on a tuesday?" +
        "%nA - the store" +
                        "%nB - the carnival"+
                        "%nC - the thing"+
                        "%nD - the lala land"+
                        "%nE - It dont matter"
        );

    }
}
