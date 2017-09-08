package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

/**
 * Problem 1 - Elias Warres
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    
    public void faceEast() {
        while(!facingEast()) {
            turnLeft();
        }
    }
}

