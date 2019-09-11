import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    private Hest hest1;
    private Hest hest2;
    private int odds1;
    private int odds2;
    
    // Overføre data når objektet instantieres/laves/konstrueres
    public void setHorses(Hest hest1, int odds1, Hest hest2, int odds2){
        this.hest1 = hest1;
        this.odds1 = odds1;
        
        this.hest2 = hest2;
        this.odds2 = odds2;
        
    }
    
    
    public void act() 
    {
        // Add your action code here.
    }    
}
