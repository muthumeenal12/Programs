package Programs;

public class Assignment {

	public static void main(String[] args) {
		System.out.println("Area of Circle:");
		circle(10);
		//circle(1.0); double cannot be converted to int
		circle((int) 1.0);
		circle(22/7);
		System.out.println("To Dollors:");
		dollors(100);
		dollors(0);
		dollors(1.50);
		System.out.println("To KM:");
		mToKm(19.05);
		mToKm(20.5);
		mToKm(1000);
		System.out.println("To Hours:");
		secToHrs(20100);
		secToHrs(600);
		secToHrs(15000);
		System.out.println("TimeTaken:");
		time(15,10);
		time(20,12);
		time(45,60);
		System.out.println("The Cube of a Number");
		cube(9);
		cube('a');
		//cube(true);
		//cube("true");
		
		
	}
	public static void circle(int a)
	{
		
		System.out.println(3.14*a*a);
	}
	public static void dollors(double a)
	{
		
		System.out.println(a/82);
	}
	public static void mToKm(double a)
	{
		
		System.out.println(a/1000);
	}
	public static void secToHrs(int a)
	{
		
		System.out.println(a/3600);
	}
	public static void time(double kmph, double km)
	{
		
		System.out.println(km/kmph);
	}
	public static void cube(int a)
	{
		a*=a*a;//a=a*a*a;
		System.out.println(a);
	}
}
