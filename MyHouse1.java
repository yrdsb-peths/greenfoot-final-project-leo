import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyHouse1 here.
 * 
 * building for the Egg to spawn in
 * 
 * Leo Xu
 * June 15 2022
 */
public class MyHouse1 extends World
{
    SimpleTimer timer = new SimpleTimer();
    Label timeLabel = new Label("", 30);
    
    public MyHouse1()
    {    
        // Create a new world with 316x364 cells with a cell size of 1x1 pixels.
        super(316, 364, 1); 
        setBackground(new GreenfootImage("images/lobby1.jpg"));
        
        addObject(timeLabel, 160, 30);
        
        //boundaries for MyHouse1
        Boundary bound1 = new Boundary(200, 10);
        addObject(bound1, 20, 400);
        
        Boundary bound2 = new Boundary(200, 10);
        addObject(bound2, 280, 400);
        
        Boundary bound3 = new Boundary(30, 210);
        addObject(bound3, 20, 210);
        
        Boundary bound4 = new Boundary(30, 210);
        addObject(bound4, 300, 210);
        
        Boundary bound5 = new Boundary(10, 30);
        addObject(bound5, 5, 340);
        
        Boundary bound6 = new Boundary(10, 30);
        addObject(bound6, 340, 340);
        
        Boundary bound7 = new Boundary(120, 120);
        addObject(bound7, 160, 160);
        
        Boundary bound8 = new Boundary(316, 20);
        addObject(bound8, 150, 20);
        
        Boundary bound9 = new Boundary(10, 70);
        addObject(bound9, 5, 60);
        
        Boundary bound10 = new Boundary(10, 70);
        addObject(bound10, 310, 60);
    }
    
    public void act()
    {
        if(timer.millisElapsed() >= 1000)//TimeKeeper tracks the time
        {
            timer.mark();
            TimeKeeper.Updatetime();
            timeLabel.setValue("time left: " + TimeKeeper.timeleft);      
        }
        if (TimeKeeper.timeleft == 0)//if the time reaches 0, go to LoseScreen
        {
            LoseScreen gameWorld = new LoseScreen();
            Greenfoot.setWorld(gameWorld);
            MyWorld.music.stop();//stops the gameplay music
        }
    }
}
