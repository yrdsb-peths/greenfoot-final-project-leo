import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OtherWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OtherWorld extends World
{

    /**
     * Constructor for objects of class OtherWorld.
     * 
     */
    
    MyWorld my;
    
    int time = Difficulty.timeValue;
    SimpleTimer timer = new SimpleTimer();
    //label in my world
    Label timeLabel = new Label("", 60);
    
    
    
    OtherHouse1 other1;
    OtherHouse2 other2;
    OtherHouse3 other3;
    public OtherWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(688, 636, 1); 
        setBackground(new GreenfootImage("images/town2.png"));
        
        addObject(timeLabel, 300, 300);// add time label
        
        
        Portal portal = new Portal();
        this.addObject(portal, 5011, 16011);
        
        portal = new Portal();
        this.addObject(portal, 100, 160); // otherHouse1 portal
        portal = new Portal(portal);
        other1 = new OtherHouse1(); // creates a different world
        other1.addObject(portal, 270, 400);
        
        portal = new Portal();
        this.addObject(portal, 140, 550); // otherHous2 portal
        portal = new Portal(portal);
        other2 = new OtherHouse2(); // creates a different world
        other2.addObject(portal, 270, 400);
    
        portal = new Portal();
        this.addObject(portal, 550, 420); // otherHouse3 portal
        portal = new Portal(portal);
        other3 = new OtherHouse3(); // creates a different world
        other3.addObject(portal, 270, 400);
        
    }
    
    public void act()
    {
         MouseInfo m = Greenfoot.getMouseInfo();
        if (m != null)
        {
            showText(String.valueOf(m.getX()), 200, 200);
            showText(String.valueOf(m.getY()), 300, 200);
        }
        
        if(timer.millisElapsed() >= 1000)
        {
            timer.mark();
            time--;
            timeLabel.setValue("time left: " + time);
                        
        }
        
        


    }
    
    
    
    
}
