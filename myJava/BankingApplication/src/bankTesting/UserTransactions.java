package bankTesting;

//import java.io.IOException;
import java.util.Scanner;
import java.util.Date;
public class UserTransactions extends MainLoginPage {
	static int balance;
	static int depAmt,widAmt;
	int previousBalance;
	String depDate,widDate;
	CommonFunctions functions=new CommonFunctions();
	
	
//	public static int getBalance() {
//		return balance;
//	}
//	public static void setBalance( int balance) {
//		UserTransactions.balance = balance;
//	}
	public int getPreviousBalance() {
		return previousBalance;
	}
	public void setPreviousBalance(int previousBalance) {
		this.previousBalance = previousBalance;
	}
	void deposit() {
		try 
		{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Please enter amount to deposit: ");
		//int amt=sc.nextInt();
		//int amt= functions.getInputNum();
		String input= functions.getInput("Please enter amount to deposit: ");
		int amt=Integer.parseInt(input);
		depAmt=amt;
		balance= balance+amt;
		System.out.println("your account balance is  "+balance);
		Date obj1=new Date();
		depDate= obj1.toString();
		int prevBalance=balance-amt;
		System.out.println("your previous account balance was  "+prevBalance);
		//setBalance(prevBalance);
		System.out.println("Do you want to try again (Y/N) ");
		
		char opt=functions.getSingleCh();
		if (opt=='Y') {
			UserLogin obj=new UserLogin();
			obj.features();
			
		}else {
		System.out.println("Thank you for using our service");
		UserLogin obj=new UserLogin();
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
		widAmt=amt;
		Date obj1=new Date();
		widDate= obj1.toString();
		balance= balance-amt;
		System.out.println("your account balance is  "+balance);

		int prevBalance=balance+amt;
		System.out.println("your previous account balance was  "+prevBalance);
		System.out.println("Do you want to try again(Y/N) ");
		//char opt=sc.next().charAt(0);
		char opt=functions.getSingleCh();
		if (opt=='Y') {
			UserLogin obj=new UserLogin();
			obj.features();
			
		}else {
			System.out.println("Thank you for using our service");
			UserLogin obj=new UserLogin();
			obj.features();
			}
	}
		void transactionSummary() {
			
			System.out.println("withdrawl done today");
			System.out.println("Date: "+widDate+ "/n amount: "+widAmt );
			System.out.println("deposit done today");
			System.out.println("Date: "+depDate+ "/n amount: "+depAmt );

			
			
			
	System.out.println("No summary present, Thank you for using our service");
	}
		void logout() {
			System.out.println("Successfully Logged out, Thank you for using our service");
			}
}
