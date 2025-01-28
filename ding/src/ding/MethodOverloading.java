package ding;

public class MethodOverloading {

	public static void demo()
	{
		System.out.println("Hello");
	}
	public static void demo(int i)
	{
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		demo();
		demo(10);
	}
}
