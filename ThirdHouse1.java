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
