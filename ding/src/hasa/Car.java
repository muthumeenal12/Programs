package hasa;

public class Car {
	private String name;
	String getNAme() {
		return name;
	}
	void setNAme(String name)
	{
		this.name=name;
	}
	//ACHEIVE HAS-A
	private Engine e=new Engine(1000);
	//Its private
	Engine getEngine()
	{
		return e;
	}
	Car(){
		
	}
	Car(String name)
	{
		setNAme(name);
	}

}
