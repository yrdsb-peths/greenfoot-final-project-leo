import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyHouse2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyHouse2 extends World
{

    /**
     * Constructor for objects of class MyHouse2.
     * 
     */
    public MyHouse2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(316, 364, 1); 
        setBackground(new GreenfootImage("images/lobby2.jpg"));
        
        Boundary bound1 = new Boundary(200, 10);
        addObject(bound1, 20, 400);
        
        Boundary bound2 = new Boundary(200, 10);
        addObject(bound2, 280, 400);
        
        Boundary bound3 = new Boundary(30, 210);
        addObject(bound3, 20, 210);
        
        Boundary bound4 = new Boundary(30, 210);
        addObject(bound4, 300, 210);
        
        Boundary bound5 = new Boundary(10, 30);
        addObject(bound5, 5, 340);
        
        Boundary bound6 = new Boundary(10, 30);
        addObject(bound6, 340, 340);
        
        Boundary bound7 = new Boundary(120, 120);
        addObject(bound7, 160, 160);
        
        Boundary bound8 = new Boundary(316, 20);
        addObject(bound8, 150, 20);
        
        Boundary bound9 = new Boundary(10, 70);
        addObject(bound9, 5, 60);
        
        Boundary bound10 = new Boundary(10, 70);
        addObject(bound10, 310, 60);
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
