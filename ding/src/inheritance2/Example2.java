package inheritance2;
class Parent{
	public void demo() {
		System.out.println("From Demo()");
	}
}
class Child extends Parent {
	
}
public class Example2 {
public static void main(String[] args) {
	

	Child c = new Child();
	c.demo();
}
}