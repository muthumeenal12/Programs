package hasa;

public class CarDriver {

	public static void main(String[] args) {
		Car c1 =new Car("Honda");
		System.out.println("Name: "+c1.getNAme());
		System.out.println("HP: "+c1.getEngine().getHP());
	}
}
