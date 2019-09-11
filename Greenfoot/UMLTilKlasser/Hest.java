import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hest extends Actor
{
    /**
     * Act - do whatever the Hest wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(Greenfoot.getRandomNumber(5));
        Mållinje ml = (Mållinje)getOneIntersectingObject(Mållinje.class);
        if(ml!=null){ // Vi rører mållinjen
            Greenfoot.stop();
        }
        // Add your action code here.
    }    
}
