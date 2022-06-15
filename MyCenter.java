import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyCenter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCenter extends World
{

    /**
     * Constructor for objects of class MyCenter.
     * 
     */
    public MyCenter()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(645, 450, 1); 
        setBackground(new GreenfootImage("images/pokeCenter.png"));
        
        Boundary bound1 = new Boundary(275, 100);
        addObject(bound1, 325, 115);
        
        Boundary bound2 = new Boundary(80, 60);
        addObject(bound2, 40, 300);
        
        Boundary bound3 = new Boundary(5, 600);
        addObject(bound3, 645, 200);
        
        Boundary bound6 = new Boundary(5, 600);
        addObject(bound6, 0, 200);
        
        Boundary bound7 = new Boundary(800, 5);
        addObject(bound7, 300, 100);
        
        Boundary bound8 = new Boundary(300, 25);
        addObject(bound8, 120, 450);
        
        Boundary bound9 = new Boundary(275, 25);
        addObject(bound9, 510, 450);
        
        Boundary bound10 = new Boundary(275, 1);
        addObject(bound10, 250, 450);
        
        Boundary bound11 = new Boundary(60, 50);
        addObject(bound11, 515, 330);
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
