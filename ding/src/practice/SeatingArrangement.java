package practice;

public class SeatingArrangement {
	public static void main(String[] args) {
		int[] a= {0,0,1,1,0};
		int zero=0;
		int one=0;
		for(int i =0;i<a.length;i++)
		{
			if(a[i]==0)
				zero++;
			else
				one++;
		}
		System.out.println(zero+" "+one);
//		System.out.println(Integer.toString(13,2));
	}

}
