import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThirdWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThirdWorld extends World
{

    /**
     * Constructor for objects of class ThirdWorld.
     * 
     */
    
    ThirdHouse1 third1;
    ThirdRed third2;
    ThirdBlue third3;
    ThirdHouse2 third4;
    
    public ThirdWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1); 
        setBackground(new GreenfootImage("images/town3.png"));
        
        Portal portal = new Portal();
        this.addObject(portal, 5011, 16011);
        
        portal = new Portal();
        this.addObject(portal, 360, 280); // ThirdHouse1 portal
        portal = new Portal(portal);
        third1 = new ThirdHouse1(); // creates a different world
        third1.addObject(portal, 180, 270);
        
        portal = new Portal();
        this.addObject(portal, 270, 110); // ThirdHouse2 portal
        portal = new Portal(portal);
        third2 = new ThirdRed(); // creates a different world
        third2.addObject(portal, 270, 560);
        
        portal = new Portal();
        this.addObject(portal, 500, 90); // ThirdHouse3 portal
        portal = new Portal(portal);
        third3 = new ThirdBlue(); // creates a different world
        third3.addObject(portal, 280, 450);
        
        portal = new Portal();
        this.addObject(portal, 590, 290); // ThirdHouse3 portal
        portal = new Portal(portal);
        third4 = new ThirdHouse2(); // creates a different world
        third4.addObject(portal, 195, 320);
    }
    
    public void act()
    {
         MouseInfo m = Greenfoot.getMouseInfo();
        if (m != null)
        {
            showText(String.valueOf(m.getX()), 200, 200);
            showText(String.valueOf(m.getY()), 300, 200);
        }


    }
}
