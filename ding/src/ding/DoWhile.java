package ding;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char c;
		do {
			System.out.println("Bazinga!!!");
			System.out.println("Wanna be fooled again? Type y for yes, no for n:");
			c=s.next().charAt(0);
		}
		while(c=='y');

	}

}
