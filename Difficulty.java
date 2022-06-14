import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Difficulty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Difficulty extends World
{

    /**
     * Constructor for objects of class Difficulty.
     * 
     */
    
    Label titleLabel = new Label("Choose Time limit", 30);
    Label titleLabel2 = new Label("Press <f> To Go Back", 30);
    public Difficulty()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titleLabel, 50, 50);
        addObject(titleLabel2, 75, 75);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("f"))
        {
            TitleScreen gameWorld = new TitleScreen();
            Greenfoot.setWorld(gameWorld);
        }
        
        if(Greenfoot.isKeyDown("1"))
        {
            MyWorld GameWorld = new MyWorld();
            Greenfoot.setWorld(GameWorld);
        }
        
    }
}
