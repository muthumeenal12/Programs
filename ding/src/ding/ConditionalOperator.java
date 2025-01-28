package ding;

public class ConditionalOperator {
	public static void main(String[] args) {
		
	
	
	pavin();
	}
	public static void basic()
	{
		int suzuka = 420;
		int nobita=108;
		//boolean Yes = suzuka>nobita?suzuka:nobita;  => throws an error
		int Yes = suzuka > nobita? suzuka:nobita;
		System.out.println(Yes);
		//or
		System.out.println(suzuka>nobita?suzuka:nobita);
		boolean res = 10>11?true:false;
		System.out.println(res);
		//Expression
		int Res = (1+20+20-10)==(1+20+20-10) ? 31:41;
		System.out.println(Res);
		int lot = (1+20+20-10)==(1+20+20-10)&& (Res/2!=0) ? 31:41;
		System.out.println(lot);
		int Lot = (1+20+20-10)==(1+20+20-10)&& (Res/2!=0)|| (lot/5==0) ? 31:41;
		System.out.println(Lot);
		System.out.println((1+20+20-10)==(1+20+20-10)&& (11+0==0) ? 31:41);
		int ans=(10+10+12)==(10+10+12)?((12+1==13+1)?10:12):((12+1<13+1)?1:0);
		System.out.println(ans);
	}
	public static void pavin()
	{
		int Pavin = 500;
		int Padmesh = 350;
		//int res = (Pavin>Padmesh)?(System.out.printf(500)):Padmesh; CTE
		String R = (Pavin>Padmesh)?"System.out.printf(500)":"Padmesh";
	System.out.println(R);
	}
	

}
