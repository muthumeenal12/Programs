package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class zeroone {
	public static final String RESET = "\033[0m";
	public static final String PURPLE = "\033[0;35m";
	public static final String CYAN = "\033[0;36m";
	public static final String GREEN = "\033[0;32m";
	public static final String YELLOW = "\033[0;33m";
	public static void main(String[] args) {
		
		int[] a =getArr();		
		int[] b =new int[a.length];
		int [] c=zerone(a);
		if (c[0]+c[1]==a.length)
		{	
			setArr(b,c[0],c[1]);
			System.out.println("1's: "+c[0]+"\n"+"0's: "+c[1]);
		}
		else
			System.out.println("Invalid Format");
		
		
	}
	//Create array b with sorted 0's and 1's
	public static void setArr(int[] b,int o,int z) {
		for(int i=0;i<b.length;i++)
		{
			if(i<o)
				b[i]=1;
			else
				b[i]=0;
		}
		System.out.print(YELLOW+"The Desired Array:"+RESET);
		System.out.println(Arrays.toString(b));
	}
	//Check if the array is in 0's and 1's
	public static int[] zerone(int[] a)
	{
		int o=0,z=0;
		
		for (int i =0;i<a.length;i++)
		{
			if (a[i]==1||a[i]==0)
			{
				if(a[i]==1)
					o++;
				else
					z++;
			}

		}
		int [] b= {o,z};
		return b;
	}
	//Get your array and print it
	public static int[] getArr()
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println(GREEN+"Length of array:"+RESET);
		int n =s.nextInt();
		int[]a=new int[n];
		System.out.println(CYAN+"Enter the elements:"+RESET);
		for(int i =0;i<n;i++)
			a[i]=s.nextInt();
		System.err.println(PURPLE+"The array elements are:"+RESET);
		System.out.println(Arrays.toString(a));
		return a;
	}

}
