import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{

    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Pot pot = new Pot();
        addObject(pot, 300, 333);
        WateringCan wateringcan = new WateringCan();
        addObject(wateringcan, 541, 57);
        Seed seed = new Seed();
        addObject(seed, 554, 144);
        seed.setLocation(546, 140);
        Fertilizer fertilizer = new Fertilizer();
        addObject(fertilizer, 549, 217);;
        fertilizer.setLocation(541, 214);
        PapanScore papanscore = new PapanScore();
        addObject(papanscore, 105, 66);
        papanscore.setLocation(116, 64);
    }
    
    public void stopped()
    {
        Pot.kelembaban = 0;
        Pot.life = 0;
    }
}
