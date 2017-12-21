package testPackage;
import java.sql.*;

public class JdbcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Connection conn=DriverManager.getConnection("");
		try {
				//("jdbc:mysql://localhost:{port}/{db-name}", "{db-user}", "{password}")
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?useSSL=false", "root", "159Diagonal");
				Statement stmt=conn.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from books");  
				while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
				conn.close();
	}
		catch(SQLException ex) {
			
			ex.getStackTrace();
		}
				
				
	}

}
