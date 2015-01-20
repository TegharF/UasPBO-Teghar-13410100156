class Hardware
{
	//deklarasi variabel
	private String nama, tipe;
	private int jumlah; 
	//constructor
	Hardware()
	{
	
	}
	
	Hardware(String nama, int jumlah, String tipe)
	{
		this.nama = nama;
		this.jumlah = jumlah;
		this.tipe = tipe;
	}
	
	//setter
	public void setNama(String n)
	{
		nama = n;
	}
	
	public void setJumlah(int j)
	{
		jumlah = j;
	}
	
	public void setTipe(String t)
	{
		tipe = t;
	}
	
	//getter
	public String getNama()
	{
		return nama;
	}
	
	public int getJumlah()
	{
		return jumlah;
	}
	
	public String getTipe()
	{
		return tipe;
	}
}