package hasa;

public class Engine {
	//Dependent class in car-engine

	private double hp;
	double getHP()
	{
		return hp;
	}
	void setHP(double hp)
	{
		this.hp=hp;
	}
	Engine(){
		
	}
	Engine(double hp)
	{
		setHP(hp);
	}
}
