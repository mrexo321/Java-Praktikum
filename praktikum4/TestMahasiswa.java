package praktikum4;
import java.util.Scanner;

public class TestMahasiswa {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nama;
		int npm;
		Mahasiswa murid = new Mahasiswa();
		
		
		System.out.print("Masukkan Nama : ");
		nama = input.next();
		System.out.print("Masukkan Npm : ");
		npm = input.nextInt();
		
		murid.setNama(nama);
		murid.setNpm(npm);
		
		System.out.println("\n"
				+ "Nama : " + murid.nama);
		System.out.println("Nama : " + murid.npm);
		input.close();
	}

}
