package veiw;

import model.Player;

import java.util.Scanner;

/**
 * Created by mrpenguin616 on 6/9/15.
 */
public class MovementView extends View {
    private Player player;

    public MovementView(Player player){
        super( "%n****************%n"
                + "%n*  Move Menu   *"
                + "%n*==============*"
                + "%n*  H - Up      *"
                + "%n*  J - Down    *"
                + "%n*  K - Left    *"
                + "%n*  L - Right   *"
                + "%n*  N - Stay    *"
                + "%n****************%n");
        this.player = player;
    }

    @Override
    public boolean doAction(Object obj) {
        // TODO add case to move players character
        String stuff =(String) obj;
        char input = stuff.toUpperCase().charAt(0);
        int[] currentLocation = this.player.getLocation();
        if (!(input == 'H' || input == 'J' || input == 'K' || input == 'L' || input == 'N')) {
            System.out.println("*** Not valid option *** Try again");
            return false;
        }
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
        return true;
    }

}
