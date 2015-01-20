class PersegiPanjang extends Bangun{
	public PersegiPanjang (int p, int l)
	{
	super (p, l);
	}
	
	public double HitungLuas()
	{
	return (getp()*getl());
	}
	public double HitungKeliling()
	{
	return (2*(getp()*getl()));
	}

}