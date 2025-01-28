package Programs;

public class Circle {

	public double area(double rad)
	{
		return (3.14*rad*rad);
	}
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.area(10));
	}
}
