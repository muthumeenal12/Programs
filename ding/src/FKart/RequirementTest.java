package FKart;

public class RequirementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Requirement r = new Requirement();
		Requirement r1 =new Requirement(123,"Wane");
		Requirement r2 =new Requirement(123,"Wane",20);
		Requirement r3 =new Requirement(123);
		System.out.println(r.name+" "+r.sid+" "+r.age);

		System.out.println(r1.name+" "+r1.sid+" "+r1.age);
		System.out.println(r2.name+" "+r2.sid+" "+r2.age);
		System.out.println(r3.name+" "+r3.sid+" "+r3.age);


	}

}
