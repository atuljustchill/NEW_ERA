package bankTesting;

public class MainPage {
	
	 void homepage() {
		System.out.println("welcome to testing bank");
	
	
	System.out.println("");
	System.out.println("Please select Login Type : ");

	System.out.println("A: Admin Login");
	System.out.println("B: Customer Login");

	CommonFunctions functions= new CommonFunctions();
	char option=functions.getSingleCh();
	
	switch(option) {
	
	case 'A':
		AdminLogin obj=new AdminLogin();
		obj.login();
		break;
	case 'B':
		UserLogin obj1=new UserLogin();
		obj1.login();
		break;
	default:
		System.out.println("Please select valid option ");
		System.out.println("================================================================= ");

		homepage();
		

	}	
	}


}
