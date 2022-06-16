import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Egg here.
 * 
 * Objective of the game
 * 
 * Leo Xu
 * June 15 2022
 * 
 */
public class Egg extends Actor
{
    private GreenfootImage eggImage = new GreenfootImage ("images/egg.png");
    
    public Egg()
    {
        eggImage.scale(35, 35);
        setImage(eggImage);
    }
}
