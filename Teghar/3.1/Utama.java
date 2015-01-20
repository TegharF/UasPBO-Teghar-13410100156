import java.io.*;
class Utama
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		//instance of class
	Cpu CpuA = new Cpu ("",0,"");
	Cpu CpuB = new Cpu ("",0,"","",0,0);
	
	//menu
		while(true)
		{
			System.out.println("===================");
			System.out.println("Menu CPU");
			System.out.println("===================");
			System.out.println("1. Input CPU A");
			System.out.println("2. Input CPU B");
			System.out.println("3. Lihat Data CPU");
			System.out.println("4. Keluar");
			System.out.println("==================");
		
			System.out.println("Masukkan No. Pilihan Anda");
			int pilih = Integer.parseInt(br.readLine());
		
			System.out.println();
			
			switch(pilih)
			{
				case 1 :
					System.out.println("=====================");
					System.out.println("CPU A");
					System.out.println("=====================");
					System.out.println("Masukkan tipe = ");
					String tipe = br.readLine();
					System.out.println("Masukkan jumlah = ");
					 int jumlah = Integer.parseInt(br.readLine());
					System.out.println("Masukkan nama = ");
					String nama = br.readLine();
					
					CpuA = new Cpu(nama, jumlah, tipe);
					
					System.out.println();
					
					System.out.println("Data CPU A setelah di save");
					
					break;
					
				case 2:
					System.out.println("=====================");
					System.out.println("CPU B ");
					System.out.println("=====================");
					System.out.println("Masukkan Tipe = ");
					 tipe = br.readLine();
					 System.out.println("Masukkan Tipe = ");
					String processor = br.readLine();
					System.out.println("Masukkan Jumlah = ");
					 jumlah = Integer.parseInt(br.readLine());
					System.out.println("Masukkan nama = ");
					 nama = br.readLine();
					System.out.println("Masukkan ram = ");
					int ram = Integer.parseInt(br.readLine());
					System.out.println("Masukkan harga = ");
					int harga = Integer.parseInt(br.readLine());
					
					CpuB = new Cpu(nama, jumlah, tipe,processor, ram, harga);
					
					System.out.println();
					
					System.out.println("Data CPU B setelah di save");
					
				break;
				
				case 3 :
					System.out.println("===================");
					System.out.println("Lihat Data CPU");
					System.out.println("===================");
					System.out.println("CPU A");
					System.out.println("Kode CPU A = "+CpuA.getTipe());
					System.out.println("Nama CPU A = "+CpuA.getJumlah());
					System.out.println("Lisensi CPU A ="+CpuA.getNama());
					System.out.println("Jenis CPU A = "+CpuA.getRam());
					System.out.println("Tipe CPU A = "+CpuA.getHarga());
					
					System.out.println();
					
					System.out.println("CPU A");
					System.out.println("Kode CPU B = "+CpuB.getTipe());
					System.out.println("Nama CPU B = "+CpuB.getJumlah());
					System.out.println("Lisensi CPU B ="+CpuB.getNama());
					System.out.println("Jenis CPU B = "+CpuB.getRam());
					System.out.println("Tipe CPU B = "+CpuB.getHarga());
					

					
				break;
				
				case 4 :
				System.exit(0);
					
				
			}
		}
	}
	
}