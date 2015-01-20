class Perempuan extends Manusia{
	public Perempuan (double TB)
	{
	super (TB);
	}
	public double HtgBBI()
	{
	return (super.getTB()-100)*0.8;
	}

}