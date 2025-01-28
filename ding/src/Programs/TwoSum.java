package Programs;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int [] a= {2,25,7,8,11};
		//Arrays.s
		int n =a.length;
		int target=21;
		int[] b =new int[2];
		for(int i =0;i<n;i++)
		{
			for(int j =0;j<n;j++)
			{
				if(a[i]+a[j]==target && i!=j)
				{
					b[0]=a[i];
					b[1]=a[j];
			}
			}
		}
		if(b[0]+b[1]==target)
			System.out.println(Arrays.toString(b));
		else
			System.out.println("No Target Found");
	}
}
