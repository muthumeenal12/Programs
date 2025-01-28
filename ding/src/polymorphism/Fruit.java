package polymorphism;

 class Fruit {
	void display() {
		System.out.println("Hello");
	}

}
class Grapes extends Fruit{
	void display() {
		System.out.println("Bye");
	}
}
