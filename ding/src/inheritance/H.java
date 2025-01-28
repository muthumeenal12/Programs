package inheritance;
class G{
	int x;
	
}
public class H extends G {

	int y;
	void test() {
		System.out.println(y);
		System.out.println(x);
	}
	public static void main(String[] args) {
		H t = new H();
		//y=0; not possible
		t.x=75;
		t.test();
		
	}
}
