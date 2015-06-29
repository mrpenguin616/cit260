package model;

/**
 * Created by mrpenguin616 on 6/28/15.
 */
public enum NamesEnum {
    Dave(new int[]{2,3}),
    Jeff(new int[]{3,5}),
    Ken(new int[]{1,3}),
    Sabo(new int[]{0,5}),
    Flash(new int[]{2,1}),
    Scooby(new int[]{7,2}),
    Kat(new int[]{5,5}),
    Jessica(new int[]{6,3}),
    Frances(new int[]{6,6}),
    Erica(new int[]{4,1}),
    Kimbler(new int[]{6,5}),
    TooLong(new int[]{1,1});

    private int[] location;

    NamesEnum(int[] location) {
        this.location = location;
    }

    public int[] getLocation(){return this.location;}

}
