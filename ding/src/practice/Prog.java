package practice;

import java.util.Scanner;

public class Prog {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length:");
		int n =s.nextInt();
		System.out.println(solution(n));
		//new Scanner(System.in);
		
	}
	public static boolean solution(int n)
	{	Scanner s = new Scanner(System.in);
		System.out.println("Enter the array element: ");
		int[] a = new int[n];
		for (int i =0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		 
			return (a[0]==9 ||a[n-1]==9);
//		else
//			System.out.println("false");
	}
}
