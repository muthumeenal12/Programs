package Programs;
import java.util.Scanner;
public class XyPh {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int l=0,f=0;
		int b=0;
		l=n%10;
		n/=10;
		while(n>=10)
		{
			b+=n%10;
			n/=10;
			//System.out.println(n);
		}
		f=n;
		//System.out.println(f);
		if(l+f==b)
			System.out.println("Xylem");
		else
			System.out.println("Pholem");
		
	}
}
