import java.util.*;
import greenfoot.*;

/**
 * A cloud that moves back and forth between two defined points.
 */
public class Cloud extends Actor
{
    private int speed = 10;
    private int leftTurn = 595;
    private int rightTurn = 1050;

    /**
     * Move in the direction we are currently moving in. Turn if we reach a turning point.
     */
    public void act()
    {
        setLocation(getX() + speed, getY());
        
        Actor actor = getOneIntersectingObject(null);
        if (actor != null) {
            actor.setLocation(actor.getX() + speed, actor.getY());
        }
        
        if (atTurningPoint()) {
            speed =  - speed;
        }
    }

    /**
     * Test if we are at one of the turning points.
     */
    public boolean atTurningPoint()
    {
        return getX() <= leftTurn || getX() >= rightTurn;
    }
}
