package practice;

import java.util.Arrays;
import java.util.Scanner;

public class RiskSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Length: ");
		int n =s.nextInt();
		int[] a =new int[n];
		int zero=0;
		int one=0;
		System.out.println("Enter the elements: ");
		for(int i =0;i<n;i++)
		{
			a[i]=s.nextInt();
			if (a[i]==0)
				zero++;
			else if(a[i]==1)
				one++;
			
		}
		System.out.println(zero+" "+one);
		for(int i =0;i<n;i++)
		{
			if (i<zero)
				a[i]=0;
			else if(i>=zero && i<(one+zero))
				a[i]=1;
			else
				a[i]=2;
		
			}
		System.out.println(Arrays.toString(a));
		

	}

}
