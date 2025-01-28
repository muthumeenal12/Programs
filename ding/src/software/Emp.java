package software;

public class Emp {

	String ename;
	static String sid;
	double sal;
	Emp(){
		this("No one",0);
		
	}
	Emp(String ename,double sal)
	{
		this.ename = ename;
		//this.sid=sid;
		if(ename.equalsIgnoreCase("No one")||ename.trim().isEmpty()|| ename.equalsIgnoreCase("null"))
			{sid="_";}
		else
			{sid = "BattleField_"+2021+"_PECAI_"+ename.length();}
		this.sal=sal;
		cal(ename,sid,sal);
	}
	static void cal(String ename,String sid,double sal) {
		System.out.println("-----------------------");
		System.out.println("NAME: "+ename);
		System.out.println("ID: "+sid);
		System.out.println("SAL: "+sal);
		System.out.println("-----------------------");
	}
	
	public static Emp objCreation(String ename, double sal)
	{
		return new Emp( ename,  sal);
	}
	
}
