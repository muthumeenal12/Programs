package inheritance2;
class SuperClass{
	static int i ;
	public static void test() {
		System.out.println("From test");
	}
}
class SubClass extends SuperClass{
	
}
public class Example3
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass.test();//With the help of child class, 
		//parent attributes are used
		System.out.println(SubClass.i);
	}

}
