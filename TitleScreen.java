import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * This is the main menu of the game with buttons leading to play the game, and instructions/controls
 *
 * Leo  Xu
 * June 15 2022
 *
 *
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Egg Hunt", 90);
    Label titleLabel2 = new Label("Press <Space> To Play", 30);
    Label titleLabel3 = new Label("Press <e> For Instructions", 30);
    Label titleLabel4 = new Label("By Leo Xu", 30);
    
    static GreenfootSound mainTheme = new GreenfootSound("sounds/Genshin.mp3");
    
    public TitleScreen()
    {    
        // Create a new world with 600x533 cells with a cell size of 1x1 pixels.
        super(600, 533, 1);
        setBackground(new GreenfootImage("images/egg1.png"));
        
        addObject(titleLabel, 300, 200);
        addObject(titleLabel2, 300, 400);
        addObject(titleLabel3, 300, 450);
        addObject(titleLabel4, 300, 300);
    }
    
    public void act()
    {
        mainTheme.setVolume(50);
        mainTheme.play();
        
        if(Greenfoot.isKeyDown("space"))//goes to the Difficulty world to select time limit difficulty
        {
            Difficulty GameWorld = new Difficulty();
            Greenfoot.setWorld(GameWorld);
        }
        if(Greenfoot.isKeyDown("e"))//goes to the Tutorial world for gameplay instuctions
        {
            Tutorial gameWorld = new Tutorial();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
