import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends World
{
    Label titleLabel = new Label("Use <wasd> To Move", 30);
    Label titleLabel2 = new Label("Press <c> To Sprint", 30);
    Label titleLabel3 = new Label("Press <f> To Go Back", 30);
    Label titleLabel4 = new Label("Objective: Find And Touch The Egg to Win", 30);
    Label titleLabel5 = new Label("You Can Go Through Doors and Entrances", 30);
    Label titleLabel6 = new Label("The Egg Is Hidden In One Of the Room/Building", 30);
    
    
    /**
     * Constructor for objects of class Tutorial.
     * 
     */
    public Tutorial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 534, 1); 
        setBackground(new GreenfootImage("images/tutorial1.png"));
        
        
        
        addObject(titleLabel, 150, 300);
        addObject(titleLabel2, 150, 350);
        addObject(titleLabel3, 150, 500);
        addObject(titleLabel4, 500, 400);
        addObject(titleLabel5, 500, 20);
        addObject(titleLabel5, 200, 350);
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
