import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JButton;


public class MyWindow extends JFrame
{
	private static final int LEBAR=300;
	private static final int TINGGI=200;
	private static final int POS_X=150;
	private static final int POS_Y=250;
	
	public MyWindow(String judul)
	{
		super(judul);
		setSize(LEBAR, TINGGI);
		setSize(POS_X, POS_Y);
		ubahWarnaLatar();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JButton tombolYa = new JButton ("Ya");
		JButton tombolTidak = new JButton ("Tidak");
		
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(tombolYa);
		getContentPane().add(tombolTidak);
		
		//menambahkan Action Listener
		ButttonHandler reaksiTombol=new ButttonHandler();
		tombolya.addActionListiner(reaksiTombol);
		tomboltidak.addActionListiner(reaksiTombol);
	}
	
	private void ubahWarnaLatar()
	{
		Container kontainer= getContentPane();
		kontainer.setBackground(Color.BLUE);
	}
	
	public static void main(String[] args)
	{
		MyWindow win=new MyWindow("Window Pertamaku");
		win.setVisible(true);
	}
	
	
} 