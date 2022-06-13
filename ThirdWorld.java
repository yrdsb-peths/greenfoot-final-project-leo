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
    public ThirdWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1); 
        
        setBackground(new GreenfootImage("images/town3.png"));
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