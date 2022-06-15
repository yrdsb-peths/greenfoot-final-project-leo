import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThirdHouse2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThirdHouse2 extends World
{

    /**
     * Constructor for objects of class ThirdHouse2.
     * 
     */
    public ThirdHouse2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(309, 249, 1); 
        setBackground(new GreenfootImage("images/house1.png"));
        
        Boundary bound1 = new Boundary(275, 10);
        addObject(bound1, 150, 75);
        
        Boundary bound2 = new Boundary(10, 275);
        addObject(bound2, 290, 150);
        
        Boundary bound3 = new Boundary(10, 275);
        addObject(bound3, 30, 150);
        
        Boundary bound4 = new Boundary(100, 10);
        addObject(bound4, 80, 230);
        
        Boundary bound5 = new Boundary(100, 10);
        addObject(bound5, 240, 230);
        
        Boundary bound6 = new Boundary(100, 5);
        addObject(bound6, 150, 249);
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
