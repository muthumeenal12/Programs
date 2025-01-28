package chaining;

public class Student {

	 String name;
	  int sid;
	char age;
	Student(){
		
	}
	Student(int sid)
	{
		this.sid = sid;
		System.out.println(sid);
	}
	Student(int sid, String name)
	{
		//Copy data local to object
		//this.sid=sid; DRY use this.
		this(sid);
		this.name=name;
		System.out.println(name);
	}
	Student(int sid,String name,char age)
	{
		this(sid,name);
		this.age=age;
		System.out.println(age);
		
	}
	public static void main(String[] args) {
		Student s=new Student('9');
	}
}
