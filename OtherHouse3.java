import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OtherHouse3 here.
 * 
 * building for the Egg to spawn in
 * 
 * Leo Xu
 * June 15 2022
 */
public class OtherHouse3 extends World
{
    SimpleTimer timer = new SimpleTimer();
    Label timeLabel = new Label("", 30);
    
    public OtherHouse3()
    {    
        // Create a new world with 474x430 cells with a cell size of 1x1 pixels.
        super(474, 430, 1); 
        setBackground(new GreenfootImage("images/OtherHouse1.png"));
        
        addObject(timeLabel, 260, 70);
        
        //boundaries for OtherHouse3
        Boundary bound1 = new Boundary(100, 20);
        addObject(bound1, 50, 220);
        
        Boundary bound2 = new Boundary(20, 120);
        addObject(bound2, 30, 310);
        
        Boundary bound3 = new Boundary(20, 180);
        addObject(bound3, 90, 100);
        
        Boundary bound4 = new Boundary(360, 20);
        addObject(bound4, 280, 100);
        
        Boundary bound5 = new Boundary(250, 20);
        addObject(bound5, 100, 385);
        
        Boundary bound6 = new Boundary(250, 20);
        addObject(bound6, 430, 385);
        
        Boundary bound7 = new Boundary(250, 10);
        addObject(bound7, 300, 500);
        
        Boundary bound8 = new Boundary(20, 200);
        addObject(bound8, 315, 150);
        
        Boundary bound9 = new Boundary(20, 500);
        addObject(bound9, 475, 200);
        
        Boundary bound10 = new Boundary(50, 100);
        addObject(bound10, 425, 275);
        
        Boundary bound11 = new Boundary(45, 45);
        addObject(bound11, 235, 235);
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
