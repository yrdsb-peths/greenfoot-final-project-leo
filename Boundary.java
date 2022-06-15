import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boundary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boundary extends Actor
{
    /**
     * Act - do whatever the Boundary wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage boundImage = new GreenfootImage ("images/baal.png");
    
    public Boundary (int width, int height)
    {
        
        boundImage.scale(width, height);
        setImage(boundImage);
    }
    
   
}
