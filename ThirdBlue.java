import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThirdBlue here.
 * 
 * building for the Egg to spawn in
 * 
 * @author Leo Xu
 * @date June 15 2022
 */
public class ThirdBlue extends World
{
    SimpleTimer timer = new SimpleTimer();
    Label timeLabel = new Label("", 60);
    
    public ThirdBlue()
    {    
        // Create a new world with 520x525 cells with a cell size of 1x1 pixels.
        super(520, 525, 1); 
        setBackground(new GreenfootImage("images/ThirdHouse2.png"));
        
        addObject(timeLabel, 270, 40);
        
        //boundaries for ThirdBlue
        Boundary bound1 = new Boundary(1000, 25);
        addObject(bound1, 260, 150);
        
        Boundary bound2 = new Boundary(1000, 25);
        addObject(bound2, 260, 500);
        
        Boundary bound3 = new Boundary(300, 75);
        addObject(bound3, 90, 440);
        
        Boundary bound4 = new Boundary(300, 75);
        addObject(bound4, 475, 440);
        
        Boundary bound5 = new Boundary(25, 500);
        addObject(bound5, 20, 250);
        
        Boundary bound6 = new Boundary(25, 500);
        addObject(bound6, 500, 250);
        
        Boundary bound7 = new Boundary(25, 100);
        addObject(bound7, 220, 220);
        
        Boundary bound8 = new Boundary(150, 25);
        addObject(bound8, 130, 270);
        
        Boundary bound9 = new Boundary(25, 30);
        addObject(bound9, 380, 300);
    }
    
    public void act()
    {
        if(timer.millisElapsed() >= 1000)//TimeKeeper tracks the time
        {
            timer.mark();
            TimeKeeper.Updatetime();
            timeLabel.setValue("time left: " + TimeKeeper.timeleft);        
        }
        if (TimeKeeper.timeleft == 0)//TimeKeeper tracks the time
        {
            LoseScreen gameWorld = new LoseScreen();
            Greenfoot.setWorld(gameWorld);
            MyWorld.music.stop();//stops the gameplay music
        }
    }
}
