package playingwithobjects;

public class Box {
	double length;
	//Make constructors private
	private Box(){
		
	}
	// so that createObj can be used, not allowing 
	//client to create obj ref outside the Box class.
	private Box(double length)
	{
		this.length=length;
	}

	public static Box creatObj()
	{
		return new Box();
	}
	public static Box creatObj(double length)
	{
		return new Box(length);
	}
}
