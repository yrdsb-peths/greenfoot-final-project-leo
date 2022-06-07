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
        portalImage.scale(100, 100);
        setImage(portalImage);
    }
    
    
    public Portal(Portal portal)
    {
        this.setPortal(portal); 
        portal.setPortal(this); 
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
        Actor actor = this.getOneIntersectingObject(Elephant.class); 
        if (!this.active && actor == null) this.active = true;
        if (this.active && actor != null) portal.getActor(actor); 
    }
    
   
    private void getActor(Actor actor)
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
