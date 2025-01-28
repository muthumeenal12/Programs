
public class Initializer {
	static {
		int b=5;
		a=10;
		System.out.println(b);
//		System.out.println(a); Not Defined? Yes --> Error
	}
	static int a =10;
	public static void main(String[] args) {
		System.out.println(a);
//		System.out.println(b); 
//		Error? It's local to 
//		that initializer, silly
		
	}

}
