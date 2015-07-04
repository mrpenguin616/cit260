package veiw;

import control.GameControl;
import model.Game;
import model.Owner;
import model.Player;

/**
 * Created by mrpenguin616 on 6/4/15.
 */
public class MainMenuView extends View {

    private Owner owner;
    private Game game;

    public MainMenuView(Owner owner) {
        super("%n*********************"
                + "%n*  Main Menu        *"
                + "%n*===================*"
                + "%n*  N - New Game     *"
                + "%n*  L - Load Game    *"
                + "%n*  H - Help Menu    *"
                + "%n*  S - Save Game    *"
                + "%n*  E - Exit         *"
                + "%n*********************%n");
        this.owner = owner;
        this.game = null;
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
        GameControl gc = new GameControl();
        this.game = gc.createNewGame(this.owner);

    }

    public Game getGame(){return this.game;}


    private void loadGame(){
        System.out.println("inside loadGame");
    }


    private void saveGame() {
        System.out.println("inside saveGame");
    }

    private void displayHelpMenu() {
        HelpMenuView hmv = new HelpMenuView();
        hmv.display();
    }

}
