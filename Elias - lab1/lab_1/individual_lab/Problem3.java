package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void giveCarlBeeper() {
        turnRight();
        move();
        move();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        turnRight();
        
    }
    
    public void pickAndMoveBeeper() {
        pickBeeper();
        turnLeft();
        move();
        move();
        putBeeper();
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
    }
    public void turnRight() {
       turnLeft();
       turnLeft();
       turnLeft();
    }
   
}