package ding;
import java.util.Scanner;
public class Array {
public static void main(String[] args) {
	//nonD();
	//dynamic();
	int a[]= {12,90,97};
	method(a);
	System.out.println();
	System.out.println(arr()[0]);
}public static int[]arr()
{
	int a[]= {10,20,30};
	return a;
}
public static void method(int a[]) {
	System.out.println("Array:");
	for (int i =0;i<a.length;i++)
		System.out.print(a[i]+" ");
	System.out.println();
	System.out.println("reverse:");
	for(int i =a.length-1;i>=0;i--)
		System.out.print(a[i]+" ");
}
public static void dynamic() {
	// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
	int a [] = new int[4];
	for(int i =0;i<a.length;i++)
		{a[i]=s.nextInt();
		System.out.println(a[i]);}
}
public static void nonD()
{
	int a[] = new int[5];
	//System.out.println(a);
	int b[]= {10,20,30};
	//System.out.println(b+" "+b.length);
	a[0]=10<a.length?7%5:6+8;
	//String c = ''
	if ("chotta".equals("Chotta"))
		a[1]=Math.max(a.length, b.length);
	int c = 7;
	a[3]=c;
	a[2]=Math.min(a.length, b.length);
	a[4]=0;
	
	for(int i =0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
}
}
