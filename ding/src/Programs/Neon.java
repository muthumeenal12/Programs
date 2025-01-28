package Programs;
import java.util.Scanner;
public class Neon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int s=n*n;
		int sum=0;
		while(s>0)
		{
			sum+=s%10;
			s/=10;
			
		}
		System.out.println(n*n+" "+sum);
		if(sum==n)
			System.out.println("Neon");
		else
			System.out.println("not a neon");
	}
}
