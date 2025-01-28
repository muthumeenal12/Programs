package sTatic;

public class CantBeDenied {
	static int i=10;
	public static void main(String[] args) {
		int a =0;
		char i ='g';
		System.out.println("Local variable:"+i);
		System.out.println("Local:"+a);
		System.out.println("Static Variable:"+CantBeDenied.i);
	}

}
