package FKart;

public class Test {

	public static void main(String[] args) {
		
		//Create Object
		EndCustomer c1=new EndCustomer();
		EndCustomer c2=new EndCustomer();
		//EndCustomer c3=new EndCustomer();
		//Initialize 
		c1.cid="1";
		c1.name="Smith";
		c1.pwd="123";
		
		c2.cid="2";
		c2.name="Martin";
		c2.pwd="987";
		System.out.println("Customers");
		System.out.println("ID: "+c1.cid);
		System.out.println("Name: "+c1.name);
		System.out.println("=========================");
		System.out.println("ID: "+c2.cid);
		System.out.println("Name: "+c2.name);
	}
}
