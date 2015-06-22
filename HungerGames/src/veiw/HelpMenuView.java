package veiw;

import java.util.Scanner;

/**
 * Created by mrpenguin616 on 6/6/15.
 */
public class HelpMenuView extends View{
    // TODO fisish design for what help menus options are

    // TODO design the actual messages
    private final String[] MESSAGES = {
     "%n\t** Invalid Command  ** Pleas Try Again %n%n",
     "%n/t** Default Message  ** Inside displayMessage it works**"
    };

    public HelpMenuView() {
        super("%n*********************"
                + "%n*  Help Menu        *"
                + "%n*===================*"
                + "%n*  G - Goal of game *"
                + "%n*  C - Controls     *"
                + "%n*   -   *"
                + "%n*   -   *"
                + "%n*  E - Exit         *"
                + "%n*********************%n");
    }


    public boolean doAction(Object obj) {
        // TODO need design on what messages will be displayed
        String input =(String) obj;
        char value = input.toUpperCase().charAt(0);
        switch (value){
            case 'G':
                this.displayMessage(1);
                break;
            case 'C':
                this.displayMessage(1);
                break;
            case 'E':
                break;
            default:
                //System.out.printf("%n\t** Invalid Command  ** Pleas Try Again %n%n");
                this.displayMessage(0);
        }
        return true;
    }

    private void displayMessage(int index){
        System.out.printf(MESSAGES[index]);
    }
}
