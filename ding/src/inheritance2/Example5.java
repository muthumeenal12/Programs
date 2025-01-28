package inheritance2;
class Doctor{
	int dlno;
	String name;
	public void checkPulse() {
		System.out.println("Checking Pulse");
	}
	public void checkBP()
	{
		System.out.println("Checking BP");
	}
}
class Cardiologist extends Doctor{
	//extends can help with
	//checkPulse()
	//checkBP()
	//name
	//dlno
	public void bypassSurgery() {
		System.out.println("Bypass Surgery in progress");
	}
}
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cardiologist c = new Cardiologist();
		c.bypassSurgery();
		System.out.println(c.name);
	}

}
