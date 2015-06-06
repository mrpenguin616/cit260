package veiw;

import java.util.Scanner;

/**
 * Created by mrpenguin616 on 6/4/15.
 */
public class MainMenuView {
    private final String MAIN_MENU = "This is the menu";

    public MainMenuView() {
    }

    public void displayMainMenu(){
        char input;
        do {
            System.out.println(MAIN_MENU);
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
            case 'G':
                this.getGame();
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

    private void getGame(){
        System.out.println("inside getGame");
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
