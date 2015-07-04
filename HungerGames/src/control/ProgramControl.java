package control;

import model.Owner;
import model.Player;

import java.awt.*;
import java.util.Date;

/**
 * Created by mrpenguin616 on 6/4/15.
 */
public class ProgramControl {

    public static Owner createOwner(String name){
        Owner owner = new Owner();
        Player player = new Player(name, true);
        player.setIsNPC(false);
        player.setPoint(new Point(3,3));
        owner.setMyPlayer(player);
        owner.setName(name);
        owner.setLastDatePlayed(new Date());
        return owner;
    }

}

