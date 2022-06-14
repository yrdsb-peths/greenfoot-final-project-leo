import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LoseScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoseScreen extends World
{
    Label titleLabel = new Label("Return To Main Menu(Press <f>", 30);
    
    /**
     * Constructor for objects of class LoseScreen.
     * 
     */
    
    GreenfootSound loseTheme = new GreenfootSound("fail.mp3");
    public LoseScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(titleLabel, 100, 100);
        loseTheme.setVolume(20);
        loseTheme.play();
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
