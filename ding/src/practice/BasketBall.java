package practice;

import java.util.Scanner;

public class BasketBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:" );
		int n=sc.nextInt();
		System.out.println("Enter the Size of Sub Array: ");
		int k=sc.nextInt();
		int [] a= new int[n];
		System.out.println("Enter array elements: ");
		for(int i =0;i<n;i++)
			a[i]=sc.nextInt();
		int ans=0;
		
		for(int i =0;i<n-k+1;i++)
//		{	int c=0;
			
		{ int s=0;
		for(int j=i,c=1;c<=k;j++,c++) 
			s+=a[j]*(c);
//			System.out.println("1st: "+a[j]*(c));
//			System.out.println(s);}
			
		if (s>ans)
			ans =s;
		}
		System.out.println(ans);
		
	}

}
