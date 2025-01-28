package Programs;

public class StaticI {
	  // CLASS MEMBER
	
	static { /// locAL BLOCK
		//int v=0;
		a=10;
		System.out.println(StaticI.a);
	} 
	static  int a =50; //gm
//	static {
//		a=90;
//	}
	
	
	public static void main(String[] args) {
		
		//StaticI s= new StaticI();
		//System.out.println(a);
		System.out.println(a*a);
		System.out.println(StaticI.a*StaticI.a);
	}
}
