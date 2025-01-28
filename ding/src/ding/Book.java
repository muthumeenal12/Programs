package ding;

public class Book {
public static void main(String[] args) {
	System.out.println(new Example());
	System.out.println(new Example());
	System.out.println(new Example());
	System.out.println(new Book());
	Book b1 = new Book();
	Book b2 = new Book();
	Book b3= new Book();
	System.out.println(b1==b2);
	System.out.println(b1==b3);
	Example e1  = new Example();
	Example e2= e1;
	Example e3 = e2;
	System.out.println(e1==e2);
	System.out.println(e1==e3);
	System.out.println(e2==e3);
	
}
}
class Example
{
	
	
}

