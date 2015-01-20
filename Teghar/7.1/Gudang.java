class Gudang implements Operasi
{
	
	private String namabar, tglbeli;
	private int berat, norak;
	private double jumlah, harga;
	
	Gudang ()
	{
	
	}
	Gudang (String namabar, String tglbeli, int berat, int norak, double jumlah, double harga)
	{
		this.namabar=namabar;
		this.tglbeli=tglbeli;
		this.berat=berat;
		this.norak=norak;
		this.jumlah=jumlah;
		this.harga=harga;
		
	}
	
	public void getnamabar()
	{
		System.out.println (namabar);
	}
	public void gettglbeli()
	{
		System.out.println (tglbeli);
	}
	public int getberat()
	{
		return berat;
	}
	public int getnorak()
	{
		return norak;
	}
	
	public double getjumlah()
	{
		return jumlah;
	};
	public double getharga()
	{
		return harga;
	};
	
	public void tampildiskon ()
	{
		System.out.println (hitungdiskon());
	}
	public void tampildata ()
	{
		
		System.out.println ("Nama barang :"+ namabar);
		System.out.println ("Tanggal beli :"+ tglbeli);
		System.out.println ("Berat barang :"+ berat);
		System.out.println ("No. Rak :"+ norak);
		System.out.println ("Jumlah barang :"+ jumlah);
		System.out.println ("Harga barang :"+ harga);
		System.out.println ("Diskon :"+ hitungdiskon());
	}
	
	public double hitungdiskon ()
	{
		return harga*0.2;
	};
	public double totalbayar ()
	{
		return jumlah*(harga-hitungdiskon());
	};
	
}