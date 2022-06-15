import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OtherWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OtherWorld extends World
{

    /**
     * Constructor for objects of class OtherWorld.
     * 
     */
    
    
    
    int time = Difficulty.timeValue;
    SimpleTimer timer = new SimpleTimer();
    //label in my world
    Label timeLabel = new Label("", 60);
    
    
    
    OtherHouse1 other1;
    OtherHouse2 other2;
    OtherHouse3 other3;
    public OtherWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(688, 636, 1); 
        setBackground(new GreenfootImage("images/town2.png"));
        
        addObject(timeLabel, 300, 300);// add time label
        
        
        Portal portal = new Portal();
        this.addObject(portal, 5011, 16011);
        
        portal = new Portal();
        this.addObject(portal, 100, 160); // otherHouse1 portal
        portal = new Portal(portal);
        other1 = new OtherHouse1(); // creates a different world
        other1.addObject(portal, 270, 400);
        
        portal = new Portal();
        this.addObject(portal, 140, 550); // otherHous2 portal
        portal = new Portal(portal);
        other2 = new OtherHouse2(); // creates a different world
        other2.addObject(portal, 270, 400);
    
        portal = new Portal();
        this.addObject(portal, 550, 420); // otherHouse3 portal
        portal = new Portal(portal);
        other3 = new OtherHouse3(); // creates a different world
        other3.addObject(portal, 270, 400);
        
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
        
        Boundary bound13 = new Boundary(135, 75);
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
         MouseInfo m = Greenfoot.getMouseInfo();
        if (m != null)
        {
            showText(String.valueOf(m.getX()), 200, 200);
            showText(String.valueOf(m.getY()), 300, 200);
        }
        
        if(timer.millisElapsed() >= 1000)
        {
            timer.mark();
            time--;
            timeLabel.setValue("time left: " + time);
                        
        }
        
        
        if (time == 0)
        {
            LoseScreen gameWorld = new LoseScreen();
            Greenfoot.setWorld(gameWorld);
            MyWorld.music.stop();
            
        }


    }
    
    
    
    
}
