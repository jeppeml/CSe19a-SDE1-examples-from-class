import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("left")){
            move(-2);
        }
        if(Greenfoot.isKeyDown("right")){
            move(2);
        }
        
        if(Greenfoot.isKeyDown("up")){
            turn(-2);
        }
        if(Greenfoot.isKeyDown("down")){
            turn(2);
        }
        
        Object touching = getOneIntersectingObject(Enemy.class);
        if(touching!=null)
        {
            Greenfoot.stop();
        }
        // Add your action code here.
    }    
}
