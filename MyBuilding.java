import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyBuilding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyBuilding extends World
{

    /**
     * Constructor for objects of class MyBuilding.
     * 
     */
    
    SimpleTimer timer = new SimpleTimer();
    //label in my world
    Label timeLabel = new Label("", 30);
    public MyBuilding()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 480, 1); 
        setBackground(new GreenfootImage("images/build1.png"));
        
        addObject(timeLabel, 270, 140);
        
        
        Boundary bound1 = new Boundary(25, 300);
        addObject(bound1, 580, 190);
        
        Boundary bound2 = new Boundary(230, 10);
        addObject(bound2, 520, 150);
        
        Boundary bound3 = new Boundary(360, 10);
        addObject(bound3, 300, 210);
        
        Boundary bound4 = new Boundary(10, 80);
        addObject(bound4, 485, 175);
        
        Boundary bound5 = new Boundary(10, 80);
        addObject(bound5, 120, 175);
        
        Boundary bound6 = new Boundary(10, 100);
        addObject(bound6, 100, 130);
        
        Boundary bound7 = new Boundary(10, 100);
        addObject(bound7, 110, 130);
        
        Boundary bound8 = new Boundary(50, 60);
        addObject(bound8, 60, 80);
        
        Boundary bound9 = new Boundary(30, 400);
        addObject(bound9, 25, 250);
        
        Boundary bound10 = new Boundary(600, 20);
        addObject(bound10, 300, 460);
        
        Boundary bound11 = new Boundary(20, 100);
        addObject(bound11, 615, 390);
        
        Boundary bound12 = new Boundary(30, 30);
        addObject(bound12, 175, 310);
        
        Boundary bound13 = new Boundary(30, 20);
        addObject(bound13, 495, 280);
        
        Boundary bound14 = new Boundary(30, 30);
        addObject(bound14, 430, 400);
    }
    
    public void act()
    {
         MouseInfo m = Greenfoot.getMouseInfo();
        if (m != null)
        {
            showText(String.valueOf(m.getX()), 200, 200);
            showText(String.valueOf(m.getY()), 300, 200);
        }
        
        if(timer.millisElapsed() >= 1000)
        {
            timer.mark();
            TimeKeeper.Updatetime();
            timeLabel.setValue("time left: " + TimeKeeper.timeleft);
                        
        }
        
        
        if (TimeKeeper.timeleft == 0)
        {
            LoseScreen gameWorld = new LoseScreen();
            Greenfoot.setWorld(gameWorld);
            MyWorld.music.stop();
            
        }


    }
}
