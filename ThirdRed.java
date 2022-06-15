import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThirdRed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThirdRed extends World
{

    /**
     * Constructor for objects of class ThirdRed.
     * 
     */
    public ThirdRed()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 608, 1); 
        setBackground(new GreenfootImage("images/ThirdHouse3.png"));
        
        Boundary bound1 = new Boundary(10, 550);
        addObject(bound1, 120, 250);
        
        Boundary bound2 = new Boundary(150, 100);
        addObject(bound2, 145, 580);
        
        Boundary bound3 = new Boundary(150, 100);
        addObject(bound3, 400, 580);
        
        Boundary bound4 = new Boundary(150, 10);
        addObject(bound4, 310, 600);
        
        Boundary bound5 = new Boundary(100, 100);
        addObject(bound5, 180, 130);
        
        Boundary bound6 = new Boundary(225, 25);
        addObject(bound6, 560, 450);
        
        Boundary bound7 = new Boundary(275, 25);
        addObject(bound7, 520, 500);
        
        Boundary bound8 = new Boundary(10, 125);
        addObject(bound8, 680, 360);
        
        Boundary bound9 = new Boundary(10, 550);
        addObject(bound9, 705, 250);
        
        Boundary bound10 = new Boundary(600, 10);
        addObject(bound10, 390, 50);
        
        Boundary bound11 = new Boundary(250, 100);
        addObject(bound11, 560, 130);
        
        Boundary bound12 = new Boundary(50, 100);
        addObject(bound12, 210, 350);
        
        Boundary bound13 = new Boundary(100, 40);
        addObject(bound13, 560, 300);

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
