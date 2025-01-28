package sTatic;

public class Book {
	static void read() {
		//System.out.println("User: "+name);
		//Unresolved compilation problem: 
		//name cannot be resolved to a variable
		System.out.println("User "+Person.name);
	}

	public static void main(String[] args) {
		read();
	}
}
