package string;

public class simple {
	public static void main(String[] args) {
		String s1="Flare";
		s1="Stir";
		System.out.println(s1);
		String s2=" Night";
		String con= s1.concat(s2);
		System.out.println(con);
		
		boolean check=s2.equalsIgnoreCase(s1);
		System.out.println(check);
		
		String check2=con.replace("Stir","Simp" );
		System.out.println(check2);
		
		String upp=check2.toUpperCase();
		System.out.println(upp);
		
		String loww = check2.toLowerCase();
		System.out.println(loww);
		
		
	}

}
