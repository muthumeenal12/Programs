package practice;

import java.util.Scanner;

public class MoodAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Analyze());
		
		

	}
	public static boolean Analyze()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Is Monkey-A smiling: ");
		boolean aMonkey=s.nextBoolean();
		System.out.println("Is Monkey-B smiling: ");
		boolean bMonkey = s.nextBoolean();
		return (aMonkey ^ bMonkey);
	}

}
