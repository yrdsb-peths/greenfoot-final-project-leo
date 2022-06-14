import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Egg Hunt", 90);
    Label titleLabel2 = new Label("Press <Space> To Play", 30);
    Label titleLabel3 = new Label("Press <e> For Instuctions", 30);
    
    GreenfootSound mainTheme = new GreenfootSound("Genshin.mp3");
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 533, 1);
        setBackground(new GreenfootImage("images/egg1.png"));
        
        mainTheme.setVolume(25);
        mainTheme.play();
        
        addObject(titleLabel, 300, 200);
        addObject(titleLabel2, 300, 400);
        addObject(titleLabel3, 300, 450);
        
        
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Difficulty GameWorld = new Difficulty();
            Greenfoot.setWorld(GameWorld);
            mainTheme.stop();
        }
        
        if(Greenfoot.isKeyDown("e"))
        {
            Tutorial gameWorld = new Tutorial();
            Greenfoot.setWorld(gameWorld);
            mainTheme.stop();
        }
        
        mainTheme.setVolume(50);
        mainTheme.play();
        
    }
}
