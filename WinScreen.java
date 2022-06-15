import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen extends World
{

    GreenfootSound winTheme = new GreenfootSound("win.mp3");
    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    
    Label titleLabel = new Label("Return To Main Menu(Press <f>)", 30);

    public WinScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 438, 1);
        addObject(titleLabel, 250, 350);
        setBackground(new GreenfootImage("images/win1.png"));
        MyWorld.music.stop();
        winTheme.setVolume(20);
        winTheme.play();

    }

    public void act()
    {
        if(Greenfoot.isKeyDown("f"))
        {
            TitleScreen gameWorld = new TitleScreen();
            Greenfoot.setWorld(gameWorld);
            winTheme.stop();
        }
    }
}
