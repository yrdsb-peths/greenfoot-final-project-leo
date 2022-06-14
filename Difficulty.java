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
    
    Label titleLabel = new Label("Choose Time Limit Difficulty, Then Game Will Start", 30);
    Label titleLabel2 = new Label("Press <f> To Go Back", 30);
    Label titleLabel3 = new Label("30 Seconds (Press <1>)", 30);
    Label titleLabel4 = new Label("1 Minute (Press <2>)", 30);
    Label titleLabel5 = new Label("2 Minutes (Press <3>)", 30);
    Label titleLabel6 = new Label("3 Minutes (Press <4>)", 30);
    
    //SimpleTimer time2 = new SimpleTimer();
    
    public static int timeValue;
    public Difficulty()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1050, 540, 1); 
        setBackground(new GreenfootImage("images/diff1.png"));
        
        addObject(titleLabel, 400, 80);
        addObject(titleLabel2, 150, 500);
        addObject(titleLabel3, 460, 200);
        addObject(titleLabel4, 475, 250);
        addObject(titleLabel5, 470, 300);
        addObject(titleLabel6, 470, 350);
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
            timeValue = 5;
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
            TitleScreen.mainTheme.stop();

            
        }
        
        if(Greenfoot.isKeyDown("2"))
        {
            timeValue = 60;
            MyWorld GameWorld = new MyWorld();
            Greenfoot.setWorld(GameWorld);
            TitleScreen.mainTheme.stop();
        }
        
        if(Greenfoot.isKeyDown("3"))
        {
            timeValue = 120;
            MyWorld GameWorld = new MyWorld();
            Greenfoot.setWorld(GameWorld);
            TitleScreen.mainTheme.stop();
        }
        
        if(Greenfoot.isKeyDown("4"))
        {
            timeValue = 180;
            MyWorld GameWorld = new MyWorld();
            Greenfoot.setWorld(GameWorld);
            TitleScreen.mainTheme.stop();
        }
        
        
    }
}
