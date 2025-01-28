package ding;

public class IncrementDecrementOperator {
	public static void main(String[] args) {
		
	
	int a = 20;
	int b = -10;
	int c = a + ++b;
	int d = a++ - b++ + ++c;
	System.out.println(a+","+b+","+c+","+d);
	
	int n=10;
	int var=n++;
	System.out.println(n+","+var+","+var);
	
	}

}
