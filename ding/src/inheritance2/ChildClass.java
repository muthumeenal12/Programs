package inheritance2;

public class ChildClass extends ParentClass{
static {
	System.out.println("Child is loaded");
}
static void respect()
{
	System.out.println("Do not respect");
}
}
