package praktikum4;
import java.util.Scanner;

public class TestTabungan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int saldo , tarikTunai;
		
		
		
		System.out.print("Masukkan Saldo Anda : ");
		saldo = input.nextInt();
		Tabungan atm = new Tabungan(saldo);
		
		System.out.print("Masukkan Nominal Tarik Tunai: ");
		tarikTunai = input.nextInt();
		atm.ambilUang(tarikTunai);
		
		System.out.println("\n"
				+ "Jumlah Saldo Yang diambil :" +tarikTunai);
		System.out.println("Saldo saat ini : " + atm.saldo);
		input.close();
	}
	
}
