package practice;

public class Spy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 123;
		int sum=0;
		int prod=1;
//		while(n>0)
//		{
//			sum+=n%10;
//			prod*=n%10;
//			n/=10;
//		}
		for(;n>0;n/=10)
		{
			sum+=n%10;
			prod*=n%10;
		}
		if(sum==prod)
			System.out.println("SPY ");
		else
			System.out.println("Not a spy");
		System.out.println(sum+" "+prod);

	}

}
