package playingwithobjects;

public class BoxTest {

	public static void main(String[] args) {
		Box b = Box.creatObj(9);
		System.out.println(b.length);
		System.out.println(Box.creatObj(2).length);
		//System.out.println(new Box(9));
		//Not visible, made private.
	}
}
