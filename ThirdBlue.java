import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThirdBlue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThirdBlue extends World
{

    /**
     * Constructor for objects of class ThirdBlue.
     * 
     */
    public ThirdBlue()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(520, 525, 1); 
        setBackground(new GreenfootImage("images/ThirdHouse2.png"));
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
