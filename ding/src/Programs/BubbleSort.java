package Programs;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = {1,45,2,67,3,56};
		for(int i =0;i<a.length;i++)
		{
			for(int j =0;j<a.length-i-1;j++)
			{
				int temp=a[j];
				if (a[j]>a[j+1])
				{
					a[j]=a[j+1];
					a[j+1]=temp;
				}
					
				
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
