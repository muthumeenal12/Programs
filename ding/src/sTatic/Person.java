package sTatic;

public class Person {

	static String name="Smith";
	static void display()
	{
		System.out.println(name);
	};
	public static void main(String[] args) {
		System.out.println("Main: "+name);
		display();
	}
}

