package software;

import java.util.Scanner;

public class Users {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String name=c.nextLine();
		System.out.print("Enter Salary: ");
		double sal =c.nextDouble();
		Emp n =Emp.objCreation(name, sal);
		
		
	}

}
