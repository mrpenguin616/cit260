package veiw;

import control.GameControl;
import org.w3c.dom.views.*;

import java.util.Scanner;

/**
 * Created by mrpenguin616 on 6/4/15.
 */
public class MainMenuView extends View {



    public MainMenuView() {
        super("%n*********************"
                + "%n*  Main Menu        *"
                + "%n*===================*"
                + "%n*  N - New Game     *"
                + "%n*  L - Load Game    *"
                + "%n*  H - Help Menu    *"
                + "%n*  S - Save Game    *"
                + "%n*  E - Exit         *"
                + "%n*********************%n");
    }


    public boolean doAction(Object obj) {
        String input =(String) obj;
        char value = input.toUpperCase().charAt(0);
        switch (value){
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
        return true;
    }

    private void startNewGame() {
        GameControl.createNewGame();
        System.out.println("inside start new game");
    }

    private void loadGame(){
        System.out.println("inside loadGame");
    }


    private void saveGame() {
        System.out.println("inside saveGame");
    }

    private void displayHelpMenu() {
        HelpMenuView hmv = new HelpMenuView();
        hmv.displayHelpMenu();
    }

}
