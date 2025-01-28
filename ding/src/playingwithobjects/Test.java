package playingwithobjects;

public class Test {
	public static void main(String[] args) {
		
	
	uml u1 = new uml("Darren",120,1234567890);
	uml u2 = u1;
	uml u3 = u1;
	uml u4 = u1;
	uml u5 = u1;
	System.out.println("#3rd: "+u3.id+" "+u3.name+" "+u3.phone);
	u4.id=890;
	u4.phone = 1989767600;
	System.out.println("#5th:"+u5.id+" "+u5.name+" "+u5.phone);
	}

}
