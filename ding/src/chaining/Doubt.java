package chaining;

public class Doubt {

	
	int i, j;
	Doubt(int i , int j)
	{
		this.i=i;
		this.j=j;
		System.out.println(i+" "+j);
	}
	
//	Doubt(int i, int j)
//	{
//		this.i=i;
//		this.j=j;
//	}   Can u override a constructor?
	public static void main(String[] args) {
		Doubt d = new Doubt(3,4);
	}
}
