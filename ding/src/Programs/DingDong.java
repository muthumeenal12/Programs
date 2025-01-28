package Programs;
import java.util.Scanner;
public class DingDong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n:");
		reverse(s.nextInt());
		System.out.println();
		DingDong a = new DingDong();
		System.out.println("Enter a and z:");
		a.lower(s.nextInt(),s.nextInt());
		a.Upper(s.nextInt(),s.nextInt());

	}
	public static void reverse(int n)
	{
		for(int i =n;i>-1;i--)
		{
			System.out.print(i+" ");
		}
		
	}
	public void lower(int a, int z)
	{//a-97 z-122
		for(;a<=z;a++)
		{
			System.out.print((char) a+" ");
		}
	}
	public void Upper(int A,int Z)
	{
		for(;A<=Z;A++)
		{
			System.out.println((char) A+" ");
		}
	}

}
