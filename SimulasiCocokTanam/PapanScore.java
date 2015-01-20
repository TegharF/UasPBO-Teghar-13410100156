import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PapanScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PapanScore extends Actor
{
    private GreenfootImage img1=new GreenfootImage(205,100);
    private Time waktu = new Time();
    private int timer;
    private int a;
    /**
     * Act - do whatever the PapanScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        img1.clear();
        buatPapanScore();
    }
    
    public PapanScore(){
        buatPapanScore();
        setImage(img1);
    }
    
    private void buatPapanScore(){
        img1.setColor(java.awt.Color.BLACK);
        img1.drawRect(0,0,141,55);
        img1.setColor(java.awt.Color.WHITE);
        img1.fillRect(1,1,140,54);
        
        img1.setColor(java.awt.Color.BLACK);
        timer=timer+20;
        if(timer>=60){
            timer=0;
            waktu.detikUp();
        }
        img1.setColor(java.awt.Color.BLACK);
        img1.drawString("Waktu : " + waktu.jam+":"+waktu.menit,4,16);
        img1.setColor(java.awt.Color.BLACK);
        img1.drawString("Biji yang telah ditanam: " + Pot.CounterBiji,3,28);
        if (Pot.life > 50)
        {
            img1.setColor(java.awt.Color.BLACK);
            img1.drawString("Kondisi Tanaman: " + Pot.life,3,40);
        }
        else
        {
            img1.setColor(java.awt.Color.RED);
            img1.drawString("Kondisi Tanaman: " + Pot.life,3,40);
        }
        img1.setColor(java.awt.Color.BLACK);
        img1.drawString("Kelembaban: " + Pot.kelembaban,3,52);
    }
}
