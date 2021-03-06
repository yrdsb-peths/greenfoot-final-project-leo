import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal here.
 * 
 * This Portal Actor allows player to ravel across different worlds
 * 
 * @author Leo Xu
 * @date June 15 2022
 * 
 */

public class Portal extends Actor
{
    private Portal portal; // allows multiple portal in one world
    private boolean active; //used if this portal can be used
    private GreenfootImage portalImage = new GreenfootImage ("images/baal2.png");
    
    public Portal()
    {
        portalImage.scale(25, 25);
        setImage(portalImage);
    }
    
    public Portal(Portal portal)
    {
        this.setPortal(portal); 
        portal.setPortal(this); 
        portalImage.scale(25, 25);
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
        Actor actor = getOneIntersectingObject(MainCharacter.class); //let portal know its tocuhing MainCharater
        if (!this.active && actor == null) this.active = true; //re-activates the portal;
        if (this.active && actor != null) portal.getActor(actor); //teleport MainCharater
        
        
    }
       
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
        active = false; // de-activate portal and re-activates when MainCharater leaves portal
    }
}
