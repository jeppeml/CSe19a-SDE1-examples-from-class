import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int counter = 0;
    double difficulty = 100;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Player psteg = new Player();
        addObject(psteg, 300, 350);
        
        
    }
    
    public void act(){
        counter++;
        if(counter>(int)difficulty)
        {
            int x = Greenfoot.getRandomNumber(600);
            Stone st = new Stone();
            addObject(st, x, 0);
            
            x = Greenfoot.getRandomNumber(600);
            Bomb b = new Bomb();
            addObject(b, x, 0);
            counter = 0;
            difficulty = difficulty * 0.98;
        }
    }
}
