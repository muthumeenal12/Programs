package hasa;

public class Tyre {
	private String Brand;
	String getBrand()
	{
		return Brand;
	}
	void setBrand(String Brand)
	{
		this.Brand=Brand;
	}
	Tyre(String Brand)
	{
		setBrand(Brand);
	}

}
