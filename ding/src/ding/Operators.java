package ding;

public class Operators {
	public static void main(String[] args) {
		//Add();
		//Mult();
		Remainder();
	}
	public static void Add()
	{
		char c=51;
		System.out.println(35+"69");
		System.out.println("35"+69);
		System.out.println('3'+69);
		System.out.println(c);
		System.out.println('A'-61);
		System.out.println(' '-3);
		//System.out.println(' '-true);
		//System.out.println("String"-"String");  CTE
	}
	public static void Mult()
	{
		System.out.println('A'*'A'); 
		/* CompilationTimeSuccess 
		 * Return type = int
		 * Return value = 4225
		 */
		System.out.println('A'*2.3);
		//Divide Operator
		System.out.println(2/4);
		/*Quotient is the answer
		 * Return type is an Integer
		 */
		System.out.println(30/5);
		//System.out.println(30/0);
		/*
		 * ArithmeticException: / by zero
		 */
		System.out.println(30.0/5.0);
		System.out.println(2/9.1);
		System.out.println(30.0/0.0);
		System.out.println(30/0.0);
		System.out.println('A'/0.0);
		System.out.println(0.0/0.0);
		/*
		 * Anything / by 0.0 is Infinity,
		 *  in case of 0.0/0.0, the answer is NaN
		 */
		System.out.println(3%10);// Remainder
		System.out.println(10%3);
		
		
	}
	public static void Remainder()
	{
		int rem =0;
		//int rem =9;   Duplicate local variable 
		int num = 62;
		rem = num%10;//For remainder
		System.out.println(rem);
		num=num/10;//To remove the last digit 
		System.out.println(num);
	}
	

}
