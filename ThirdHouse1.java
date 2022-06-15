import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThirdHouse1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThirdHouse1 extends World
{

    /**
     * Constructor for objects of class ThirdHouse1.
     * 
     */
    public ThirdHouse1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 292, 1); 
        setBackground(new GreenfootImage("images/ThirdHouse1.png"));
        
        Boundary bound1 = new Boundary(150, 10);
        addObject(bound1, 70, 270);
        
        Boundary bound2 = new Boundary(150, 10);
        addObject(bound2, 300, 270);
        
        Boundary bound3 = new Boundary(500, 10);
        addObject(bound3, 180, 170);
        
        Boundary bound4 = new Boundary(10, 150);
        addObject(bound4, 80, 220);
        
        Boundary bound5 = new Boundary(10, 150);
        addObject(bound5, 300, 220);
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
