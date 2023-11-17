package praktikum2;

import java.util.Scanner;

public class PengkodisianSwitch {

	public static void main(String args[])
	{
		int angka1,angka2,hasil;
		String operator;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan Angka 1 : ");
		angka1 = input.nextInt();
		
		System.out.print("Masukan Angka 2 : ");
		angka2 = input.nextInt();
		
		System.out.print("List Perhitungan : "
				+ "\n + = pertambahan"
				+ "\n - = pengurangan"
				+ "\n * = perkalian "
				+ "\n / = pembagian "
				+ "\n Masukkan Angka Perhitungan : ");
			
		operator = input.next();
		input.close();
		
		switch(operator) {
			case "+" : 
				hasil = angka1+angka2;
				System.out.print("Hasil = " + hasil) ;
				break;
			case "-" : 
				hasil = angka1-angka2;
				System.out.print("Hasil = " + hasil) ;
				break;
			case "*" : 
				hasil = angka1*angka2;
				System.out.print("Hasil = " + hasil) ;
				break;
			case "/" : 
				hasil = angka1/angka2;
				System.out.print("Hasil = " + hasil) ;
				break;
			default : 
				System.out.println("Operator yang dimasukan Salah!!");
		}
			
		
		
		
		
	}
}
