package playingwithobjects;

public class Bottle {

	private String color;
	public String getColor()
	{
		return color;
	}
	public Bottle setColor(String color)
	{
		this.color=color;
		return this;
	}
	private double capacity;
	public double getCapacity() {
		return capacity;
	}
	public Bottle setCapacity(double capacity)
	{
		this.capacity=capacity;
		return this;
	}
	Bottle(){
		
	}
	Bottle(String color,double capacity)
	{
		setColor(color);
		setCapacity(capacity);
	}
	public static Bottle factoryMethod()
	{
		return new Bottle();
	}
	public static Bottle factoryMethod(String a,double c)
	{
		return new Bottle(a,c);
	}
	public Bottle display()
	{
		System.out.println("Color: "+color);
		System.out.println("Capacity: "+capacity);
		return this;
	}
}
