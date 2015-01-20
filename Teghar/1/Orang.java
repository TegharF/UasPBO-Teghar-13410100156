class Orang{
	private String nama;
	public void setNama(String nama)
	{
		this.nama=nama;
	}
	
	public String getNama()
	{
		return nama;
	}
	
	public void jalan()
		{
		System.out.println(getNama() +" Sedang berjalan" );
		}
		public void tidur()
		{
		System.out.println(getNama()+" Sedang tidur" );
		}

 
}