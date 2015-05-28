/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Location;
import model.Player;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays; 

/**
 *
 * @author mrpenguin616
 */
public class MapContolTest {
    
    public MapContolTest() {
    }

    /**
     * Test of move method, of class MapContol.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Player player = null;
        Location location = null;
        MapContol instance = new MapContol();
        instance.move(player, location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of locationHasTrap method, of class MapContol.
     */
    @Test
    public void testLocationHasTrap() {
        System.out.println("locationHasTrap");
        Location location = null;
        MapContol instance = new MapContol();
        boolean expResult = false;
        boolean result = instance.locationHasTrap(location);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTrap method, of class MapContol.
     */
    @Test
    public void testSetTrap() {
        System.out.println("setTrap");
        Location location = null;
        MapContol instance = new MapContol();
        instance.setTrap(location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveAllNPC method, of class MapContol.
     */
    @Test
    public void testMoveAllNPC() {
        System.out.println("moveAllNPC");
        Player[] players = null;
        MapContol instance = new MapContol();
        instance.moveAllNPC(players);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createRandomMovement method, of class MapContol.
     */
    @Test
    public void testCreateRandomMovement() {
        System.out.println("createRandomMovement");
        int[] currentLocation = {3,2};
        MapContol instance = new MapContol();
        int[] expResult = {3 , 2};
        int[] result = instance.createRandomMovement(currentLocation);
        // assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
            System.out.println("expResult - " + Arrays.toString(expResult) 
                    + ", result - " + Arrays.toString(result) 
                    + ", currentLocation - " + Arrays.toString(currentLocation));
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isValidLocation method, of class MapContol.
     */
    @Test
    public void testIsValidLocation() {
        System.out.println("isValidLocation");
        int[] location = {3, 6};
        MapContol instance = new MapContol();
        boolean expResult = false;
        boolean result = instance.isValidLocation(location);
        System.out.println("result - " + result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
