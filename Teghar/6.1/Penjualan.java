class Penjualan implements Operasi
{
	
	private String namapem, namabar;
	private double jumlah, harga;
	
	Penjualan ()
	{
	
	}
	Penjualan (String namapem, String namabar, double jumlah, double harga)
	{
		this.namapem=namapem;
		this.namabar=namabar;
		this.jumlah=jumlah;
		this.harga=harga;
		
	}
	
	public void getnamapem()
	{
		System.out.println (namapem);
	}
	public void getnamabar()
	{
		System.out.println (namabar);
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
		System.out.println ("Nama pembeli :"+ namapem);
		System.out.println ("Nama barang :"+ namabar);
		System.out.println ("Jumlah barang :"+ jumlah);
		System.out.println ("Harga barang :"+ harga);
		System.out.println ("Diskon :"+ hitungdiskon());
		System.out.println ("Total bayar : "+ totalbayar());
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