import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThirdWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThirdWorld extends World
{
    //world instances
    static ThirdHouse1 third1;
    static ThirdRed third2;
    static ThirdBlue third3;
    static ThirdHouse2 third4;
    
    SimpleTimer timer = new SimpleTimer();
    Label timeLabel = new Label("", 60);
    
    public ThirdWorld()
    {    
        // Create a new world with 700x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1); 
        setBackground(new GreenfootImage("images/town3.png"));
        
        addObject(timeLabel, 350, 30);
        
        Portal portal = new Portal();//main portal that allows portals to other worlds work
        this.addObject(portal, 9999, 9999);
        
        portal = new Portal();// ThirdHouse1 portal
        this.addObject(portal, 360, 280); 
        portal = new Portal(portal);
        third1 = new ThirdHouse1(); 
        third1.addObject(portal, 180, 270);
        
        portal = new Portal();// ThirdHouse2 portal
        this.addObject(portal, 270, 110);
        portal = new Portal(portal);
        third2 = new ThirdRed();
        third2.addObject(portal, 270, 560);
        
        portal = new Portal();// ThirdHouse3 portal
        this.addObject(portal, 500, 90);
        portal = new Portal(portal);
        third3 = new ThirdBlue(); 
        third3.addObject(portal, 280, 450);
        
        portal = new Portal();// ThirdHouse3 portal
        this.addObject(portal, 590, 290); 
        portal = new Portal(portal);
        third4 = new ThirdHouse2(); 
        third4.addObject(portal, 160, 220);
        
        //boundaries for ThirdWorld
        Boundary bound1 = new Boundary(510, 150);
        addObject(bound1, 90, 10);
        
        Boundary bound2 = new Boundary(80, 400);
        addObject(bound2, 5, 200);
        
        Boundary bound3 = new Boundary(800, 40);
        addObject(bound3, 400, 400);
        
        Boundary bound4 = new Boundary(50, 150);
        addObject(bound4, 660, 285);
        
        Boundary bound5 = new Boundary(5, 600);
        addObject(bound5, 700, 285);
        
        Boundary bound6 = new Boundary(250, 75);
        addObject(bound6, 560, 25);
        
        Boundary bound7 = new Boundary(100, 25);
        addObject(bound7, 380, 240);
        
        Boundary bound8 = new Boundary(50, 25);
        addObject(bound8, 600, 240);
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
