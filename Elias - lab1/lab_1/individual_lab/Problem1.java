package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
        public void findAllBeepers() {
        turnRight();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
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
    public void rearrangeBeepers() {
        findAllBeepers();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        reposition();
    }
   
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    } 
    
    public void moveThree() {
        move();
        move();
        move();
    }  
    
    public void putBeepers() {
        putBeeper();
        putBeeper();
        putBeeper();
        putBeeper();
        
    }
    public void reposition() {
        turnRight();
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
    }
    
}