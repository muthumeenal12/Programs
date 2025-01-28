package practice;

import java.util.Scanner;

public class Maxtriple {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
		int[] a= {5};
		maxTriple(a);
		
	}
	public static void maxTriple(int[]a)
	{	int n=a.length;
		if(a[0]>a[n-1])
			System.out.println(Math.max(a[0],a[n/2]));
		else
			System.out.println(Math.max(a[n-1], a[n/2]));
	}
}
