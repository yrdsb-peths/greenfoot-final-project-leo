import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyHouse3 here.
 * 
 * building for the Egg to spawn in
 * 
 * Leo Xu
 * June 15 2022
 */
public class MyHouse3 extends World
{
    SimpleTimer timer = new SimpleTimer();
    Label timeLabel = new Label("", 30);
    
    public MyHouse3()
    {    
        // Create a new world with 309x249 cells with a cell size of 1x1 pixels.
        super(309, 249, 1); 
        setBackground(new GreenfootImage("images/house1.png"));
        
        addObject(timeLabel, 160, 60);
        
        //boundaries for MyHouse3
        Boundary bound1 = new Boundary(275, 10);
        addObject(bound1, 150, 75);
        
        Boundary bound2 = new Boundary(10, 275);
        addObject(bound2, 290, 150);
        
        Boundary bound3 = new Boundary(10, 275);
        addObject(bound3, 30, 150);
        
        Boundary bound4 = new Boundary(100, 10);
        addObject(bound4, 80, 230);
        
        Boundary bound5 = new Boundary(100, 10);
        addObject(bound5, 240, 230);
        
        Boundary bound6 = new Boundary(100, 5);
        addObject(bound6, 150, 249);
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
