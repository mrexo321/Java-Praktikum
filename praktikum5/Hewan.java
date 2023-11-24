package praktikum5;

public abstract class Hewan {
	
	protected static String name;
	
	protected abstract void eat();
}

class Cat extends Hewan{
	String color;
	int weight;
	public void identity(String catName , String catColor , int catWeight) {
		Cat.name = catName;
		color = catColor;
		weight = catWeight;
				
	}
	public void eat() {
		System.out.print(Cat.name + " Minum Whisky");
	}
	
	String getName() {
		return Cat.name;
	}
	
	String getColor() {
		return color;
	}
	
	int getWeight() {
		return weight;
	}
	
}
