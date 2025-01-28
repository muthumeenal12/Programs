package sTatic;

public class BookTest {
	public static void main(String[] args) {
		
	

	Books b1 = new Books("Java");
	Books b2 = new Books("Surrounded By Idiots");
	Books b3 = new Books("The Wicked Kingdom");
	
	b1.c=1;
	System.out.println(b1.c);
	System.out.println(b2.c);
	System.out.println(b3.c);
	b2.c=6;
	System.out.println(b1.c);
	System.out.println(b2.c);
	System.out.println(b3.c);
	
}
}
