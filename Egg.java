import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Egg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Egg extends Actor
{
    /**
     * Act - do whatever the Egg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage eggImage = new GreenfootImage ("images/egg.png");
    
    public Egg()
    {
        eggImage.scale(35, 35);
        setImage(eggImage);
    }
    
    
    public void act()
    {
        // Add your action code here.
        
    }
}
