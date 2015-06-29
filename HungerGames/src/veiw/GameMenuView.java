package veiw;

import model.Game;
import model.Map;

import java.util.Arrays;

/**
 * Created by mrpenguin616 on 6/25/15.
 */
public class GameMenuView extends View {
    private Game game;

    public GameMenuView(Game game){
        super(    "%n*********************"
                + "%n*  Game Menu        *"
                + "%n*===================*"
                + "%n*  M - Move         *"
                + "%n*  T - Set trap     *"
                + "%n*  D - Display Map  *"
                + "%n*  I - Inventory    *"
                + "%n*  R - Remaining    *"
                + "%n*  H - Help Menu    *"
                + "%n*  S - Save Game    *"
                + "%n*  E - Exit Game    *"
                + "%n*********************%n");
        this.game = game;
    }

    //TODO implement this later right now menu just shows
    public boolean doAction(Object obj) {
        String input =(String) obj;
        char value = input.toUpperCase().charAt(0);
        switch (value){
            case 'M':
                break;
            case 'T':
                break;
            case 'D':
                //System.out.printf(this.game.getMap().toString());\
                displayMap(this.game.getMap());
                break;
            case 'I':
                break;
            case 'H':
                break;
            case 'R':
                break;
            case 'S':
                break;
            case 'E':
                break;
            default:
                System.out.printf("%n\t** Invalid Command  ** Pleas Try Again %n%n");
        }
        return true;
    }

    private void displayMap(Map map) {
        for (int i = 0; i < map.getRows(); i++){
            for(int j = 0; j < map.getCols(); j++){
                System.out.printf("[" + (map.getBoard()[i][j]).toString() + " ]");
            }
            System.out.println();
        }
    }
}
