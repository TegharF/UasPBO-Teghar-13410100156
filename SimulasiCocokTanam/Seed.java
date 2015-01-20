import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seed extends Actor
{
    /**
     * Act - do whatever the Seed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean isGrabbed;
    private boolean isTouching;
    public static MouseInfo mi;
    public int CounterBiji = 0;
    public void act() 
    {
        // Add your action code here.
        DragDropBiji();
    }    
    
    public void DragDropBiji()
    {
        if (Greenfoot.mousePressed(this) && !isGrabbed)
        {
            isGrabbed = true;
            World world = getWorld();
            mi = Greenfoot.getMouseInfo();
            world.removeObject(this);  
            world.addObject(this, mi.getX(), mi.getY());
            return;
        }
        
        if ((Greenfoot.mouseDragged(this))&& isGrabbed)
        {
            mi = Greenfoot.getMouseInfo();
            setLocation(mi.getX(), mi.getY());
            return;
        }
        
        if (Greenfoot.mouseDragEnded(this)&& isGrabbed)
        {
            isGrabbed = false;
            setLocation(546,140);
            return;
        }
    } 
}
