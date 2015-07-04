package model;

import java.awt.*;

/**
 * Created by mrpenguin616 on 6/28/15.
 */
public enum NamesEnum {
    Dave(new Point(2,3)),
    Jeff(new Point(3,5)),
    Ken(new Point(3,7)),
    Sabo(new Point(1,3)),
    Flash(new Point(1,2)),
    Scooby(new Point(7,2)),
    Kat(new Point(5,5)),
    Jessica(new Point(6,3)),
    Frances(new Point(6,6)),
    Erica(new Point(4,1)),
    Kimbler(new Point(6,5)),
    TooLong(new Point(1,1));

    private final Point point;


    NamesEnum(Point point) {
        this.point = point;
    }

    public Point getPoint(){return this.point;}

}
