package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        putBeeper();
        turnLeft();
        repositionLeft();
        setTwo();
        repositionRight();
        setThree();
        repositionLeft();
        setFour();
        repositionRightUp();
        setThree();
        repositionLeftUp();
        setTwo();
        repositionRightUp();
        putBeeper();
        move();
        
        
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void repositionLeft() {
        move();
        turnRight();
        move();
        turnRight();
    }
    
    public void repositionRight() {
        move();
        turnLeft();
        move();
        turnLeft();
    }
    
    public void repositionLeftUp() {
        turnRight();
        move();
        turnRight();
        move();
    }
    
    public void repositionRightUp() {
        turnLeft();
        move();
        turnLeft();
        move();
    }
    
    public void setTwo() {
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void setThree() {
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void setFour() {
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
}
