package inheritance3;
class A{
	int i;
	A()
	{
		System.out.println("A.A()");
	}
}
class b extends A
{
	int j;
	{
		i=9;
	}
	b(){
		System.out.println("b.enclosing_method()");
	}
}
public class Example {
public static void main(String[] args) {
	b ob=new b();
	System.out.println(ob.j+ob.i);
}
}
