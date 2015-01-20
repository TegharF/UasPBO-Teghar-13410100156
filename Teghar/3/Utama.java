import java.io.*;
class Utama
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		//instance of class
	Game GameA = new Game (" "," "," ");
	Game GameB = new Game (" "," "," "," "," ");
	
	//menu
		while(true)
		{
			System.out.println("===================");
			System.out.println("Game ABCDEFGHIJKLMN");
			System.out.println("===================");
			System.out.println("1. Input Game A");
			System.out.println("2. Input Game B");
			System.out.println("3. Lihat Data Game");
			System.out.println("4. Keluar");
			System.out.println("==================");
		
			System.out.println("Masukkan No. Pilihan Anda");
			int pilih = Integer.parseInt(br.readLine());
		
			System.out.println();
			
			switch(pilih)
			{
				case 1 :
					System.out.println("=====================");
					System.out.println("Game A");
					System.out.println("=====================");
					System.out.println("Masukkan kode = ");
					String kode = br.readLine();
					System.out.println("Masukkan Nama = ");
					String nama = br.readLine();
					System.out.println("Masukkan Lisensi = ");
					String lisensi = br.readLine();
					
					GameA = new Game(kode, nama, lisensi);
					
					System.out.println();
					
					System.out.println("Data game A setelah di save");
					
					break;
					
				case 2:
					System.out.println("=====================");
					System.out.println("Game B ");
					System.out.println("=====================");
					System.out.println("Masukkan kode = ");
					 kode = br.readLine();
					System.out.println("Masukkan Nama = ");
					 nama = br.readLine();
					System.out.println("Masukkan Lisensi = ");
					 lisensi = br.readLine();
					System.out.println("Masukkan Jenis = ");
					String jenis = br.readLine();
					System.out.println("Masukkan Tipe = ");
					String tipe = br.readLine();
					
					GameB = new Game(kode, nama, lisensi, jenis, tipe);
					
					System.out.println();
					
					System.out.println("Data game B setelah di save");
					
				break;
				
				case 3 :
					System.out.println("===================");
					System.out.println("Lihat Data Game");
					System.out.println("===================");
					System.out.println("Game A");
					System.out.println("Kode Game A = "+GameA.getKode());
					System.out.println("Nama Game A = "+GameA.getNama());
					System.out.println("Lisensi Game A ="+GameA.getLisensi());
					System.out.println("Jenis Game A = "+GameA.getJenis());
					System.out.println("Tipe Game A = "+GameA.getTipe());
					
					System.out.println();
					
					System.out.println("Game B");
					System.out.println("Kode Game B = "+GameB.getKode());
					System.out.println("Nama Game B = "+GameB.getNama());
					System.out.println("Lisensi Game B ="+GameB.getLisensi());
					System.out.println("Jenis Game B = "+GameB.getJenis());
					System.out.println("Tipe Game B = "+GameB.getTipe());
					System.out.println("===================");

					
				break;
				
				case 4 :
				System.exit(0);
					
				
			}
		}
	}
	
}