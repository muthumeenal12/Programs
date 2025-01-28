package Programs;
import java.util.Scanner;
import java.security.*;
public class Bank {
	static {
		System.out.println("Welcome To ICICI Bank");
		System.out.println("Insert card!");
		System.out.println("Enter PIN:");
		Scanner s = new Scanner(System.in);
		int l =s.nextInt();
		if(l>0000 && l<10000)
			System.out.println(" Enter Operation Number: "+"\n"+
								"1. Withdrawal"+"\n"+"2. Deposit");
		else
			System.out.println("Invalid Pin, Retry.");
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int opt=s.nextInt();
		switch(opt) {
		case 1: 
		{
			System.out.println("Choose The Account:"+"\n"+
		"1. Savings[s]"+"\n"+"2.Current Account[ca]");
			String c=s.nextLine();
			Withdrawal(c);
			
		}
		}
	}
	public static void Withdrawal(String c) {
		SecureRandom sr = new SecureRandom();
		int bal = sr.nextInt();
		System.out.println(bal);
		String option="";
//		if(c=="1" || c=="s")
//			option="Saving";
//		else if(c=="2"||c=="ca"|| c=="c")
//			option = "Current";
//		else
//			System.out.println("Incorrect choice");
//		switch(option)
//		{
//		case "Saving":
//		{
//			
//		}
//		}
	}
	//public static void SavingsCurrent(c)

}
