package Collections;

import java.util.ArrayList;

public class ArryList {

	public static void main(String[] args) {
		ArrayList al1= new ArrayList(); //ctrl+shift+o
		al1.add(10);
		al1.add("mango");
		al1.add(null);
		al1.add('c');
		al1.add(true);
		al1.add(40.56f);
//		System.out.println(al1.toString()); Iplicitly called
				
		al1.add(1, "Trip");
//		al1.add(19,"Cancel"); Index: 19, size: 7 //IOOBE.....
		System.out.println(al1);
		
		ArrayList al2 = new ArrayList();
		al2.add("fghjk");
		al2.add(90);
		al1.addAll(al2);
		System.out.println(al1);
		System.out.println(al2);
		
		System.out.println(al1.contains(10));
		System.out.println(al1.contains("ol"));
		
		System.out.println(al1.containsAll(al2));
		
		al2.clear();
		System.out.println(al1);
		System.out.println(al1.get(0));
		System.out.println(al1.removeAll(al2));
		System.out.println(al1);
	}

}
