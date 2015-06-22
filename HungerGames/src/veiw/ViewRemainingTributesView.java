package veiw;

import model.Player;

/**
 * Created by mrpenguin616 on 6/20/15.
 */
public class ViewRemainingTributesView extends View {
    private Player[] players;

    public ViewRemainingTributesView(Player[] players){
        super(constructReport(players));
        this.players = players;
    }

    //TODO need to fix and make report better
    private static String constructReport(Player[] players) {
        String report = null;
        for (Player player : players){
            report += "%n";
            report += player.toString();

        }
        return report;
    }

    @Override
    public boolean doAction(Object obj) {
        // TODO add case to move players character
       char input;
       do {
           String stuff = (String) obj;
           input = stuff.toUpperCase().charAt(0);
       }while(input != 'g');
        return true;
    }
}
