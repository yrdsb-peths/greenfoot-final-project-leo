import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(578, 530, 1); 
        setBackground(new GreenfootImage("images/accumula.png"));
        
        Boundary bound1 = new Boundary(300, 10);
        addObject(bound1, 140, 470);
        
        Boundary bound2 = new Boundary(150, 10);
        addObject(bound2, 205, 345);
        
        Boundary bound3 = new Boundary(20, 60);
        addObject(bound3, 280, 440);
        
        Boundary bound4 = new Boundary(20, 250);
        addObject(bound4, 30, 330);
        
        Boundary bound5 = new Boundary(100, 130);
        addObject(bound5, 90, 275);
        
        
        
        Portal portal = new Portal();
        this.addObject(portal, 100, 100);
        
        Portal portal2 = new Portal(portal);
        this.addObject(portal2, 400, 100);
        
        
        
        
        
        
        Elephant ele = new Elephant();
        addObject(ele, 200, 200);
    }
}
