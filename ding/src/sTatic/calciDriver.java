package sTatic;

public class calciDriver {
	public static void main(String[] args) {
		System.out.println(calci.add(3, 5)); 
		System.out.println(calci.sub(3, 9));
		calci c = new calci();
		System.out.println(c.add(2, 9));
	}
	
}
class calci
{
	public static int add(int a, int b)
	{
		return a+b;
	}
	public static int sub(int a, int b)
	{
		return a-b;
	}
}
