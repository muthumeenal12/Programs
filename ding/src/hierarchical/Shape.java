package hierarchical;

public class Shape {

	double area;
	void computeArea() {
		System.out.println("Compute area");
	}
}
class Triangle extends Shape{
	double base;
	double height;
	Triangle(){}
	Triangle(double base, double height)
	{
		this.base=base;
		this.height=height;
		
	}
}
class Circle extends Shape{
	double radius;
	Circle(){}
	Circle(double radius){this.radius=radius;}
}
class Square extends Shape{
	double side;
	Square(){}
	Square(double side){
		this.side=side;
	}
}
