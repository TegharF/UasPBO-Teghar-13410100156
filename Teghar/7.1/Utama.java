import java.io.*;
class Utama{
		public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Gudang g = new Gudang();
		while(true)
		{
		System.out.println("================");
		System.out.println("Menu Utama");
		System.out.println("================");
		System.out.println("1. 	Input Data");
		System.out.println("2.	Lihat Data");
		System.out.println("3.	Close");
		
		System.out.print("Masukkakn pilihan : ");
		System.out.print("");
		
		int pilih = Integer.parseInt (br.readLine());
		
		
		switch (pilih){
		case 1:
		System.out.println("");
		System.out.println("Data Barang");
		System.out.print("Masukkan nama barang : ");
		String namabarang = br.readLine();
		System.out.print("Masukkan tanggal beli : ");
		String tanggalbeli = br.readLine();
		System.out.print("Masukkan berat barang : ");
		int bb = Integer.parseInt(br.readLine());
		System.out.print("Masukkan No. Rak : ");
		int nr = Integer.parseInt(br.readLine());
		System.out.print("Jumlah barang yang dibeli :");
		double j = Double.parseDouble(br.readLine());
		System.out.print("Harga barang yang dibeli :");
		double h = Double.parseDouble(br.readLine());
		
		//g = new Gudang (namapembeli, namabarang, j, h);
		
		FileOutputStream fos = new FileOutputStream("DataBarang.txt");
		DataOutputStream dos = new DataOutputStream (fos);
		dos.writeUTF(namabarang);
		dos.writeUTF(tanggalbeli);
		dos.writeInt(bb);
		dos.writeInt(nr);
		dos.writeDouble(j);
		dos.writeDouble(h);
		dos.close();
		
		FileInputStream fis = new FileInputStream("DataBarang.txt");
		DataInputStream dis = new DataInputStream (fis);
		String a = dis.readUTF();
		String b = dis.readUTF();
		int n = dis.readInt();
		int i = dis.readInt();
		double c = dis.readDouble();
		double d = dis.readDouble();
			dis.close();
			
		g = new Gudang (a,b,n,i,c,d);
		System.out.println();
		
		 break;
		 
		 
		 case 2:
		System.out.println("============================================");
		g.tampildata();
		System.out.println("============================================");
		break;
		
		default:
		System.exit(0);
		}
		}
	}
}