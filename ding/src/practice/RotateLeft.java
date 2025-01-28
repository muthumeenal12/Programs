package practice;

import java.util.Arrays;

public class RotateLeft {

	public static int[] rotateLeft3(int[] a)
	{	int b[]= {a[1],a[2],a[0]};
		
		
		
		return b;
	}
	public static void main(String[] args) {
		int[]a={1,2,3};
		int[]A = rotateLeft3(a);
		System.out.println(Arrays.toString(A));
	}
}
