package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{

    public Problem2(int st, int av, Direction dir, int beep)
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
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void checkRoom() {
        if(leftWall() && rightWall() && ceiling()) {
            putBeeper();
            walkOut();
        }
        else {
            walkOut();
        }
        
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
    public void walkOut() {
        faceSouth();
        move();
        turnLeft();
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
    public void reposition() {
        move();
        turnLeft();
        move();
    }
}

