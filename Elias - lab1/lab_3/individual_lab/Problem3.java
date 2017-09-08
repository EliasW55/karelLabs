package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        reposition();
        checkRoom();
        reposition();
        checkRoom();
        reposition();
        checkRoom();
        reposition();
        checkRoom();
        reposition();
        checkRoom();
        reposition();
        checkRoom();
        reposition();
        checkRoom();
        reposition();
        checkRoom();
        reposition();
        
    }
        public boolean leftWall() {
        faceWest();
        if(frontIsClear()) {
            return false;
        }
        else {
            return true;
        }
    }
    public boolean rightWall() {
        faceEast();
        if(frontIsClear()) {
            return false;
        }
        else {
            return true;
        }
    }
    public boolean ceiling() {
        faceNorth();
        if(frontIsClear()) {
            return false;
        }
        else {
            return true;
        }
    }
    public void faceWest() {
        while(!facingWest()) {
            turnLeft();
        }     
    }
    public void faceEast() {
        while(!facingEast()) {
            turnLeft();
        }
    }
    public void faceNorth() {
        while(!facingNorth()) {
            turnLeft();
        }
    }
    public void faceSouth() {
        while(!facingSouth()) {
            turnLeft();
        }
    }
    public void checkRoom() {
        while(ceiling()) {
            if(leftWall() && rightWall()) {
                faceNorth();
                putBeeper();
                move();
            }
            else {
               walkOutFail();
            }
        }
        putBeeper();
        walkOutSuccess();
    }
    public void walkOutFail() {
        while(!leftWall() || !rightWall()) {
            faceSouth();
            move();
            pickBeeper();
        }
        turnLeft();
    }
    public void walkOutSuccess() {
        while(leftWall() || rightWall()) {
            faceSouth();
            move();
        }
        turnLeft();
    }
    public void reposition() {
        faceEast();
        move();
        turnLeft();
        move();
    }
}
