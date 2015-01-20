class Peminjaman
{
	
	private String nim, judulbuku, jenisbuku;
	private int jumlah, tglpinjam;
	
	
	Peminjaman ()
	{
	
	}
	Peminjaman (String nim, String judulbuku, String jenisbuku, int jumlah, int tglpinjam)
	{
		this.nim=nim;
		this.judulbuku=judulbuku;
		this.jenisbuku=jenisbuku;
		this.jumlah=jumlah;
		this.tglpinjam=tglpinjam;
		
	}
	
	public void getnim()
	{
		System.out.println (nim);
	}
	public void getjudulbuku()
	{
		System.out.println (judulbuku);
	}
	public void getjenisbuku()
	{
		System.out.println (jenisbuku);
	}
	
	public double getjumlah()
	{
		return jumlah;
	};
	public int gettglpinjam()
	{
		return tglpinjam;
	};
	
	public int htgkemkomik ()
	{
		return tglpinjam + 3;
	};
	public int htgkemnovel ()
	{
		return tglpinjam + 5;
	};
	public int htgkemmajalah ()
	{
		return tglpinjam + 6;
	};

	
}