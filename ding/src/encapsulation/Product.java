package encapsulation;

class Product {
	private double price;
//	Product(double price)
//	{
//		this.price = price;
//		//System.out.println(this.price);
//	}
	 void setPrice(double price)
	{
		if (price>0)
			this.price=price;
		else
			System.out.println("Invalid Price");
	}
	 double getPrice()
	{
		
		return price>0?price:0;
	}

}

