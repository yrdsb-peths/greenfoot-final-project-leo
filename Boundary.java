import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boundary here.
 * 
 * This Actor is used to create invisible walls in the playable world maps
 * 
 * Leo Xu
 * June 15 2022
 * 
 */
public class Boundary extends Actor
{
    private GreenfootImage boundImage = new GreenfootImage ("images/baal.png");
    
    public Boundary (int width, int height)//Sets the boundary's size
    {
        boundImage.scale(width, height);
        setImage(boundImage);
    }
}
