package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins(){
        putBeeper();
        turnLeft();
        repositionLeft();
        setRowTwo();
        repositionRight();
        setRowThree();
        repositionLeft();
        setRowFour();
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
    
    public void setRowTwo() {
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void setRowThree() {
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void setRowFour() {
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
