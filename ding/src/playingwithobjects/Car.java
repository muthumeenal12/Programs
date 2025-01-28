package playingwithobjects;

public class Car {
	public static void main(String[] args) {
		features f = new features("TUV",2018);
		display(f);
	}
	public static void display(features  obj )
	{
		System.out.println(obj.model+" " +obj.year);
	}

}
class features
{
String model;
int year;
features(String model, int year)
{
	this.model = model;
	this.year=year;
}
}
