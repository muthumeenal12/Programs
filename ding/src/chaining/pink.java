package chaining;
class A
{
	static int a=30;
}
class b extends A{
	static {
		a=50;
	}
}
public class pink {
	//static { a =50;}
	public static void main(String[] args) {
		System.out.println(A.a);
		//System.out.println(a);
		System.out.println(b.a);
	}
	
}
