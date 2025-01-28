package practice;

import java.util.Arrays;

public class FrontPiece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1};
		int[] b =frontPiece(a);
		System.out.println(Arrays.toString(b));
	
		
	}
	public static int[] frontPiece(int[] a)
	{	
		if(a.length>=2) {
			int[]b= {a[0],a[1]};
			return b;
		}
		else {
			
			int[] b =a;
			return b;
			
	}
		
	}

}
