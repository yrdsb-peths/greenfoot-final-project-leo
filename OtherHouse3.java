import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OtherHouse3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OtherHouse3 extends World
{

    /**
     * Constructor for objects of class OtherHouse3.
     * 
     */
    public OtherHouse3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(474, 430, 1); 
        setBackground(new GreenfootImage("images/OtherHouse1.png"));
        
        Boundary bound1 = new Boundary(100, 20);
        addObject(bound1, 50, 220);
        
        Boundary bound2 = new Boundary(20, 120);
        addObject(bound2, 30, 310);
        
        Boundary bound3 = new Boundary(20, 180);
        addObject(bound3, 90, 100);
        
        Boundary bound4 = new Boundary(360, 20);
        addObject(bound4, 280, 100);
        
        Boundary bound5 = new Boundary(250, 20);
        addObject(bound5, 100, 385);
        
        Boundary bound6 = new Boundary(250, 20);
        addObject(bound6, 430, 385);
        
        Boundary bound7 = new Boundary(250, 10);
        addObject(bound7, 300, 500);
        
        Boundary bound8 = new Boundary(20, 200);
        addObject(bound8, 315, 150);
        
        Boundary bound9 = new Boundary(20, 500);
        addObject(bound9, 475, 200);
        
        Boundary bound10 = new Boundary(50, 100);
        addObject(bound10, 425, 275);
        
        Boundary bound11 = new Boundary(45, 45);
        addObject(bound11, 235, 235);
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
