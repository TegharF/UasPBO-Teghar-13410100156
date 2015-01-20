import java.io.*;
class Utama{
		public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Kalkulator k = new Kalkulator();
		
		System.out.print("masukkan bil 1");
		double a = Double.parseDouble(br.readLine());
		System.out.print("masukkan bil 2");
		double b = Double.parseDouble(br.readLine());
		
		k = new Kalkulator (a,b);
		System.out.println();
		
		System.out.print("hasil penjumlahan =");
		k.Penjumlahan();
		System.out.print("hasil pengurangan =");
		k.Pengurangan();
		System.out.println("hasli perkalian ="+k.Perkalian());
		System.out.println("hasli peembagian ="+k.Pembagian());
	}
}