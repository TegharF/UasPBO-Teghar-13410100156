import java.io.*;
class Utama{
	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//instance of class
		Bangun[] bgn = new Bangun[2];
		//deklarasi variabel
		int x = 0;
		
		do{
			System.out.print("Masukkan jenis bangun ");
			String b = br.readLine();
		
			if(b.toUpperCase().equals("PERSEGI")){
				System.out.print("Masukkan sisi : ");
				int s = Integer.parseInt(br.readLine());
				bgn[x] = new Persegi(s);
				System.out.println("Luas dari persegi " +bgn[x].HitungLuas());
				System.out.println("Keliling dari persegi " +bgn[x].HitungKeliling());
				System.out.println();
			}
			
			else
			{
				System.out.print("Masukkan panjang : ");                    
				int p = Integer.parseInt(br.readLine());
				System.out.print("Masukkan lebar : ");
				int l = Integer.parseInt(br.readLine());
				bgn[x] = new PersegiPanjang(p,l);
				System.out.println("Luas dari Persegi panjang  " +bgn[x].HitungLuas());
				System.out.println("Keliling dari Persegi panjang " +bgn[x].HitungKeliling());
				System.out.println();
			}
			
		x++;
		}
		
		while(x<2);
	}

}