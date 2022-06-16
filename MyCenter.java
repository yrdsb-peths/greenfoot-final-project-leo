import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyCenter here.
 * 
 * building for the Egg to spawn in
 * 
 * Leo Xu
 * June 15 2022
 */
public class MyCenter extends World
{
    SimpleTimer timer = new SimpleTimer();
    Label timeLabel = new Label("", 30);
    
    public MyCenter()
    {    
        // Create a new world with 645x450 cells with a cell size of 1x1 pixels.
        super(645, 450, 1); 
        setBackground(new GreenfootImage("images/pokeCenter.png"));
        
        addObject(timeLabel, 320, 60);
        
        //boudaries for MyCenter
        Boundary bound1 = new Boundary(275, 100);
        addObject(bound1, 325, 115);
        
        Boundary bound2 = new Boundary(80, 60);
        addObject(bound2, 40, 300);
        
        Boundary bound3 = new Boundary(5, 600);
        addObject(bound3, 645, 200);
        
        Boundary bound6 = new Boundary(5, 600);
        addObject(bound6, 0, 200);
        
        Boundary bound7 = new Boundary(800, 5);
        addObject(bound7, 300, 100);
        
        Boundary bound8 = new Boundary(300, 25);
        addObject(bound8, 120, 450);
        
        Boundary bound9 = new Boundary(275, 25);
        addObject(bound9, 510, 450);
        
        Boundary bound10 = new Boundary(275, 1);
        addObject(bound10, 250, 450);
        
        Boundary bound11 = new Boundary(60, 50);
        addObject(bound11, 515, 330);
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
