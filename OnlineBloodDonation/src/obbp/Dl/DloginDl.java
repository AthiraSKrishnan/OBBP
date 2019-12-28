package obbp.Dl;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;

import obbp.Dl.DBhelper;
import obbp.Dto.CampDto;
import obbp.Dto.DloginDto;

public class DloginDl {

	public static int donorLogin(DloginDto donorlogin)
	{
		int output=0;
		String query;
		PreparedStatement ps=null;
		Connection con;
		try
		{
			con=DBhelper.getConnection();
			query = "INSERT INTO donor_login VALUES(?,?,?,?)";
			
			ps=con.prepareStatement(query);
			ps.setString(1, donorlogin.getUsername());
			ps.setString(2, donorlogin.getPassword());
			ps.setString(3, donorlogin.getType());
			ps.setInt(4, donorlogin.getStatus());
			
			
			output = ps.executeUpdate();
			    ps.close();
		        con.close();
			
			
		} catch (Exception e)
		{
			System.out.println("***ErrorLOGINDL:INSERTION ERROR"+e.getMessage());
			// TODO: handle exception
		}
		return output;
		
	}
	
	
	public static DloginDto validateLogin(DloginDto login1)
	{
		Connection con=null;
		ResultSet resultSet=null;
		DloginDto login2=null;
		try
		{
			String sql="select * from DONOR_LOGIN where USER_NAME=? AND PASSWORD=?";
			con=DBhelper.getConnection();
			PreparedStatement ps=null;
			ps =  con.prepareStatement(sql);
			
			  ps.setString(1,login1.getUsername());
			  ps.setString(2,login1.getPassword());
			  ps.executeQuery();
			resultSet=ps.executeQuery();
			if(resultSet.next())
			{
				login2=new DloginDto();
				
				login2.setUsername(resultSet.getString("USER_NAME"));			
				login2.setPassword(resultSet.getString("PASSWORD"));
				login2.setType(resultSet.getString("TYPE"));
			
			}
			
		}catch(Exception e)
		{
			System.out.println("**error** DLoginDl:Login"+e.getMessage());
		}
		return login2;
		
	}
	
	public static int updatestatus(DloginDto log)
	{
		int result=0;
		String query;
		PreparedStatement ps=null;
		Connection con;
		try
		{
			con=DBhelper.getConnection();
			query="update  DONOR_LOGIN SET STATUS=? where USER_NAME=?";
			ps=con.prepareStatement(query);
			ps.setInt(1,log.getStatus());
			ps.setString(2,log.getUsername());
			result =ps.executeUpdate();
			
		}catch(Exception e)
		{
			System.out.println("**error** userdl:update the status of approved user"+e.getMessage());
		}
		return result;
	}
	
	
}
