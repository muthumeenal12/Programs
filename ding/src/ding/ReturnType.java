package ding;

public class ReturnType {
public static void  demo()

{
System.out.println("Start");
return;
//System.out.println("end"); Avoid any statement after return statement.
}
public void App()
{
	System.out.println("Tell ur girlfriend");
}
public static void main(String[] args) {
	demo();
	ReturnType.demo();
	//Method from Different class
	//add(); //Not possible
	LogicalOperator.or();
	//For Non Static Method
	ReturnType a = new ReturnType();
	a.App();
	}
}
