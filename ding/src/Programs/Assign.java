package Programs;
import java.util.Scanner;
public class Assign {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int c=0;
		
		
		if (n%5==0)
		{
			if (n/5<=5)
			{
				c+=n/5;
			}
			else
			{
				n-=25;
				c+=5;
			}
				
		}
		else
		{
			if(n/5>5)
			{
				n-=25;
				c+=5;
			}
			else {
			c+=n/5;
			n=n%5;}
			System.out.println(c);
			if(n%2==0)
			{
				if(n/2<=5)
				{
					c+=n/2;
				}
				else
				{
					c+=5;
					n-=10;
				}
			}
			else
			{
				if(n/2>5)
				{
					n-=10;
					c+=5;
				}
				else {
				c+=n/2;
				n=n%2;}
				System.out.println(c);
				if (n>0)
					c+=n;
			}
				
		}
		System.out.println(c);
	}
	

}
