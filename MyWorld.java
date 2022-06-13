import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(578, 530, 1); 
        setBackground(new GreenfootImage("images/accumula.png"));
        
        
        Portal portal = new Portal();
        this.addObject(portal, 5011, 16011);
        
        portal = new Portal(portal);
        this.addObject(portal, 35011, 45011);
        
        
        portal = new Portal();
        this.addObject(portal, 50, 160); // Otherworld portal
        portal = new Portal(portal);
        OtherWorld world2 = new OtherWorld(); // creates a different world
        world2.addObject(portal, 650, 230);
        
        
        portal = new Portal();
        this.addObject(portal, 335, 500); // Thirdworld portal
        portal = new Portal(portal);
        ThirdWorld world3 = new ThirdWorld(); // creates a different world
        world3.addObject(portal, 700, 170);
        
        
        
        
        Boundary bound1 = new Boundary(300, 10);
        addObject(bound1, 125, 470);
        
        Boundary bound2 = new Boundary(150, 10);
        addObject(bound2, 205, 345);
        
        Boundary bound3 = new Boundary(10, 60);
        addObject(bound3, 270, 440);
        
        Boundary bound4 = new Boundary(20, 250);
        addObject(bound4, 30, 335);
        
        Boundary bound5 = new Boundary(100, 130);
        addObject(bound5, 90, 275);
        
        Boundary bound6 = new Boundary(20, 120);
        addObject(bound6, 10, 160);
        
        Boundary bound7 = new Boundary(40, 60);
        addObject(bound7, 255, 500);
        
        Boundary bound8 = new Boundary(150, 150);
        addObject(bound8, 60, 30);
        
        Boundary bound9 = new Boundary(50, 50);
        addObject(bound9, 235, 75);
        
        Boundary bound10 = new Boundary(90, 80);
        addObject(bound10, 445, 220);
        
        Boundary bound11 = new Boundary(210, 10);
        addObject(bound11, 215, 100);
        
        Boundary bound12 = new Boundary(1, 200);
        addObject(bound12, 335, 50);
        
        Boundary bound13 = new Boundary(210, 10);
        addObject(bound13, 430, 30);
        
        Boundary bound14 = new Boundary(10, 180);
        addObject(bound14, 530, 110);
        
        Boundary bound15 = new Boundary(130, 10);
        addObject(bound15, 465, 180);
        
        Boundary bound16 = new Boundary(10, 90);
        addObject(bound16, 405, 150);
        
        Boundary bound17 = new Boundary(70, 10);
        addObject(bound17, 435, 100);
        
        Boundary bound18 = new Boundary(20, 300);
        addObject(bound18, 560, 330);
        
        Boundary bound19 = new Boundary(150, 100);
        addObject(bound19, 470, 470);
        
        Boundary bound20 = new Boundary(150, 5);
        addObject(bound20, 330, 530);
                
        
               
        
                
        
        
        
        
        Elephant ele = new Elephant();
        addObject(ele, 200, 200);
        
        spawnEgg();
        

    }
    
     public void spawnEgg()
    {
        int x = Greenfoot.getRandomNumber(100)+300;
        int y = Greenfoot.getRandomNumber(100) + 200;
        
        Egg an = new Egg();
        addObject(an, x, y);
    }
    
    public void act()
    {
         MouseInfo m = Greenfoot.getMouseInfo();
        if (m != null)
        {
            showText(String.valueOf(m.getX()), 200, 200);
            showText(String.valueOf(m.getY()), 300, 200);
        }


    }
}
