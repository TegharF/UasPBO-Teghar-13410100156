class Game extends Software 
{
	private String jenis = "unknown";
	private String tipe = "unknown";
	
	//constructor
	Game(String kode, String nama, String lisensi)
	{
		super(kode, nama, lisensi);
	}
	
	Game(String kode, String nama, String lisensi, String jenis, String tipe)
	{
		super.setKode(kode);
		super.setNama(nama);
		super.setLisensi(lisensi);
		
		this.jenis = jenis;
		this.tipe = tipe;
	}
	
	//getter
	public String getKode()
	{
		return super.getKode();
	}
	public String getNama()
	{
		return super.getNama();
	}
	public String getLisensi()
	{
		return super.getLisensi();
	}
	public String getJenis()
	{
		return jenis;
	}
	public String getTipe()
	{
		return tipe;
	}
	
	
}