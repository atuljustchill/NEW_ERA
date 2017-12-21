package bankTesting;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CommonFunctions {
	String name;
	int number;
	char ch;
	public int getInputNum() {
		Scanner scan= new Scanner(System.in);
		number= scan.nextInt();
		scan.close();
		return number;
	}
	
	public String getInputString() {
		Scanner scan= new Scanner(System.in);
//		String str= scan.next();
		name=scan.next();
		scan.close();
		return name;
		
	}
	public char getSingleCh() {
		Scanner scan= new Scanner(System.in);
		ch= scan.next().charAt(0);
		ch=Character.toUpperCase(ch);
		//scan.close();
		return ch;
	}
	public String getInput(String prompt) {
		InputStreamReader r=new InputStreamReader(System.in);	
		BufferedReader br=new BufferedReader(r);
	
	System.out.print(prompt);
	System.out.flush();
	try {
		return br.readLine();
	}
	catch(Exception e) {
		return "error"+e.getMessage();
		
	}
}
}
