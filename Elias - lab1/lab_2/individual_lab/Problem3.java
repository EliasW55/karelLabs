package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot 
{
   
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void writeHello() {
        move();
        writeH();
        repositionE();
        writeE();
        repositionL();
        writeL();
        repositionL2();
        writeL();
        repositionO(); 
        writeO();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void moveTwo() {
        move();
        move();
    }
    public void turnAround() {
        turnLeft();
        turnLeft();
    }
    public void setFive() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    public void setTwo() {
        putBeeper();
        move();
        putBeeper();
    }
    
    public void writeH() {
        setFive();
        turnAround();
        moveTwo();
        turnLeft();
        move();
        setTwo();
        move();
        turnLeft();
        moveTwo();
        turnAround();
        setFive();
    }
    
    public void repositionE() {
        turnLeft();
        moveTwo();
    }
    
    public void writeE() {
        moveTwo();
        turnAround();
        setTwo();
        move();
        turnRight();
        setTwo();
        move();
        turnRight();
        moveTwo();
        turnAround();
        setTwo();
        move();
        putBeeper();
        turnRight();
        setTwo();
        turnRight();
        setTwo();
        
    }
    
    public void repositionL() {
        moveTwo();
        turnRight();
    }
    
    public void writeL() {
        setFive();
        turnLeft();
        setTwo();
    }
    public void repositionL2() {
        turnLeft();
        moveTwo();
        moveTwo();
        turnRight();
        moveTwo();
        turnRight();
    }
    
    public void repositionO() {
        moveTwo();
    }
    
    public void writeO() {
        move();
        putBeeper();
        move();
        turnLeft();
        setFive();
        turnLeft();
        move();
        putBeeper();
        move();
        turnLeft();
        setFive();
    }
}
