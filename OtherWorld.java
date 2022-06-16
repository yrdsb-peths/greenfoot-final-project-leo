import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OtherWorld here.
 * 
 * Another world that can be accessed from the portal of MyWorld
 * Has portals leading to OtherHouse1, OtherHouse2, OtherHouse3
 * 
 * @author Leo Xu
 * @date June 15 2022
 */
public class OtherWorld extends World
{
    SimpleTimer timer = new SimpleTimer();
    Label timeLabel = new Label("", 60);
    
    //World instances
    static OtherHouse1 other1;
    static OtherHouse2 other2;
    static OtherHouse3 other3;
    
    public OtherWorld()
    {    
        // Create a new world with 688x636 cells with a cell size of 1x1 pixels.
        super(688, 636, 1); 
        setBackground(new GreenfootImage("images/town2.png"));
        
        addObject(timeLabel, 350, 80);// add time label
        
        //main portal that allows portals to other worlds work
        Portal portal = new Portal();
        this.addObject(portal, 9999, 9999);
        
        portal = new Portal(); // OtherHouse1 portal
        this.addObject(portal, 100, 160);
        portal = new Portal(portal);
        other1 = new OtherHouse1();
        other1.addObject(portal, 270, 400);
        
        portal = new Portal();// OtherHous2 portal
        this.addObject(portal, 140, 550); 
        portal = new Portal(portal);
        other2 = new OtherHouse2(); 
        other2.addObject(portal, 270, 400);
    
        portal = new Portal();// OtherHouse3 portal
        this.addObject(portal, 550, 420);
        portal = new Portal(portal);
        other3 = new OtherHouse3(); 
        other3.addObject(portal, 270, 400);
        
        //boundaries for OtherWorld
        Boundary bound1 = new Boundary(500, 100);
        addObject(bound1, 420, 55);
        
        Boundary bound2 = new Boundary(50, 100);
        addObject(bound2, 650, 150);
        
        Boundary bound3 = new Boundary(230, 200);
        addObject(bound3, 35, 35);
        
        Boundary bound4 = new Boundary(5, 50);
        addObject(bound4, 2, 160);
        
        Boundary bound5 = new Boundary(50, 220);
        addObject(bound5, 20, 290);
        
        Boundary bound6 = new Boundary(150, 150);
        addObject(bound6, 135, 310);
        
        Boundary bound7 = new Boundary(1000, 1);
        addObject(bound7, 330, 636);
        
        Boundary bound8 = new Boundary(10, 1000);
        addObject(bound8, 2, 500);
        
        Boundary bound9 = new Boundary(50, 150);
        addObject(bound9, 460, 440);
        
        Boundary bound10 = new Boundary(75, 150);
        addObject(bound10, 640, 550);
        
        Boundary bound11 = new Boundary(100, 40);
        addObject(bound11, 590, 610);
        
        Boundary bound12 = new Boundary(50, 50);
        addObject(bound12, 480, 500);
        
        Boundary bound13 = new Boundary(135, 50);
        addObject(bound13, 140, 490);
        
        Boundary bound14 = new Boundary(170, 110);
        addObject(bound14, 350, 510);
        
        Boundary bound15 = new Boundary(100, 20);
        addObject(bound15, 240, 550);
        
        Boundary bound16 = new Boundary(80, 230);
        addObject(bound16, 340, 280);
        
        Boundary bound17 = new Boundary(190, 20);
        addObject(bound17, 570, 370);
        
        Boundary bound18 = new Boundary(80, 220);
        addObject(bound18, 650, 390);
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
