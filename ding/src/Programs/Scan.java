package Programs;
import java.util.Scanner;
public class Scan {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String a = s.next();
	System.out.println(a);
	/*Commenting s.nextLine() will make the buffer memory store
	 *  the previous memory and pass them to other variables created
	 */
	s.nextLine();
	String b = s.nextLine();
	System.out.println(b);
	}
}
