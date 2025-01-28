package sTatic;

public class Example {
	public static void demo()

	{
		System.out.println("From Demo()");
		
	}
	public static void main(String[] args) {
		System.out.println("Main Start");
		demo();
		Example.demo();
		System.out.println("Main End");
	}
}
