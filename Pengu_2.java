import java.util.*;
import greenfoot.*;

/**
 * A little penguin that wants to get to the other side.
 */
public class Pengu_2 extends Mover
{
    private static final int jumpStrength = 22;

    /**
     * Check keyboard input and react accordingly.
     */
    public void act()
    {
        checkKeys();
        checkFall();
    }

    /**
     * 
     */
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("left")) {
            setImage("pengu-left.png");
            moveLeft();
        }
        if (Greenfoot.isKeyDown("right")) {
            setImage("pengu-right.png");
            moveRight();
        }
        if (Greenfoot.isKeyDown("0")) {
            if (onGround()) {
                jump();
            }
        }
    }

    /**
     * Start a jump action.
     */
    private void jump()
    {
        setVSpeed( - jumpStrength);
        fall();
    }

    /**
     * Check whether we are falling. If so, fall. If we're on ground, stop the fall.
     */
    private void checkFall()
    {
        if (onGround()) {
            setVSpeed(0);
        }
        else {
            fall();
        }
    }
}
