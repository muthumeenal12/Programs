package ding;
import java.util.Scanner;
public class IfElse {
public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("enter a and b:");
	int a = s.nextInt();
	int b = s.nextInt();
	if ( a>b)
	{
		System.out.println(a);
	}
	else
		System.out.println(b);
}
}
