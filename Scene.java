import java.util.*;
import greenfoot.*;

/**
 * This is the whole scene. It creates and contains the objects that are in it.
 */
public class Scene extends World
{

    /**
     * 
     */
    public Scene()
    {
        super(1280,720, 1);
        addObject( new Cliff(false), 50, 1200);
        addObject( new Cliff(true), 1206,720);

        
        
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Pengu pengu = new Pengu();
        addObject(pengu,51,527);
        Pengu_2 pengu_2 = new Pengu_2();
        addObject(pengu_2,1205,525);

        Could_stable could_stable = new Could_stable();
        addObject(could_stable,286,554);
        Could_stable could_stable2 = new Could_stable();
        addObject(could_stable2,446,454);
        Could_stable could_stable3 = new Could_stable();
        addObject(could_stable3,897,411);
        Could_stable could_stable4 = new Could_stable();
        addObject(could_stable4,633,328);
        Could_stable could_stable5 = new Could_stable();
        addObject(could_stable5,252,194);
        Could_stable could_stable6 = new Could_stable();
        addObject(could_stable6,127,317);
        Could_stable could_stable7 = new Could_stable();
        addObject(could_stable7,461,228);
        Could_stable could_stable8 = new Could_stable();
        addObject(could_stable8,744,615);
        Could_stable could_stable9 = new Could_stable();
        addObject(could_stable9,952,673);
        Could_stable could_stable10 = new Could_stable();
        addObject(could_stable10,1039,299);
        Could_stable could_stable11 = new Could_stable();
        addObject(could_stable11,834,178);
        Could_stable could_stable12 = new Could_stable();
        addObject(could_stable12,636,96);
        Could_stable could_stable13 = new Could_stable();
        addObject(could_stable13,738,95);
        Could_stable could_stable14 = new Could_stable();
        addObject(could_stable14,528,94);
        Could_stable could_stable15 = new Could_stable();
        addObject(could_stable15,419,91);
        Could_stable could_stable16 = new Could_stable();
        addObject(could_stable16,830,94);
        could_stable8.setLocation(746,564);
    }
}
