import javax.swing.*;
class Utama{
		public static void main(String[] args)throws Exception
	{
		Peminjaman p = new Peminjaman();
		JOptionPane jop = new JOptionPane();
		while(true)
		{
		String a =(JOptionPane.showInputDialog(null, "Masukkan NIM : "));
		String b = (JOptionPane.showInputDialog(null, "Masukkan Judul Buku : "));
		String c = (JOptionPane.showInputDialog(null, "Masukkan Jenis Buku : "));
		int d = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah Buku : "));
		int e = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Tanggal peminjaman Buku : "));
		
		p = new Peminjaman (a,b,c,d,e);
		System.out.println();
		
		if (c.equalsIgnoreCase("komik"))
		{
		String hasil = "Tanggal kembali Komik :" +p.htgkemkomik();
		jop.showMessageDialog(null,hasil,"Tanggal penegmbalian komik",jop.INFORMATION_MESSAGE );
		}
		else if (c.equalsIgnoreCase("novel"))
		{
		String hasil = "Tanggal kembali novel :" +p.htgkemnovel();
		jop.showMessageDialog(null,hasil,"Tanggal penegmbalian novel",jop.INFORMATION_MESSAGE );
		}
		else if (c.equalsIgnoreCase("majalah"))
		{
		String hasil = "Tanggal kembali majalah :" +p.htgkemmajalah();
		jop.showMessageDialog(null,hasil,"Tanggal penegmbalian majalah",jop.INFORMATION_MESSAGE );
		}
		else
		{
		
		}
	
		int pilih = jop.showConfirmDialog(null,"Anda ingin mencoba lagi?","Tanya kenapa",jop.YES_NO_OPTION);
		if (pilih == 1)
		{
		jop.showMessageDialog(null,"Terima Kasih","Hasil pilihan anda",jop.INFORMATION_MESSAGE);
	System.exit(0);
		}
		}
	}
}