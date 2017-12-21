package testPackage;
// linked list examples
import java.util.*;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> boys= new LinkedList<String>();
		boys.add("atul");
		boys.add("amol");
		boys.add("atish");
		boys.add("ajay");
		boys.add("aman");
		
	Iterator<String> list=boys.iterator();
	
	while(list.hasNext()) {
		
		System.out.println(list.next());
		
	}
	
//	list.	
	}
	

}
