class Persegi extends Bangun{
	public Persegi (int s)
	{
	super (s);
	}
	public double HitungLuas()
	{
	return (super.gets()*gets());
	}
	public double HitungKeliling()
	{
	return (4*(gets()));
	}

}