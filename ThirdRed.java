import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThirdRed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThirdRed extends World
{

    /**
     * Constructor for objects of class ThirdRed.
     * 
     */
    public ThirdRed()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 608, 1); 
        setBackground(new GreenfootImage("images/ThirdHouse3.png"));
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
