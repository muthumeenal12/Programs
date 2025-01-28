package playingwithobjects;

public class Circle {
	private double rad;

	public double getR()
	{
		return rad;
	}
	public void setR(double rad) {
		this.rad=rad;
		
	}
	Circle(){
		
	}
	Circle(double rad)
	{
		setR(rad);
	}

}
