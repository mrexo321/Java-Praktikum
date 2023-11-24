package praktikum5;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		String name,color;
		int weight;
		Cat myCat = new Cat();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan nama kucingmu : ");
		name = input.next();
		
		System.out.print("Masukan warna kucingmu : ");
		color = input.next();
		
		System.out.print("Masukan berat kucingmu : ");
		weight = input.nextInt();
		
		myCat.identity(name,color,weight);
		System.out.println(myCat.getName() + "Si kucing " 
		+ myCat.getColor() + "\nWarnanya"
		+ myCat.getWeight() + "Kg Beratnya");
		
		myCat.eat();
	}
}
