import java.util.ArrayList;

public class Transaksi
	{
		private String idTr;
		private Date tgl;
		private List<DetailTransaksi> detil;
		public Transaksi(String idTr)
		{
			this idTr = idTr;
			tgl = new Date();
			detil = new ArrayList<DetilTransaksi>();
		}
		public void addDetil(DetilTransaksi dt)
		{
			detil.add(dt);
		}
		public int total()
		{
			int_total=0;
			for(DetilTransaksi dt:detil)
				_total +=dt.subTotal();
			return_total;
		}
		public String toString()
		{
			String str="TRANSAKSI PENJUALAN OBAT HERBAL \n";
			str += "ID Transaksi: " + idTr + "\t Tanggal : " + tgl.toString()+"\n";
			for(DetilTransaksi dtr:detil)
				str +=dtr toString() + "\n";
				return str;
		}
	}