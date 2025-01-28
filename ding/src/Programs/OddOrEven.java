package Programs;
import java.util.Scanner;
import java.lang.Math;
public class OddOrEven {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num =s.nextInt();
	switch(Math.abs(num%2))
	{
	case 1: 
		System.out.println("Odd");
		break;
	case 0: 
		System.out.println("even");
		break;
	}
}
}
