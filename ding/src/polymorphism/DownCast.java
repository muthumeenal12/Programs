package polymorphism;

class Main{
	 int i;
	}
	public class DownCast extends Main{
	 int j ;
	 public static void main(String[] args) {
//	  DownCast d = (DownCast) new Main();
//	  System.out.println(d.i);
//	  Main m = new Main();
//	  System.out.println(((DownCast) m).i);
//		 DownCast d=(DownCast) new Main()
//;
//		 System.out.println(d.j);
		 Main m = new DownCast();
		 System.out.println(m);
		 Main m1 = new Main();
		 
		 DownCast d =(DownCast) m1;
		 System.out.println(d);
		 
	 }

	}
	