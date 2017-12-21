package bankTesting;

import java.util.Scanner;

public class AdminTransactions extends MainLoginPage {
	static int balance;
	int previousBalance;
	CommonFunctions functions=new CommonFunctions();
	
	void deposit() {
		try 
		{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please enter amount to deposit: ");
		//int amt=sc.nextInt();
		//int amt= functions.getInputNum();
		String input= functions.getInput("Please enter amount to deposit: ");
		int amt=Integer.parseInt(input);
		balance= balance+amt;
		System.out.println("your account balance is  "+balance);
		
		previousBalance=balance-amt;
		System.out.println("your previous account balance was  "+previousBalance);
		System.out.println("Do you want to try again (Y/N) ");
		
		char opt=functions.getSingleCh();
		if (opt=='Y') {
			AdminLogin obj=new AdminLogin();
			obj.features();
			
		}else {
		System.out.println("Thank you for using our service");
		AdminLogin obj=new AdminLogin();
		obj.features();}
		}
		catch(Exception ie)
		{
			System.out.println(ie.getStackTrace());
		}
		}
		void withdrawl() {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Please enter amount to withdraw: ");
		//int amt=sc.nextInt();
		//int amt= functions.getInputNum();
		String input= functions.getInput("Please enter amount to withdraw: ");
		int amt=Integer.parseInt(input);
		balance= balance-amt;
		System.out.println("your account balance is  "+balance);

		previousBalance=balance+amt;
		System.out.println("your previous account balance was  "+previousBalance);
		System.out.println("Do you want to try again(Y/N) ");
		//char opt=sc.next().charAt(0);
		char opt=functions.getSingleCh();
		if (opt=='Y') {
			AdminLogin obj=new AdminLogin();
			obj.features();
			
		}else {
			System.out.println("Thank you for using our service");
			AdminLogin obj=new AdminLogin();
			obj.features();}
	}
		void transactionSummary() {
	System.out.println("No summary present, Thank you for using our service");
	return ;
		
		
	}

	

}
