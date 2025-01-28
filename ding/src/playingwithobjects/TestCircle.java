package playingwithobjects;

public class TestCircle {
	public static void main(String[] args) {

	Circle c = new Circle(2);
	System.out.println("Diameter:"+Circles.computeDiameter(c));
	System.out.println("Area: " +Circles.computeArea(c));
	System.out.println("Circumference: "+Circles.computeCircumference(c));
	}
}
