public class DetailTransaksi 
{
	private int jml;
	private Product item;
	private int subTotal();
	{
		return item.getHarga() * jml;
	}
	
	public DetailTransaksi(int jml, Product item)
	{
		super();
		this.jml = jml;
		this.item = item;
	}
	
	public int getJml()
	{
		return jml;
	}
	
	public void setJml(int jml)
	{
		this.jml = jml;
	}
	
	public Product getItem()
	{
		return item;
	}
	public Product setItem(Product item)
	{
		this.item = item;
	}
	public String toString()
	{
		return item.getNama()+"\t"+jml+"\t"+item.getHarga()+"'";
	}
	
	
}