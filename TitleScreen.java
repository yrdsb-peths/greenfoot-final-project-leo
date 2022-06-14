import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Egg Hunt", 60);
    Label titleLabel2 = new Label("Press <Space> To Play", 30);
    Label titleLabel3 = new Label("Press <e> For Instuctions", 30);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        addObject(titleLabel2, 150, 300);
        addObject(titleLabel3, 200, 100);
        
        
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Difficulty GameWorld = new Difficulty();
            Greenfoot.setWorld(GameWorld);
        }
        
        if(Greenfoot.isKeyDown("e"))
        {
            Tutorial gameWorld = new Tutorial();
            Greenfoot.setWorld(gameWorld);
        }
        
    }
}
