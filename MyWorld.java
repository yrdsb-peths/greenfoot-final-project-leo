import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



/**
 * Write a description of class MyWorld here.
 * 
 * The main world when you start the game.
 * Has portals leading to MyHouse1, MyHouse2, MyHouse3, MyCenter, and MyBuilding.
 * Has the randomizer that generates the Egg across different worlds.
 * 
 * Leo Xu
 * June 15 2022 
 * 
 */
public class MyWorld extends World
{
    //World instances
    MyHouse1 house1;
    MyHouse2 house2;
    MyHouse3 house3;
    MyCenter center;
    MyBuilding build;
    OtherHouse1 other1;
    OtherHouse2 other2;
    OtherHouse3 other3;
    ThirdHouse1 third1;
    ThirdRed third2;
    ThirdBlue third3;
    ThirdHouse2 third4;
    
    //Simple Timer
    SimpleTimer timer = new SimpleTimer();
    Label timeLabel = new Label("", 60);
    TimeKeeper keeper = new TimeKeeper();

    static GreenfootSound music = new GreenfootSound("accumula town.mp3");//gameplay music
    public MyWorld()
    {    
        // Create a new world with 578x530 cells with a cell size of 1x1 pixels.
        super(578, 530, 1); 
        setBackground(new GreenfootImage("images/accumula.png"));
        addObject(timeLabel, 270, 50);//time label
        
        music.setVolume(25);
        music.play();
        
        //main portal that allows portals to other worlds work
        Portal portal = new Portal();
        this.addObject(portal, 9999, 9999);
        portal = new Portal(portal);
        this.addObject(portal, 9999, 9999);
        
        portal = new Portal();// OtherWorld portal
        this.addObject(portal, 50, 160); 
        portal = new Portal(portal);
        OtherWorld world2 = new OtherWorld(); 
        world2.addObject(portal, 650, 230);
        
        
        portal = new Portal();// ThirdWorld portal
        this.addObject(portal, 335, 500);
        portal = new Portal(portal);
        ThirdWorld world3 = new ThirdWorld();
        world3.addObject(portal, 670, 170);
        
        portal = new Portal();// MyHouse1 portal
        this.addObject(portal, 152, 100); 
        portal = new Portal(portal);
        house1 = new MyHouse1(); 
        house1.addObject(portal, 150, 350);
        
        portal = new Portal(); // MyHouse2 portal
        this.addObject(portal, 300, 100); 
        portal = new Portal(portal);
        house2 = new MyHouse2(); 
        house2.addObject(portal, 150, 350);
        
        portal = new Portal(); // MyHouse3 portal
        this.addObject(portal, 440, 130); 
        portal = new Portal(portal);
        house3 = new MyHouse3(); 
        house3.addObject(portal, 160, 220);
        
        portal = new Portal(); // MyCenter portal
        this.addObject(portal, 455, 270); 
        portal = new Portal(portal);
        center = new MyCenter(); 
        center.addObject(portal, 320, 420);
        
        portal = new Portal(); // MyBuilding portal
        this.addObject(portal, 70, 350);
        portal = new Portal(portal);
        build = new MyBuilding();
        build.addObject(portal, 580, 420);
        
        //Boundaries for MyWorld
        Boundary bound1 = new Boundary(300, 10);
        addObject(bound1, 125, 470);
        
        Boundary bound2 = new Boundary(150, 10);
        addObject(bound2, 205, 345);
        
        Boundary bound3 = new Boundary(10, 60);
        addObject(bound3, 270, 440);
        
        Boundary bound4 = new Boundary(20, 250);
        addObject(bound4, 30, 335);
        
        Boundary bound5 = new Boundary(100, 100);
        addObject(bound5, 90, 260);
        
        Boundary bound6 = new Boundary(20, 120);
        addObject(bound6, 10, 160);
        
        Boundary bound7 = new Boundary(40, 60);
        addObject(bound7, 255, 500);
        
        Boundary bound8 = new Boundary(150, 150);
        addObject(bound8, 50, 50);
        
        Boundary bound9 = new Boundary(50, 50);
        addObject(bound9, 235, 75);
        
        Boundary bound10 = new Boundary(90, 60);
        addObject(bound10, 445, 210);
        
        Boundary bound11 = new Boundary(210, 10);
        addObject(bound11, 215, 65);
        
        Boundary bound12 = new Boundary(1, 200);
        addObject(bound12, 335, 50);
        
        Boundary bound13 = new Boundary(210, 10);
        addObject(bound13, 430, 30);
        
        Boundary bound14 = new Boundary(10, 180);
        addObject(bound14, 530, 100);
        
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
        
        
        MainCharater main = new MainCharater();//spawn MainCharater
        addObject(main, 200, 200);
        
        spawnEgg();
    }
    
     public void spawnEgg()//get a random number from 0-11 and the number determines where the Egg spawns in one of the worlds house/building class
    {
        int rand = Greenfoot.getRandomNumber(11);
        
        if (rand == 0)
        {
            int x = 30 + Greenfoot.getRandomNumber(200);
            int y = 80;

            Egg an = new Egg();
            house1.addObject(an, x, y);
        }
        if (rand == 1)
        {
            int x = 30 + Greenfoot.getRandomNumber(200);
            int y = 80;
            
            Egg an = new Egg();
            house2.addObject(an, x, y);
        }
        if (rand == 2)
        {
            int x = 30 + Greenfoot.getRandomNumber(200);
            int y = 80;
            
            Egg an = new Egg();
            house3.addObject(an, x, y);
        }
        if (rand == 3)
        {
            int x = 240 + Greenfoot.getRandomNumber(200);
            int y = 270 + Greenfoot.getRandomNumber(90);
            
            Egg an = new Egg();
            build.addObject(an, x, y);
        }
        if (rand == 4)
        {
            int x = 260 + Greenfoot.getRandomNumber(215);
            int y = 260 + Greenfoot.getRandomNumber(215);
            
            Egg an = new Egg();
            house3.addObject(an, x, y);
        }
        if (rand == 5)
        {
            int x = 130 + Greenfoot.getRandomNumber(130);
            int y = 150 + Greenfoot.getRandomNumber(30);
            
            Egg an = new Egg();
            OtherWorld.other1.addObject(an, x, y);
        }
         if (rand == 6)
        {
            int x = 130 + Greenfoot.getRandomNumber(130);
            int y = 150 + Greenfoot.getRandomNumber(30);
            
            Egg an = new Egg();
            OtherWorld.other2.addObject(an, x, y);
        }
         if (rand == 7)
        {
            int x = 130 + Greenfoot.getRandomNumber(130);
            int y = 150 + Greenfoot.getRandomNumber(30);
            
            Egg an = new Egg();
            OtherWorld.other3.addObject(an, x, y);
        }
         if (rand == 8)
        {
            int x = 110;
            int y = 230 + Greenfoot.getRandomNumber(30);
            
            Egg an = new Egg();
            ThirdWorld.third1.addObject(an, x, y);
        }
         if (rand == 9)
        {
            int x = 260 + Greenfoot.getRandomNumber(215);
            int y = 260 + Greenfoot.getRandomNumber(215);
            
            Egg an = new Egg();
            ThirdWorld.third2.addObject(an, x, y);
        }
         if (rand == 10)
        {
            int x = 260 + Greenfoot.getRandomNumber(115);
            int y = 210 + Greenfoot.getRandomNumber(40);
            
            Egg an = new Egg();
            ThirdWorld.third3.addObject(an, x, y);
        }
         if (rand == 11)
        {
            int x = 60 + Greenfoot.getRandomNumber(200);
            int y = 120 + Greenfoot.getRandomNumber(40);
            
            Egg an = new Egg();
            ThirdWorld.third4.addObject(an, x, y);
        }
    }
    
    public void act()
    {
        if(timer.millisElapsed() >= 1000)//TimeKeeper tracks the time
        {
            timer.mark();
            TimeKeeper.Updatetime();
            timeLabel.setValue("time left: " + TimeKeeper.timeleft);//display time left          
        }
        if (TimeKeeper.timeleft == 0)//if the time reaches 0, go to LoseScreen
        {
            LoseScreen gameWorld = new LoseScreen();
            Greenfoot.setWorld(gameWorld);
            music.stop();//stops the gameplay music
        }
    }
}
