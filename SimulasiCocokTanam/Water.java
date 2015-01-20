import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends Actor
{
    /**
     * Act - do whatever the Water wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Water()
    {
        turn (90);
    }
    
    public void act() 
    {
        manuverAir();
    }    
    
    public void manuverAir()
    {
        move (3);
        if (isTouching(Pot.class))
        {
            World world;
            world = getWorld();
            world.removeObject(this);
            if(Pot.CounterBiji>0)
            {
                Pot.kelembaban = Pot.kelembaban + 10;
                Pot.life = Pot.life + 10;
            }
            else
            {
                Pot.kelembaban = 0;
                Pot.life = 0;
            }
        }
    }
}
