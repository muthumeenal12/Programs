package Programs;

public class Driver {
	public static void main(String[] args) {
		//Create Objects
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		//Initialize the variable
		//Assign Data for book  1
		b1.title="Harry Potter";
		b1.price=1200;
		System.out.println(b1.title);
		System.out.println(b1.price);
		
		b2.title="Titanic";
		b2.price=800;
		System.out.println(b2.title);
		System.out.println(b2.price);
		
		b3.title="Java";
		b3.price=900;
		System.out.println(b3.title);
		System.out.println(b3.price);
	}

}
