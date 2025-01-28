package Programs;

public class Method {
	static void m1()//method declaration
	{
		System.out.println("I am a dumbkof");
	}
	static int m2()
	{
		System.out.println("Sweet Patootie!");
		return 0;//TO return value and stop the method
		//System.out.println("I am genius"); => Unreachable code
	}
	public static void main(String[] args) {
		//m1();
		//m2();
		System.out.println(add(4,5));
		int res = add(5,4);
		System.out.println(res==add(4,5));
		System.out.println(Add(4,6));
		System.out.println((double)addition('X','p'));//widening
		System.out.println((char)addition('X','p'));
		
	}
	static int add(int a, int b)
	{
		return a+b;
	}
	static int Add(double a, int b)
	{
		return (int)a+b;//if (int) is not present error prevails.
		//this conversion is narrowing
		//return type is int see method declaration
	}
	static int addition(char a, char b)
	{
		return a+b;
	}

}
