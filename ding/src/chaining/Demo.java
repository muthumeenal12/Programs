package chaining;

public class Demo {

	Demo()

{		this(2);
		System.out.println("From Demo");}
	Demo(int i)
	{
		//this();
		//this(2.2f);The commented cause recursive invocation
		System.out.println("From Demo Test");
	}
	Demo(float t)
	{	//this(2);
		System.out.println("From Demo Float");
	}
}
