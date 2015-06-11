package veiw;

import model.Player;

import java.util.Scanner;

/**
 * Created by mrpenguin616 on 6/9/15.
 */
public class MovementView {

    public static void displayMoveMenu(Player player){
        char input;
        String MOVE_MENU  =   "%n****************%n"
                            + "%n*  Move Menu   *"
                            + "%n*==============*"
                            + "%n*  H - Up      *"
                            + "%n*  J - Down    *"
                            + "%n*  K - Left    *"
                            + "%n*  L - Right   *"
                            + "%n*  N - Stay    *"
                            + "%n****************%n";
        while(true) {
            System.out.printf(MOVE_MENU);
            String fullInput = getInput().trim();
            input = fullInput.toUpperCase().charAt(0);
            if (!(input == 'H' || input == 'J' || input == 'K' || input == 'L' || input == 'N')) {
                System.out.println("*** Not valid option *** Try again");
                continue;
            }
            doAction(player, input);
            break;
        }
    }

    private static void doAction(Player player , char input) {
        // TODO add case to move players character
        int[] currentLocation = player.getLocation();
        switch(input) {
            case 'H':
                currentLocation[0]+=1;
                break;
            case 'J':
                currentLocation[0]-=1;
                break;
            case 'K':
                currentLocation[1]-=1;
                break;
            case 'L':
                currentLocation[1]+=1;
                break;
            default:
        }
        player.setLocation(currentLocation);
    }


    private static String getInput() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input.trim();
    }
}
