package playingwithobjects;

public class BottleDriver {
	public static void main(String[] args) {
		Bottle b=Bottle.factoryMethod();
		b.setColor("Blue").setCapacity(10).display();
		Bottle b1=Bottle.factoryMethod("Pink", 20);
		b1.display();
		String color=Bottle.factoryMethod().display().setColor("Cyan")
										   .display().setCapacity(100)
										   .display().getColor();
//		String color=Bottle.factoryMethod().display().setColor("Cyan")
//				   .display().setCapacity(100)
//				   .display().getColor().setColor();
//		Not possible, it returns string, only methods in String is operatable.
		String color1=Bottle.factoryMethod().display().setColor("Cyan")
				   .display().setCapacity(100)
				   .display().getColor().toUpperCase();
		System.out.println("==================");
		System.out.println(color);
		System.out.println(color1);
	}

}
