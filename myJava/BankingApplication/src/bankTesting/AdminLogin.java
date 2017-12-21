package bankTesting;

public class AdminLogin {
	String userName,password;
	CommonFunctions functions=new CommonFunctions();
	void login() {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Please enter username: ");
		//userName=functions.getInputString();
		userName=functions.getInput("Please enter username: ");
		//Scanner input = new Scanner(System.in);
		//System.out.println("Please enter password: ");
		password=functions.getInput("Please enter password: ");	
		
		System.out.println("welcome "+userName+" to bank ");
		features();
	}
		void features() {
		System.out.println("what do you want now? Please select any option(A/B/C)");
		System.out.println("");
		System.out.println("A.deposit money");
		System.out.println("B.Withdraw money");
		System.out.println("C.transaction Summary ");
		System.out.println("D. Logout ");
		System.out.println("");
		//Scanner ch = new Scanner(System.in);
		char option= functions.getSingleCh();
		MainLoginPage obj=new AdminTransactions();

		switch(option) {
		
		case 'A':
			
			obj.deposit();
			break;
			
		case 'B':
			obj.withdrawl();
			break;
			
		case 'C':
			obj.transactionSummary();
			break;	
		case 'D':
			System.out.println("Successfully Logged out, Thank you for using our service");
			break;
		
		default:
			System.out.println("Please select valid option ");
			features();
		}
		}
		


}
