package veiw;

import java.util.Scanner;

/**
 * Created by mrpenguin616 on 6/6/15.
 */
public class HelpMenuView {
    private final String HELP_MENU  = "%n*********************"
            + "%n*  Help Menu        *"
            + "%n*===================*"
            + "%n*  G - Goal of game *"
            + "%n*  C - Controls     *"
            + "%n*   -   *"
            + "%n*   -   *"
            + "%n*  E - Exit         *"
            + "%n*********************%n";

    private final String[] MESSAGES = {
     "%n\t** Invalid Command  ** Pleas Try Again %n%n",
     "%n/t** Default Message  ** Inside displayMessage it works**"
    };

    public HelpMenuView() {
    }

    public void displayHelpMenu(){
        char input;
        do {
            System.out.printf(HELP_MENU);
            String fullInput = this.getInput().trim();
            input = fullInput.toUpperCase().charAt(0);
            doAction(input);
        }while(input != 'E');
    }

    private void doAction(char input) {
        // TODO need design on what messages will be displayed
        switch (input){
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
    }

    private void displayMessage(int index){
        System.out.printf(MESSAGES[index]);
    }


    private String getInput() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input.trim();
    }
}
