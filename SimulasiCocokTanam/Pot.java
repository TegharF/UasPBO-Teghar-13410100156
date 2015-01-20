import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pot extends Actor
{
    private Seed biji = new Seed();
    private Fertilizer pupuk = new Fertilizer();
    private miniplant tanaman1 = new miniplant();
    private midplant tanaman2 = new midplant();
    private lastplant tanaman3 = new lastplant();
    private Sun sun = new Sun();
    private Moon moon = new Moon();
    public static final int MAX_BIJI = 1;
    public static int CounterBiji = 0;
    public static int life = 0;
    public static int kelembaban = 0;
    /**
     * Act - do whatever the Pot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        tanam();
        siram();
        mupuk();
        tumbuh();
        matahari();
    }    
    
    public void tanam()
    {
        Actor getSeed = getOneIntersectingObject (Seed.class);
        if (getSeed != null)
        {
            getWorld().removeObject(getSeed);
            life = 100;
            kelembaban = 50;
            World world;
            world = getWorld();
            world.addObject(biji, 546, 140);
            if(CounterBiji >= 1)
            {
                CounterBiji = MAX_BIJI;
            }
            else
            {
                CounterBiji++;
            }
            return;
        }
    }
    
    public void mupuk()
    {
        Actor getFertilizer = getOneIntersectingObject (Fertilizer.class);
        if (getFertilizer != null)
        {
            getWorld().removeObject(getFertilizer);
            
            World world;
            world = getWorld();
            world.addObject(pupuk, 541, 214);
            life = life + 10;
            if(life>100)
            {
                life = 100;
            }
            return;
        }
    }
    
    public void siram()
    {
        Actor getWater = getOneIntersectingObject (Water.class);
        if (getWater != null)
        {
            getWorld().removeObject(getWater);
        }
    }
    
    public void tumbuh()
    {
        if(Time.a>1000)
        {
            World world;
            world = getWorld();
            world.addObject(tanaman1, 300, 286);
            if(Time.a>49999)
            {
                getWorld().removeObjects(getWorld().getObjects(miniplant.class));
            }
        }
        
        if(Time.a>50000)
        {
            World world;
            world = getWorld();
            world.addObject(tanaman2, 302, 236);
            if(Time.a>199999)
            {
                getWorld().removeObjects(getWorld().getObjects(midplant.class));
            }
        }
        
        if (Time.a >150000)
        {
            getWorld().removeObject(tanaman2);
            World world;
            world = getWorld();
            world.addObject(tanaman3, 302, 236);
        }
        return;
    }
    
    
    private void matahari()
    {
        World world;
        world = getWorld();
        if(Time.jam<5 || Time.jam > 17)
        {
            ((background)getWorld()).setBackground("malam.jpg");
            world.addObject(moon, 297,72);
        }
        else if(Time.jam >=5)
        {
            world.addObject(sun, 297,72);
        }
    }
}
