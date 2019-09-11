import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Travbanen extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Travbanen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        Mållinje ml = new Mållinje(); // Kalder konstruktøren
        addObject(ml, 1100, 400);
        
        Hest hest1 = new Hest();
        addObject(hest1, 0,300);
        
        Hest hest2 = new Hest();
        addObject(hest2, 0,400);
        
        Score score = new Score();
        score.setHorses(hest1, 4, hest2, 6);
        
        addObject(score, 50, 0);
        
        
        
    }
    
    public void act(){
        
    }
}
