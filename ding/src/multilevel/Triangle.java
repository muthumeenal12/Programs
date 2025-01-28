package multilevel;

public class Triangle extends Shape {

	double base;
	double height;
//	Triangle(){}
	Triangle(double base, double height)
	{
		this.base=base;
		this.height=height;
	}
	void diaplay() {
		System.out.println("Base: "+this.base);
		System.out.println("Height: "+this.height);
	}
}
