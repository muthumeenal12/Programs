package inheritance2;

public class Updates {
	static Updates u ;
	 private Updates(){
		System.out.println("Updates are underway....");
	}
	public static Updates getStatus()
	{
		if (u==null)
			u=new Updates();
		else 
			u=null;
	return u;	
	}
}
