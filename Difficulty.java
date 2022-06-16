import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Difficulty here.
 * 
 * This is world allows you to choose the time limit as difficulty
 * 
 * Leo Xu
 * June 15 2022
 */
public class Difficulty extends World
{
    Label titleLabel = new Label("Choose Time Limit Difficulty, Then Game Will Start", 30);
    Label titleLabel2 = new Label("Press <f> To Go Back", 30);
    Label titleLabel3 = new Label("30 Seconds (Press <1>)", 30);
    Label titleLabel4 = new Label("1 Minute (Press <2>)", 30);
    Label titleLabel5 = new Label("2 Minutes (Press <3>)", 30);
    Label titleLabel6 = new Label("3 Minutes (Press <4>)", 30);
    
    public static int timeValue;//stores the time as seconds
    public Difficulty()
    {    
        // Create a new world with 1050x540 cells with a cell size of 1x1 pixels.
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
        if(Greenfoot.isKeyDown("f"))//go back button
        {
            TitleScreen gameWorld = new TitleScreen();
            Greenfoot.setWorld(gameWorld);
        }
        if(Greenfoot.isKeyDown("1"))//30 seconds as the time limit
        {
            timeValue = 30;
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
            TitleScreen.mainTheme.stop();//stops the main menu music
        }
        if(Greenfoot.isKeyDown("2"))//1 minute(60 seconds) as the time limit
        {
            timeValue = 60;
            MyWorld GameWorld = new MyWorld();
            Greenfoot.setWorld(GameWorld);
            TitleScreen.mainTheme.stop();//stops the main menu music
        }
        if(Greenfoot.isKeyDown("3"))//2 minute(120 seconds) as the time limit
        {
            timeValue = 120;
            MyWorld GameWorld = new MyWorld();
            Greenfoot.setWorld(GameWorld);
            TitleScreen.mainTheme.stop();//stops the main menu music
        }
        if(Greenfoot.isKeyDown("4"))//3 minute(180 seconds) as the time limit
        {
            timeValue = 180;
            MyWorld GameWorld = new MyWorld();
            Greenfoot.setWorld(GameWorld);
            TitleScreen.mainTheme.stop();//stops the main menu music
        }
    }
}
