package Programs;

public class TestRect {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		System.out.println("Area:");
		System.out.println(r.area(4, 6));
		System.out.println(r.area((int)3.6, (int)7.8));
		System.out.println("Perimeter:");
		System.out.println(Rectangle.perimeter(4, 6));
		System.out.println(Rectangle.perimeter((int)3.6, (int)7.8));
	}

}

