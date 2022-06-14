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
    
    Label titleLabel = new Label("Choose Time limit, Then Start", 30);
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
        super(600, 309, 1); 
        setBackground(new GreenfootImage("images/diff1.png"));
        
        addObject(titleLabel, 50, 50);
        addObject(titleLabel2, 75, 75);
        addObject(titleLabel3, 75, 100);
        addObject(titleLabel4, 75, 150);
        addObject(titleLabel5, 75, 200);
        addObject(titleLabel6, 75, 250);
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
            timeValue = 30;
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);

            
        }
        
        if(Greenfoot.isKeyDown("2"))
        {
            timeValue = 60;
            MyWorld GameWorld = new MyWorld();
            Greenfoot.setWorld(GameWorld);
        }
        
        if(Greenfoot.isKeyDown("3"))
        {
            timeValue = 120;
            MyWorld GameWorld = new MyWorld();
            Greenfoot.setWorld(GameWorld);
        }
        
        if(Greenfoot.isKeyDown("4"))
        {
            timeValue = 180;
            MyWorld GameWorld = new MyWorld();
            Greenfoot.setWorld(GameWorld);
        }
        
    }
}
