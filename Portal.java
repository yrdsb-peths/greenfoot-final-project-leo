import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal extends Actor
{
    private Portal portal; 
    private boolean active; 
    private GreenfootImage portalImage = new GreenfootImage ("images/tardis.png");
    
    

    public Portal()
    {
        portalImage.scale(75, 75);
        setImage(portalImage);
    }
    
   
    public Portal(Portal portal)
    {
        this.setPortal(portal); 
        portal.setPortal(this); 
        portalImage.scale(75, 75);
        setImage(portalImage);
    }
    

    private void setPortal(Portal portal)
    {
        this.portal = portal; 
    }
    
 
    public Portal getPortal()
    {
        return this.portal; 
    }
    
    
    public void act()
    {
        Actor actor = getOneIntersectingObject(Elephant.class);
        if(actor == null)
        {
            getWorld().showText("null", 100, 100);
        }
        else if (actor != null)
        {
            getWorld().showText("not null", 100, 100);
        }
        if(Greenfoot.isKeyDown("e"))
        {
            if (!this.active && actor == null) this.active = true;
            if (this.active && actor != null) portal.getActor(actor); 
        }
        
    }
    
    /*public void check()
    {
        if(isTouching(Elephant.class))
        {
            getWorld().showText("press e", 400, 400);
            //Greenfoot.playSound("sounds/smw_coin.wav");
            MyWorld world = (MyWorld) getWorld();
            
        }
        else
        {
            getWorld().showText("", 400, 400);
            MyWorld world = (MyWorld) getWorld();
        }
    }*/
    
   
    public void getActor(Actor actor)
    {
        if (this.getWorld().equals(actor.getWorld()))
        {
            actor.setLocation(this.getX(), this.getY()); 
         }
        else
        {
            this.getWorld().addObject(actor, this.getX(), this.getY()); 
            Greenfoot.setWorld(this.getWorld()); 
        }
        active = false;
    }
}
