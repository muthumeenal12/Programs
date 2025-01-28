package sTatic;

public class ex {
	static int i,j;
	static {
		i=test();
		j=0;
		System.out.println("stat:"+i);
	}
	public static int test() {
		System.out.println(i);
		return 10;
	}
	public static void main(String[] args) {
		System.out.println(i);
	}

}
