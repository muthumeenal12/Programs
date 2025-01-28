package Programs;
import java.util.Scanner;
public class W {
	public static void main(String[] args) {
		int c=0,i=0;
		Scanner ch = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String s =ch.nextLine();
		//System.out.println(s);
		char[] a=s.toCharArray();
		while (i<s.length())
		{
			if(i<a.length-1 && a[i]=='0' && a[i+1]=='0')
				
			{
				c+=1;
				i+=2;
			}
			else
			{
				c+=1;
				i+=1;
			}
		}
		System.out.println("The minimum no of keys to be pressed: "+c);
	}

}
