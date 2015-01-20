abstract class Bangun{
	private int panjang;
	private int lebar;
	private int sisi;
	
	
	public Bangun()
	{
	}
	
	public Bangun(int p, int l ){
		panjang = p;
		lebar = l;
	}
	
	public Bangun(int s){
		sisi = s;
	}
	
	
	
	public int getp()
	{
		return panjang;
	}
	
	public int getl()
	{
		return lebar;
	}
	
	public int gets()
	{
		return sisi;
	}
	
	public abstract double HitungLuas();
	
	
	public abstract double HitungKeliling();
	
	


}