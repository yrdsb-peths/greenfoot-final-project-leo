import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends World
{
    Label titleLabel = new Label("wasd to move", 30);
    Label titleLabel2 = new Label("Press <c> To Sprint", 30);
    Label titleLabel3 = new Label("Press <f> To Go Back", 30);
    Label titleLabel4 = new Label("Objective: Find The Egg to Win", 30);
    Label titleLabel5 = new Label("You Can Go Through Doors and Entrances", 30);
    
    
    /**
     * Constructor for objects of class Tutorial.
     * 
     */
    public Tutorial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, 100, 100);
        addObject(titleLabel2, 100, 150);
        addObject(titleLabel3, 100, 200);
        addObject(titleLabel4, 100, 250);
        addObject(titleLabel5, 100, 300);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("f"))
        {
            TitleScreen gameWorld = new TitleScreen();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
}
