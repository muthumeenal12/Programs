package Programs;
import java.lang.Math;
public class Cube {
	public static void main(String[] args) {
		int res = cube(5);
		double R = cubes(10);
		System.out.println(res+","+R);
		
	}
	public static int cube(int n)
	{
		return n*n*n;
	}
	public static double cubes(double n)
	{
		double res = Math.pow(n, 3);
		return res;
	}

}
