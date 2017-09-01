package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        move();
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();
    }
    /**
     * Precondition: Robot facing east one block awau from a row of beepers
     * Postcondition: Robot facing east, two streets above where it started,
     * one block away from the beeper
     */
    public void harvestTwoRows() {
        harvestOneRow();
        repositionRight();
        harvestOneRow();
        repositionLeft();
        
        
    }
    
    public void harvestOneRow() {
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
    
    public void repositionRight() {
        turnLeft();
        move();
        turnLeft();
    }
    
    public void repositionLeft() {
        turnRight();
        move();
        turnRight();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
}

