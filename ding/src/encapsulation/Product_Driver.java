package encapsulation;

public class Product_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
		//System.out.println( p.price); It is private,
		//SO not visible.
		p.setPrice(-420);
		System.out.println(p.getPrice());
		

	}

}
