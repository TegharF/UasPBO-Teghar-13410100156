public class tesTransaksi
{
	public static void main(String[] args)
	{
		Transaksi tr=new Transaksi("T001");
		//boolean selesai=fale;
		
		DetilTransaksi dt=new DetilTransaksi(12, new Product("ABE009","LAMENDEL","HBO",35000));
		DetilTransaksi dt2=new DetilTransaksi(10, new Product("ABE019","LAMENDEL2","HBO",25000));
		tr.eddDetil(dt);
		tr.eddDetil(dt2);
		System.out.println(tr);
	}
}