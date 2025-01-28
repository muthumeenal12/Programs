package multilevel;

public class Animal {
double weight;
Animal(){}
Animal(double weight){
	this.weight = weight;
}
}
class Person extends Animal{
	String name;
	Person(){}
	Person(String name){
		this.name=name;
	}
	Person(String name,int weight)
	{	//this.name=name;
		super(weight);
		this.name=name;
	}
}
class Student extends Person{
	int sid;
	Student(){
		
	}
	Student(int sid, String name)
	{
		super(name);
		this.sid=sid;
	}
	Student(int sid,String name,int weight)
	{
		super(name,weight);
		this.sid=sid;
	}
}