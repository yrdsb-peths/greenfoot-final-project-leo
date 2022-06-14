import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyBuilding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyBuilding extends World
{

    /**
     * Constructor for objects of class MyBuilding.
     * 
     */
    public MyBuilding()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 480, 1); 
        setBackground(new GreenfootImage("images/build1.png"));
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
