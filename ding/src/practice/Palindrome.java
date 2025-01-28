package practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345;
		int temp=n;
		int rev=0;
//		while(n>0)
//		{
//			rev=rev*10+(n%10);
//			n=n/10;
//		}
		for(;n>0;n=n/10)
		{
			rev=rev*10+(n%10);
		}
		if(rev==temp)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
		System.out.println(rev);

	}

}
