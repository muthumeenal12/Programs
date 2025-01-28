package Programs;
import java.util.Scanner;
import java.lang.Math;
public class Prob6 {
public static void main(String[] args) {
	
	Scanner c = new Scanner(System.in);
	Prob6 ch = new Prob6();
	System.out.println("Radius :");
	int r = c.nextInt();
	System.out.println("Circumference:"+circumferenceOfCircle(r));
	System.out.println("Area:"+ch.areaOfCircle(r));
	System.out.println("Enter L,B,H:");
	int l = c.nextInt();
	int b = c.nextInt();
	int h = c.nextInt();
	
	System.out.println("Volume of BOX:"+ch.volumeOfBox(l, b, h));
	System.out.println("Volume of Cylinder:"+volumeOfCylinder(r,h));
	
}
public static float circumferenceOfCircle(int rad)
{
	
	return 2*3.14f*rad;
}
double volumeOfBox(int l , int b, int h)
{
	return l*b*h;
}
double areaOfCircle(int rad)
{
	return 3.14*rad*rad;
}
static double volumeOfCylinder(int r, int h)
{
	return Math.PI*Math.pow(r, 2)*h;
}
}
