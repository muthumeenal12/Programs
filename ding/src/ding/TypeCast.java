package ding;

public class TypeCast {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = a++;
		System.out.println(c);// 10 becoz of unary operator.
		//byte m = a+b;// CTE: TypeMisMatch
		int m = a+b;
		System.out.println(m);
		int s=10;
		double k =10.5;
		//k=s;
		//System.out.println(k+","+s);
		System.out.println(10+10.5);
	}

}
