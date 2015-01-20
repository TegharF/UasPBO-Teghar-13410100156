class Login
{
	
	private String jabatan, status;
	
	
	public Login()
	{
		jabatan = "Manager";
		status = "aktif";
	}
	
	public Login(String jabatan, String status)
	{
		this.jabatan = jabatan;
		this.status = status;
	}
	
	
	public void setJabatan(String jabatan)
	{
		this.jabatan = jabatan;
	}
	
	public void setStatus(String status)
	{
		this.status = status;
	}
	

	public String getJabatan()
	{
		return jabatan;
	}
	
	public String getStatus()
	{
		return status;
	}
}