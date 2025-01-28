package inheritance3;

public class Child extends Parent {

	static int c;
	static int d =5;
	static {
		a=50;
		b=77;
		c=34;
		d=29;
		System.out.println("child class is successfully loaded");
	}
	static void childMethod() {
		System.out.println("Child.childMethod()");
	}
}
