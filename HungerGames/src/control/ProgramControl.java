package control;

import model.Owner;
import model.Player;

import java.util.Date;

/**
 * Created by mrpenguin616 on 6/4/15.
 */
public class ProgramControl {

    public static Owner createOwner(String name){
        Owner owner = new Owner();
        owner.setMyPlayer(new Player(name, true));
        owner.setName(name);
        owner.setLastDatePlayed(new Date());
        return owner;
    }

}
