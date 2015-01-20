import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WateringCan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WateringCan extends Actor
{
    World world = getWorld();
    private int air = 0;

    /**
     * Act - do whatever the WateringCan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        tombol();
    }  
    
    public void tombol()
    {
        if (Greenfoot.isKeyDown("a"))
        {
            World world = getWorld();
            world.removeObject(this);
            world.addObject(this, 331,200);
        }
        
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(541, 57);
        }
        
        if (Greenfoot.isKeyDown("space"))
        {
            air++;
            if (air >5)
            {
                World world = getWorld();
                world.addObject(new Water(), 300, 200);
                air = 0;
                Greenfoot.playSound("air.mp3");
            }
        }
    }
}
