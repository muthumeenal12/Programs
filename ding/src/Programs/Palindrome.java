package Programs;

public class Palindrome {
public static void main(String[] args) {
	//amstrong();
	SPY();
}
public static void palindrome()
{
	int n = 121;
	int org=n;
	int rev=0,r;
	while(n>0)
	{
		r=n%10;
		rev=rev*10+r;
		n=n/10;
		//System.out.println(rev);
		
	}
	System.out.println(org==rev?"palindrome:"+org:"not a palindrome");

}
public static void amstrong()
{
	int num =153;
	int temp=num;
	int s=0;
	for (int i =num;i>0;i=i/10)
	{
		s+=Math.pow(i%10, 3);
	}
	System.out.println(temp==s?"Amstrong:"+s:"Not a Amstrong");
}
public static void SPY()
{
	int num = 1124;
	int sum=0, mul=1;
	for(int i = num;i>0;i=i/10)
	{
		sum+=i%10;
		mul*=i%10;
	}
	System.out.println(sum==mul?"SPY number:"+num:"Not a SPY number");
}
}
