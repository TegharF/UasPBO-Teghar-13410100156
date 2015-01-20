import java.io.*;
class Utama
{
	public static void main(String[] argx)throws Exception
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		Login user1 = new Login();
		Login user2 = new Login("","");
		
		while(true)
		{
			//menu
			System.out.println("============================");
			System.out.println("MENU LOGIN");
			System.out.println("============================");
			System.out.println("1. INPUT Data Login");
			System.out.println("2. Lihat Data Login ");
			System.out.println("3. Keluar ");
			System.out.println("============================");
			
			
			System.out.print("Masukkan No. Pilihan Anda : ");
			int pilih = Integer.parseInt(br.readLine());
			
			System.out.println();
			
			switch(pilih)
			{
				case 1:
				System.out.println("===============");
				System.out.println("Input User");
				System.out.println("===============");
				System.out.println("Masukkan jabatan: ");
				String jabatan = br.readLine();
				System.out.println("Masukkan status ");
				String status = br.readLine();
					
				user2 = new Login(jabatan,status);
					
				System.out.println();
				System.out.println("Complete!!!");
					
				break;
				
				case 2 :
				System.out.println();
				if(user2.getJabatan().equals("") && user2.getStatus().equals(""))
				{
					
					System.out.println("Jabatan : " +user1.getJabatan());
					System.out.println("Status : " +user1.getStatus());
				}
				else
				{
					
					System.out.println("Jabatan : " +user2.getJabatan());
					System.out.println("Status : " +user2.getStatus());
				}
				
				break;
				
				case 3 :
					System.exit(0);
				
			}
		}
	}
}