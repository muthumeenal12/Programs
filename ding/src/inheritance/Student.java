package inheritance;

public class Student extends Person{
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		walk();
	}

	public static void main(String[] args) {
		System.out.println("Planet Name:  "+planet_name);
		Student s = new Student();
		s.name="Ding Dong";
		s.age=9809898;
		s.display();
	}
}
