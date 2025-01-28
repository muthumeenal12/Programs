package Programs;
import java.util.Scanner;
public class SquareX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		
		int[] sequence = generateSequence(s.nextInt());
		for(int index=0;index<sequence.length;index++)
			System.out.print(sequence[index]+", ");

	}
	public static int[] generateSequence(int no_of_terms)
	{
		int result[]=new int[no_of_terms];
		for(int index=0;index<no_of_terms;index++)
		{
			result[index]=(index+1)*(index+1);
		}
		return result;
		
	}

}
