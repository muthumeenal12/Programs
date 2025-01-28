package playingwithobjects;

public class Bed {
	int cargoCapacity;
	double bedLength;
	private Bed()
	{
		
	}
	private Bed(int cargoCapacity, double bedLength)
	{
		this.bedLength=bedLength;
		this.cargoCapacity=cargoCapacity;
	}
	public static Bed createObj()
	{
		return new Bed();
	}
	public static Bed createObj(int cargoCapacity, double bedLength)
	{
		return new Bed(cargoCapacity, bedLength);
	}

}
