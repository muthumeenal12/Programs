package inheritance3;

public class Parent {
	static int a =10;
	static int b;
	static{
		a=20;
		b=30;System.out.println("parent is loaded successfully");
	}

	static void parentMethod() {
		System.out.println("Parent.parentMethod()");
	}
}
