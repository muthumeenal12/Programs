package stack;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Stack{
	
	int top;
	int size;
	int [] stack;
//	Arrays(){}
	Stack(int size)
	{
		top=-1;
		this.size=size;
		stack=new int[size];
	}
	public boolean isFull() {
		return (top==size-1);
	}
	public boolean isEmpty()
	{
		
		return (top==-1);
	}
	public void push(int data)
	{
		if(isFull())
			System.out.println("Stack Overflow");
		else {
			try {
			stack[++top]=data;
//			System.out.println("Data added:"+data);
//			System.out.println(Arrays.toString(stack));
			System.out.println( toString());}
			catch(InputMismatchException e) {
				System.out.println(e.toString().replace("\n", " ").replace("\r", " "));

			}
	}}
	
	public String toString() {
		String str="[";
		int i =0;
		for(;i<=top;i++)
		{
			if(i==0)
				str+=(stack[i]);
			else
				str+=(","+stack[i]);
		}
		str+="]";
		return str;
		
	}
	public void pop() {
		if(isEmpty()) System.out.println("Stack Underflow");
		else
		{
			
			int data =stack[top];
			top--;
			System.out.println("Data Removed: "+data);}
			
//				System.out.println(e.printStackTrace());
//				e.printStackTrace();
//				e.getMessage();
//				System.out.println(e.toString());
			}
		
	
	public void display()
	{
		System.out.println(Arrays.toString(stack));
	}
}
