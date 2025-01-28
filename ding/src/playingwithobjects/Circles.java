package playingwithobjects;

public class Circles {
	public static double computeDiameter(Circle c)
	{
		return 2*c.getR();
		//c.rad; cause error becoz rad is private
	}
	public static double computeArea(Circle c)
	{
		return Math.round(Math.PI*Math.pow(c.getR(), 2));
	}
	public static double computeCircumference(Circle c)
	{
		return Math.round(Math.PI*2*c.getR());
	}

}
