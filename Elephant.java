import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage[] upImages;
    private GreenfootImage[] downImages;
    private GreenfootImage[] rightImages;
    private GreenfootImage[] leftImages;
    private SimpleTimer actionTimer;
    private int delay = 0;
    private boolean isFacingRight = true;
    private boolean isFacingUp = true;
    
    
    public Elephant()
    {
        upImages = new GreenfootImage[2];
        downImages = new GreenfootImage[2];
        rightImages = new GreenfootImage[2];
        leftImages = new GreenfootImage[2];
        
        for(int i = 0; i < downImages.length; i++)
        {
             downImages[i] = new GreenfootImage("images/animate1/down" + i + ".png");
             downImages[i].scale(75, 75);
             
        }
        
        for(int i = 0; i < downImages.length; i++)
        {
             upImages[i] = new GreenfootImage("images/animate3/up" + i + ".png");
             upImages[i].scale(75, 75);
             
        }
        
        
        for(int i = 0; i < rightImages.length; i++)
        {
             rightImages[i] = new GreenfootImage("images/animate2/right" + i + ".png");
             rightImages[i].scale(75, 75);
             
             leftImages[i] = new GreenfootImage("images/animate2/right" + i + ".png");
             leftImages[i].mirrorHorizontally();
             leftImages[i].scale(75, 75);
        }
        setImage(rightImages[0]);
        
        actionTimer = new SimpleTimer();
        actionTimer.mark();
    }
    
    int curIndex = 0;
    public void idleAction()
    {
        if(actionTimer.millisElapsed() > 100)
        {
            if (isFacingRight)
            {
                setImage(rightImages[curIndex]);
            }
            else
            {
                setImage(leftImages[curIndex]);
            }
            
       
            curIndex++;
            curIndex %= 2;
            actionTimer.mark();
        }
    }
    
    public void idleActionTwo()
    {
        if(actionTimer.millisElapsed() > 100)
        {
            
             if (isFacingUp)
            {
                setImage(upImages[curIndex]);
            }
            else
            {
                setImage(downImages[curIndex]);
            }
            curIndex++;
            curIndex %= 2;
            actionTimer.mark();
        }
    }
    
    
    public void act()
    {
        // Add your action code here.
        
        
        
        if(Greenfoot.isKeyDown("d"))
        {
            isFacingRight = true;
            move(5);
            idleAction();
            
            if(Greenfoot.isKeyDown("c"))
            {
                isFacingRight = true;
                move(10);
            }
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
            isFacingRight = false;
            move(-5);
            idleAction();
            
            if(Greenfoot.isKeyDown("c"))
            {
                 isFacingRight = false;
                move(-10);
            }
        }
        
        if(Greenfoot.isKeyDown("w"))
        {
            int x = getX();
            int y = getY();
            setLocation(x, y -5);
            
            isFacingUp = true;
            idleActionTwo();
            
            
            if(Greenfoot.isKeyDown("c"))
            {
                
                setLocation(x, y -10);   
            }
            
             

        }
        
        if(Greenfoot.isKeyDown("s"))
        {
            int x = getX();
            int y = getY();
            setLocation(x, y + 5);
            isFacingUp = false;
            idleActionTwo();
            
              if(Greenfoot.isKeyDown("c"))
            {
                
                setLocation(x, y + 10);   
            }
        }
        
       
    }
    
       
    public void setLocation(int x, int y)
    {
        int oldX = getX();
        int oldY = getY();
        super.setLocation(x, y);
        if(!getIntersectingObjects(Boundary.class).isEmpty())
        {
            super.setLocation(oldX, oldY);
        }
    }
    
    
 
    

}
