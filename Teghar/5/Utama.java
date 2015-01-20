import java.io.*;
class Utama{
	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//instance of class
		Manusia[] m = new Manusia[2];
		//deklarasi variabel
		int x = 0;
		
		do{
		System.out.println("user"+(x+1));
		System.out.print("masukkan tinggi badan:");
		double t = Double.parseDouble(br.readLine());
		System.out.print("masukkan jenis kelamin");
		String jk=br.readLine();
		
		if (jk.toUpperCase().equals("L"))
			{
			m[x]=new Laki_Laki(t);
			System.out.println("berat badan ideal laki2"+ m[x].HtgBBI());
			System.out.println();
			}
		else
			{
			m[x]=new Perempuan(t);
			System.out.println("berat badan ideal perempuan"+ m[x].HtgBBI());
			System.out.println();
			}
			
			
		
		
		x++;
		}while(x<2);
	}

}