import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyHouse1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyHouse1 extends World
{

    /**
     * Constructor for objects of class MyHouse1.
     * 
     */
    public MyHouse1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(316, 364, 1); 
        setBackground(new GreenfootImage("images/lobby1.jpg"));
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
