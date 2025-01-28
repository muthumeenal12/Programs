package hasa;

public class CarsDriver {
	public static void main(String[] args) {
		
	
	Cars c = new Cars();
	System.out.println("No of Tyres: "+c.getTyres().length);
	for(int i =0;i<c.getTyres().length;i++)
	{
		System.out.println(c.getTyres()[i].getBrand());
	}

}
}