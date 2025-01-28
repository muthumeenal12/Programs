package chaining;

public class Box {

	double length;
	double width;
	double area;
	Box()
	{
		System.out.println("Box is getting ready...");
	}
	Box(double length)
	{
		this.length=length;
		System.out.println("Length is initialized...");
	}
	Box(double length, double width)
	{
		this(length);
		this.width=width;
		System.out.println("Width is initialized.....");
	}
	Box(double length, double width, double area)
	{
		this(length,width);
		this.area=area;
		System.out.println("Area is initialized.....");
		
	}
}
