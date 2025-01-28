package Programs;

public class ascii {

	public static void main(String[] args) {
		asciiChar('a');
		asciiChar('&');
		System.out.println(asciiCh(' '));
		
	}
	public static void asciiChar(char c)
	{
		System.out.println((int) c);
	}
	
	public static int asciiCh(char ch) {
		return ch;
		
	}
}
