import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen here.
 * 
 * This world displays the victory screen when you find the egg
 * 
 * Leo  Xu
 * June 15 2022
 * 
 */
public class WinScreen extends World
{
    GreenfootSound winTheme = new GreenfootSound("win.mp3");
    Label titleLabel = new Label("Return To Main Menu(Press <f>)", 30);

    public WinScreen()
    {    
        // Create a new world with 500x438 cells with a cell size of 1x1 pixels.
        super(500, 438, 1);
        addObject(titleLabel, 250, 350);
        setBackground(new GreenfootImage("images/win1.png"));
        MyWorld.music.stop();//stops the gameplay music
        winTheme.setVolume(20);
        winTheme.play();//play the win music
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("f"))//return to main menu(TitleScreen)
        {
            TitleScreen gameWorld = new TitleScreen();
            Greenfoot.setWorld(gameWorld);
            winTheme.stop();
        }
    }
}
