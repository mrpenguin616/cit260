package veiw;

import model.Location;
import model.Player;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by mrpenguin616 on 6/11/15.
 */
public class SetTrapView {

    public static void displaySetTrap(Player player, Location location){
        char input;
        String SET_TRAP_MENU  =   "%n****************%n"
                + "%n*  Set Trap    *"
                + "%n*==============*"
                + "%n*  A - Attempt *"
                + "%n*  E - Exit    *"
                + "%n****************%n";
        while(true) {
            System.out.printf(SET_TRAP_MENU);
            //String fullInput = getInput().trim();
            //input = fullInput.toUpperCase().charAt(0);
            input = getInput();
            if (!(true)) {
                System.out.println("*** Not valid option *** Try again");
                continue;
            }
            doAction(input, player, location);
            break;
        }
    }

    private static void doAction(char input, Player player, Location location) {
        // TODO add case to move players character

        switch(input) {
            case 'A':
                attemptToSetTrap(player, location);
                break;
            case 'E':
                break;
            default:
                break;
        }

    }

    private static void attemptToSetTrap(Player player, Location location) {
        displayQuestion();
        char input = getInput();
        location.setHasTrap(calculateIsSucess(input, player, location));
    }

    private static boolean calculateIsSucess(char input, Player player, Location location) {
        //TODO figure a better way of doing this

        return false;
    }

    private static void displayQuestion() {

    }


    private static char getInput() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input.toUpperCase().charAt(0);
    }


}
