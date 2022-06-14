import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyHouse3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyHouse3 extends World
{

    /**
     * Constructor for objects of class MyHouse3.
     * 
     */
    public MyHouse3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(309, 249, 1); 
        setBackground(new GreenfootImage("images/house1.png"));
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
