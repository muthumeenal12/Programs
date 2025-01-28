package stack;

import java.util.Scanner;

public class StackDriver {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int size = s.nextInt();
		Stack ob = new Stack(size);
		boolean b =true;
		while(b)
		{
			System.out.println("================================");
			System.out.println("Enter your option: ");
			System.out.println("1.Push"+"\n"+"2.Pop"+"\n"+"3.IsEmpty"
								+"\n"+"4.isfull"+"\n"+"5.Display the stack elements"
								+"\n"+"6.Exit");
			System.out.println("================================");

			int ch =s.nextInt();
			switch(ch)
			{
			case 1:{
				System.out.println("Enter Data: ");
				int data = s.nextInt();
				
				ob.push(data);
				
			}break;
			case 2:
			{
				ob.pop();
				}break;
			case 3:
			{
				if (ob.isEmpty()) System.err.println("Empty Stack!!!");
				else System.out.println("Not empty");
			}break;
			case 4:
			{
				if(ob.isFull()) System.out.println("Stack is full");
				else System.out.println("Stack is not full");
			}
			case 5:
			{
				//Implicitly 'toString()' is called......
				System.out.println(ob);
			}break;
			case 6:{
				b=false;
			}break;
			default:
			{
				System.out.println();
			}
		}

}
	}
}
