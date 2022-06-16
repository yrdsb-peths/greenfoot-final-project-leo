import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LoseScreen here.
 * 
 * This world displays game over when you run out of time limit
 * 
 * @author Leo Xu
 * @date June 15 2022
 */
public class LoseScreen extends World
{
    Label titleLabel = new Label("Return To Main Menu(Press <f>)", 30);
    GreenfootSound loseTheme = new GreenfootSound("fail.mp3");
    
    public LoseScreen()
    {    
        // Create a new world with 539x410 cells with a cell size of 1x1 pixels.
        super(539, 410, 1);
        addObject(titleLabel, 275, 300);
        setBackground(new GreenfootImage("images/lose1.jpg"));
        MyWorld.music.stop();//stop the gameplay music
        loseTheme.setVolume(20);
        loseTheme.play();//play the game over music
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("f"))//goes back to main menu(TitleScreen)
        {
            TitleScreen gameWorld = new TitleScreen();
            Greenfoot.setWorld(gameWorld);
            loseTheme.stop();
        }
    }
}
