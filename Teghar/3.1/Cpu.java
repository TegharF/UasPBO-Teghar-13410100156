class Cpu extends Hardware
{
	private String processor = "unknown";
	private int ram = 0;
	private int harga = 0;
	
	//constructor
	Cpu(String nama, int jumlah, String tipe)
	{
		super(tipe, jumlah, nama);
	}
	
	Cpu(String nama, int jumlah, String tipe, String processor, int ram, int harga)
	{
		super.setNama(nama);
		super.setJumlah(jumlah);
		super.setTipe(tipe);
		
		this.processor = processor;
		this.ram = ram;
		this.harga = harga;
	}
	
	//getter
	public String getNama()
	{
		return super.getNama();
	}
	public int getJumlah()
	{
		return super.getJumlah();
	}
	public String getTipe()
	{
		return super.getTipe();
	}
	public String getProcessor()
	{
		return processor;
	}
	public int getRam()
	{
		return ram;
	}
	public int getHarga()
	{
		return harga;
	}
	
	
}