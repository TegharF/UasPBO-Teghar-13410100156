import javax.swing.*;
class Utama{
		public static void main(String[] args)throws Exception
	{
		Kalkulator k = new Kalkulator();
		JOptionPane jop = new JOptionPane();
		while(true)
		{
	
		
		
		double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Bilangan Pertama : "));
		double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan Bilangan Kedua : "));
		
		k = new Kalkulator (a,b);
		System.out.println();
		
		
		
		
		
		System.out.print("hasil penjumlahan =");
		k.Penjumlahan();
		System.out.print("hasil pengurangan =");
		k.Pengurangan();
		
		String hasil = "Hasil perkalian = " +k.Perkalian()+"\nHasil pembagian =" +k.Pembagian();
		jop.showMessageDialog(null,hasil,"Hasil perkalian dan pembagian",jop.INFORMATION_MESSAGE );
		int pilih = jop.showConfirmDialog(null,"Anda ingin mencoba lagi?","Tanya kenapa",jop.YES_NO_OPTION);
		if (pilih == 1)
		{
		jop.showMessageDialog(null,"Terima Kasih","Hasil pilihan anda",jop.INFORMATION_MESSAGE);
	System.exit(0);
		}
		}
	}
}