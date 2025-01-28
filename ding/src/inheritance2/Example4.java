package inheritance2;
class BaseClass{
	int x =10;
}
class Derived extends BaseClass{
	int y =9;
}
public class Example4 {

	public static void main(String[] args) {
		BaseClass b = new BaseClass();
		System.out.println(b.x);
		//System.out.println(b.y); Not possible. Inheritance is unidirectional
	}
}
