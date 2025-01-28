package sTatic;

public class D {
	static int a = test();
	static int b =test()+demo();
	public static int test() {
		return 10;
	}
	public static int demo() {
		a=-5;
		return test()+20;
	}
	static {
		b=-3;
	}
	public static void main(String[] args) {
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}

}
