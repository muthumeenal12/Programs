package FKart;

public class Requirement {

	String name;
	int age;
	int sid;
	Requirement()
	{
		}
	Requirement(int sid )
	{
		this.sid=sid;
	}
	Requirement(int sid, String name)
	{
		this.sid = sid;
		this.name=name;
	}
	Requirement(int sid, String name, int age)
	{
		this.sid=sid;
		this.name = name;
		this.age=age;
	}
	
	}
