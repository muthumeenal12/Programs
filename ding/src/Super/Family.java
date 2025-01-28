package Super;
class Father{
	String name ="James";
	
}
class Son extends Father{
	String name ="Smith";
//	void sonData()
//	{
//		System.out.println("Father Name: "+super.name);
//		System.out.println("My name is:"+this.name);
//	}
	static void done() {
		Father s1 = new Father();
		System.out.println(s1.name);
	}
	
}

public class Family {
	public static void main(String[] args) {
		Son s =new Son();
//		s.sonData();
		Son.done();
	}

}
