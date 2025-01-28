package inheritance;

import inheritance2.A;

class A{
	static int age=10;
	static void demo()
	{
		System.out.println("HI");
	}
	static {
		System.out.println("From class A");
	}
}
public class B extends A{
	static int j;
	//if specified, prioritized first
	//static int age; 
//	static void demo()
//	{
//		System.out.println("Hello");
//	}
	
	//For multiple static initializer, 
	//Parent class executes first in terms of static initiaziler
	static {
		System.out.println("From class B");
	}
	public static void main(String[] args) {
		
		System.out.println(A.age);
		System.out.println(age);//INHERITED MEMBER
		System.out.println(j);//DECLARED MEMBER
		demo();
		A.demo();//Not necessary to use
		
	}

}
