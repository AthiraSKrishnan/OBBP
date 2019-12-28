package obbp.Dl;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBhelper {
	public static Connection getConnection()
	{
		
		Connection con = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");   
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vismaya","vismaya");
		}
		catch(Exception e)
		{
			System.out.println("**Error** : DBHelper:getConnection "+e.getMessage());
		}
		
		return con;
	}
	
}
