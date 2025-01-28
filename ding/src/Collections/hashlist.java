package Collections;
import java.util.HashSet;
import java.util.LinkedList;
public class hashlist {
	public static void main(String[] args) {
		HashSet h =  new HashSet  ();
		h.add(12);
		h.add("nila");
		h.add(8);
		h.add(true);
		h.add(h);
		LinkedList s = new LinkedList();
		s.add("0");
		s.add("Nila");
		s.add(89);
		h.add(s);
		System.out.println(h);
  		
	}
	

	
}
