package veiw;

import control.MapContol;
import model.Location;
import model.Player;

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
        displayQuestion();n
                
        char input = getInput();
        int answer;
        answer = convertInput(input);
        MapContol.setTrap(location, player, answer);
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


    private static char getInput() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input.toUpperCase().charAt(0);
    }


}
