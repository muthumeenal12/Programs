package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		int[] a = getArr();
	
		for(int i=0;i<a.length;i++)
		{
			int num=0;
			int temp=a[i];
			while(temp>0)
			{
				num=num*10+temp%10;
				temp=temp/10;
			}
			a[i]=num;
//			System.out.println(temp);
		}
		printArr(a);
	}
	public static int[] getArr() {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Array Size:");
//		int n = s.nextInt();
//		int[] a = new int[n];
//		System.out.println("Enter the array element:");
//		for (int i =0;i<n;i++)
//		{
//			a[i]=s.nextInt();
//		}
//		return a;
		int [] a = {123,046,678};
		return a;
	}
	public static void printArr(int[] a)
	{
//		for(int i =0;i<a.length;i++)
//		{
//			System.out.print(a[i]+" ");
//		}
		System.out.println(Arrays.toString(a));
	}

}
