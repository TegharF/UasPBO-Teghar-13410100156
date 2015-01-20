final class Persegi extends Bangun{
	public Persegi (int s)
	{
	super (s);
	}
	public final double HitungLuas()
	{
	return (super.gets()*gets());
	}
	public final double HitungKeliling()
	{
	return (4*(gets()));
	}

}