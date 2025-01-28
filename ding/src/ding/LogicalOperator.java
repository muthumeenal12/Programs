package ding;

public class LogicalOperator {
	public static void main(String[] args) {
	//and();
	//or();
	not();
		}
	public static void and()
	{
		String color = "Black";
		String size = "S";
		System.out.println(color=="Black" && size =="S");//1,1=1
		System.out.println(color=="Blue"&&size=="L");//0,0=0
		System.out.println(color=="Black"&&size=="L");//1,0=0
		System.out.println(color=="Blue"&&size=="S");//0,1=0
	}
	public static void or()
	{
		String color = "Black";
		String size = "S";
		System.out.println(color=="Black" || size =="S");//1,1=1
		System.out.println(color=="Blue"||size=="L");//0,0=0
		System.out.println(color=="Black"||size=="L");//1,0=1
		System.out.println(color=="Blue"|| size=="S");//0,1=1
	}
	public static void not()
	{
		String color = "Black";
		String size = "S";
		System.out.println(!(color=="Black" || size =="S"));//1,1=0
		System.out.println(!(color=="Black" && size =="S"));//1,1=0
	}
}
