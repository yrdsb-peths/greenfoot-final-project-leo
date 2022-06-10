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
    public OtherWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(688, 636, 1); 
        setBackground(new GreenfootImage("images/town2.png"));
        
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
