package ding;

public class Patterns {
public static void main(String[] args) {
	//secondary();
	inverse();
	//primary();
	
	
}
public static void primary()
{
	for( int i=0;i<5;i++)
	{
		for(int j =0;j<5;j++)
		{
			if(i==j)
			
				System.out.print('*');
			else 
				System.out.print(' ');
		
		}
		System.out.println();
	}
}
public static void secondary()
{
	for( int i=5;i>0;i--)
	{
		for(int j =5;j>0;j--)
		{
			if(i+j==6)
			
				System.out.print('*');
			else 
				System.out.print(' ');
		
		}
		System.out.println();
	}
}
public static void inverse()
{
	for( int i=1;i<=5;i++)//rows
	{
		for(int j =i;j<=5;++j)//cols
		{
		if(i==1 || j==i || j==5)
				System.out.print("* ");
		//else if( j%2==i%2 && i+j==6 )
				//System.out.print("*");
		else
			System.out.print("  ");
		}
		System.out.println();
	}
}
}
