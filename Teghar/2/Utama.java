import java.io.*;
class Utama{
public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		Login user1 = new Login();
		Login user2 = new Login(" "," ");
		
		while(true)
		{
		System.out.println("================");
		System.out.println("Menu login");
		System.out.println("================");
		System.out.println("1. login admin");
		System.out.println("2.ubah pass admin");
		System.out.println("3.buat user");
		System.out.println("4.liaht data");
		System.out.println("5.out");
		
		
		System.out.print("masukkakn plihan");
		int pilih = Integer.parseInt (br.readLine());
		
		switch (pilih)
		{
		case 1:
		System.out.print("Masukkan username :");
		String my_user = br.readLIne();
		System.out.print("Masukkan pass :");
		String my_password = br.readLIne();
		
		system.out.println();
		if(my_user.equals(usera.getUsername()) && my_password.equals(usera.getPassword()))
					{
						System.out.println("Login Sukses");
					}
					else
					{
						System.out.println("Login FAIL!!");
					}
		break;
		case 2:
					System.out.print("Masukkan Password Lma : ");
					String old_password = br.readLine();
					System.out.print("Masukkan Password Baru : ");
					String new_password = br.readLine();
					
					System.out.println();
					
					if(old_password.equals(usera.getPassword()))
					{
						usera.setPassword(new_password);
						System.out.println("^^^Password berhasil dirubah^^^");
					}
					else
					{
						System.out.println("^^^Anda salah memasukkan password^^^");
					}
		break;
		case 3:
					System.out.println("Masukkan username: ");
					String create_user = br.readLine();
					System.out.println("Masukkan PAssword: ");
					String create_password = br.readLine();
					
					userb = new Login(create_user,create_password);
					
					System.out.println();
					System.out.println("^^^User Telah Berhasil dibuat^^^");
		break;
		case 4:
					System.out.println("===============");
					System.out.println("Data User");
					System.out.println("===============");
					System.out.println("===============");
					System.out.println("User 1");
					System.out.println("Username : " +user1.getUsername());
					System.out.println("Password : " +user1.getPassword());
					
					System.out.println();
					
					System.out.println("User 2");
					System.out.println("Username : " +user2.getUsername());
					System.out.println("Password : " +user2.getPassword());
					
					System.out.println("===============");
		break;
		default:
		System.exit(0);
		
		}
		
		}
	}
}