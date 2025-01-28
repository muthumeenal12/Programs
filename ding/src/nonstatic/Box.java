package nonstatic;

public class Box {

	double length;
	double breadth;
	Box(double length, double breadth)
	{
		this.breadth=breadth;
		this.length=length;
	}
	double getArea()
	{
		return length*breadth;
	}
	public static void main(String[] args) {
		Box b1 = new Box(2,8);
		Box b2 = new Box(4,6);
		System.out.println(b1.getArea());
		//System.out.println(length);
		System.out.println(b1.length);
	}
}
