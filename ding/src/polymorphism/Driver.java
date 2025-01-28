package polymorphism;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = new Fruit();
		f.display();
		f=new Grapes();
		f.display();
//		Grapes g=new Grapes();
//		g.display();
//		g=new Fruit();  Not possible....
//		We did typecasting for General Class
	}

}
