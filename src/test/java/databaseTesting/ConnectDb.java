package databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDb {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String host="localhost";
		String port="3306";
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/QADB", "root", "Metkarak@543");
	    Statement s=conn.createStatement();
	    ResultSet rs=s.executeQuery("select * from Employee where id=1");
	   while(rs.next()) {
	    
	    System.out.println(rs.getString("name"));
	    System.out.println(rs.getString("address"));

	}
	}
}
