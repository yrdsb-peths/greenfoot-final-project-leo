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
    
    public static final int GRAVITY = 1; 
    private int vSpeed; 
    
    public void act()
    {
        // Add your action code here.
        
        vSpeed = vSpeed + GRAVITY; 
        setLocation(getX(), getY()+ vSpeed);
        
        if(Greenfoot.isKeyDown("d"))
        {
            
            move(5);
            yes();
            if(Greenfoot.isKeyDown("c"))
            {
                
                move(10);
            }
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
            
            move(-5);
            yes();
            if(Greenfoot.isKeyDown("c"))
            {
                 
                move(-10);
            }
        }
        
        if(Greenfoot.isKeyDown("w"))
        {
            int x = getX();
            int y = getY();
            setLocation(x, y -5);
            yes();
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
            yes();
              if(Greenfoot.isKeyDown("c"))
            {
                
                setLocation(x, y + 10);   
            }
        }
        
       
    }
    
    public void yes()
    {
        Actor wall = getOneIntersectingObject(Boundary.class);
        if(wall!=null)
        {
            move(-1);
            int x = getX();
            int y = getY();
            setLocation(x, y - 1);
            
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
