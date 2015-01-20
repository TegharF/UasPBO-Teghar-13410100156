import java.io.*;
class Utama{
	public static void main (String [] args)throws Exception {
	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	
	Orang or = new Orang();
	
	System.out.print("Masukkan Nama ");
	String nm = br.readLine();
	or.setNama (nm);
	
	or.jalan();
	or.tidur();
	}
}