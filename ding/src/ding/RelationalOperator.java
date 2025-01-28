package ding;

public class RelationalOperator {

	public static void main(String[] args) {
		
		//Comparison();
		//lessAndGreat();
		//LGEN();	
		}
	public static void Comparison()
	{
		System.out.println("A"=="a");//false
		System.out.println(1==5);//false
		System.out.println(0==0.0);//true
		System.out.println('0'==0.0);//false
		System.out.println(true==false);
		//System.out.println("0.0"==0);//string cannot be compared with int ERROR
	}
	public static void lessAndGreat()
	{
		System.out.println('A'<'a');
		System.out.println(0<-1);
		System.out.println(-0.1<0);
		//System.out.println("Str"<"St"); Not defined for strings
		System.out.println('A'>'b');
		System.out.println(1>0.9999);
		System.out.println(-0.98>3);
	}
	public static void LGEN()
	{
		System.out.println('A'>='a');
		System.out.println(1.9<=0.0);
		System.out.println(9>=9.0);
		//System.out.println(true<=false);
		System.out.println(true==false);
		System.out.println(-1==1);
		
	}

}
