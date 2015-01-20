class Laki_Laki extends Manusia{
	public Laki_Laki (double TB)
	{
	super (TB);
	}
	public double HtgBBI()
	{
	return (super.getTB()-100)*0.9;
	}

}