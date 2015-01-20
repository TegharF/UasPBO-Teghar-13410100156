package Pertemuan8;

public class ProductTable {
	public Product cariById(String id)
	{
		
	}
	public Product cariByNama(String nama)
	{
		
	}
	public Vector <Product> viewAll()
	{
		
	}
	public Vector <Product> viewAll(String filter)
	{
		
	}
	public void insert (Product produk)
	{
		
	}
	public void delete (String id)
	{
			Statment stmt=null;
			try
			{
				int sts=stmt.executeUpdate("DELETE FROM product WHERE id= '"+id+"'");
				
			}
			catch (SQL Exception e)
			{
					e.printStackTrace();
			}
	}
	public void update (String id, Product proUpdated)
	{
		Statment stmt=null;
		try
		{
			stmt=koneksi.createStatement();
			int sts=stmt.executeUpdate("UPDATE Product SET nama='" + productUpdate.get+"'");
			
		}
		catch (SQL Exception e)
			{
					e.printStackTrace();
			}
	}
	public void close()
	{
		try
			{
				koneksi.close();
			}
		catch(SQL Exception e)
			{
					e.printStackTrace();
			}
	}
	
}