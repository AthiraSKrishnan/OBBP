package obbp.Dl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import obbp.Dto.*;

public class BSearchDl 
{
	public static int confirmInsert(BloodConfirmDto blood)
	{
	int output=0;
	String query;
	PreparedStatement ps=null;
	Connection con;
	try
	{
		con=DBhelper.getConnection();
		query = "INSERT INTO CONFIRM values(?,?,?,?,?,?)";
		
		ps=con.prepareStatement(query);
		
		ps.setLong(1, blood.getPhoneNumber());
		ps.setString(2, blood.getName());
		ps.setString(3, blood.getLocation());
		ps.setString(4,  blood.getAddress());
		ps.setString(5,  blood.getRequiredDate());
		ps.setString(6,  blood.getPurpose());
		
		
		output = ps.executeUpdate();
		    ps.close();
	        con.close();
		
		
	} catch (Exception e) {
		System.out.println("***Error:Bsearch:confirmDl:"+e.getMessage());
		// TODO: handle exception
	}
	return output;
	
}	
	public static int searchblood(String blood)
	{
		int output=0;
		String query;
		Statement statement = null;
		ResultSet resultSet = null;
		Connection con;
		try
		{
			System.out.println("blood="+blood);
			con=DBhelper.getConnection();
			query = "SELECT "+blood+" FROM BLOODQUANTITY"; 
			resultSet = statement.executeQuery(query);

			if (resultSet.next()) 
			{
				output=resultSet.getInt(1);
		    }
		}
		catch(Exception e)
		{
			
		}
		return output;

	}
}
