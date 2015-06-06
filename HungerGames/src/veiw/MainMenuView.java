package veiw;

import java.util.Scanner;

/**
 * Created by mrpenguin616 on 6/4/15.
 */
public class MainMenuView {
    private final String MAIN_MENU  = "%n*********************"
                                    + "%n*  Main Menu        *"
                                    + "%n*===================*"
                                    + "%n*  N - New Game     *"
                                    + "%n*  L - Load Game    *"
                                    + "%n*  H - Help Menu    *"
                                    + "%n*  S - Save Game    *"
                                    + "%n*  E - Exit         *"
                                    + "%n*********************%n";

    public MainMenuView() {
    }

    public void displayMainMenu(){
        char input;
        do {
            System.out.printf(MAIN_MENU);
            String fullInput = this.getInput().trim();
            input = fullInput.charAt(0);
            doAction(input);
        }while(input != 'E');
    }

    private void doAction(char input) {
        switch (input){
            case 'N':
                this.startNewGame();
                break;
            case 'L':
                this.loadGame();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'E':
                break;
            default:
                System.out.printf("%n\t** Invalid Command  ** Pleas Try Again %n%n");
        }
    }

    private void startNewGame() {
        System.out.println("inside start new game");
    }

    private void loadGame(){
        System.out.println("inside loadGame");
    }


    private void saveGame() {
        System.out.println("inside saveGame");
    }

    private void displayHelpMenu() {
        System.out.println("inside  displayHelpMenu");
    }

    private String getInput() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input.trim();
    }
}
