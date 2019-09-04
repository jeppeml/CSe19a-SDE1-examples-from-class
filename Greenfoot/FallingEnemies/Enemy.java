import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    int speed = Greenfoot.getRandomNumber(7)+1;
    public Enemy(){
        setRotation(90);
    }
    
    public void act() 
    {
        move(speed);
        if(getY()>359){
            getWorld().removeObject(this);
        }
        // Add your action code here.
    }    
}
