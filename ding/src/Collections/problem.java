package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class problem {
	//wap that creates an arraylist and print all the element without 
	//Reference
	public static void main(String[] args) {
		
		
		create();
		
		
	}		
	public static void create()
	{
		ArrayList a = new ArrayList();
		a.add(10);
		a.add("List");
		a.add(false);
		a.add((int) '#');
		for(int i =0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		for(Object i:a)
		{
			System.out.println(i);
		}
		display(a);
	}
		public static void display(ArrayList a)
		
		{
			//wat insert type of  obj in array list and perform 
			//the following operations:
			//1) print only integer objects
			//2) print only char objects
			//3) print only string objects
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			switch(s)
			{
			case "s":
			{
				for(Object i : a)
					
				{
					if(i instanceof String)
						System.out.println(i);
				}
			}break;
			case "i":
			{

				for(Object i : a)
					
				{
					if(i instanceof Integer)
						System.out.println(i);
				}
			}break;
			case "b":
			{

				for(Object i : a)
					
				{
					if(i instanceof Boolean)
					System.out.println(i);
				}
			}break;
			case "c":
			{
				for(Object i : a)
				{
					if(i instanceof Character)
						System.out.println(i);
				}
			}break;
			}
			
		}
}


