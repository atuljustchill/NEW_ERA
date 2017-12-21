package bankTesting;

import java.sql.*;

public class StoreIntoDB {
	
	Connection conn;
	String url="jdbc:mysql://localhost:3306/";
	String databaseName;

	// database credentials
	static final String username="root";
	static final String password="159Diagonal";
	
	Class.forName("com.mysql.jdbc.Driver");
	conn=DriverManager.getConnection(url)+databaseName,username,password;
	
	Class

}
