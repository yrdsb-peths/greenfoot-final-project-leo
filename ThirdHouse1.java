import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThirdHouse1 here.
 * 
 * building for the Egg to spawn in
 * 
 * @author Leo Xu
 * @date June 15 2022
 */
public class ThirdHouse1 extends World
{
    SimpleTimer timer = new SimpleTimer();
    Label timeLabel = new Label("", 30);
    
    public ThirdHouse1()
    {    
        // Create a new world with 400x292 cells with a cell size of 1x1 pixels.
        super(400, 292, 1); 
        setBackground(new GreenfootImage("images/ThirdHouse1.png"));
        
        addObject(timeLabel, 270, 40);
        
        //boundaries for ThirdHouse1
        Boundary bound1 = new Boundary(150, 10);
        addObject(bound1, 70, 270);
        
        Boundary bound2 = new Boundary(150, 10);
        addObject(bound2, 300, 270);
        
        Boundary bound3 = new Boundary(500, 10);
        addObject(bound3, 180, 170);
        
        Boundary bound4 = new Boundary(10, 150);
        addObject(bound4, 80, 220);
        
        Boundary bound5 = new Boundary(10, 150);
        addObject(bound5, 300, 220);
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
