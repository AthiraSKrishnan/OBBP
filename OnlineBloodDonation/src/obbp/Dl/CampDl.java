package obbp.Dl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import obbp.Dto.*;
public class CampDl {
	public static int campReg(CampDto camp)
	{
		int output=0;
		String query;
		PreparedStatement ps=null;
		Connection con;
		try
		{
			
			con=DBhelper.getConnection();
			query = "INSERT INTO camp_reg VALUES(?,?,?,?,?)";
			
			ps=con.prepareStatement(query);
			ps.setString(1,camp.getRegid());
			
			ps.setString(2,camp.getCampname());
			
			ps.setString(3,camp.getLocation());
			
			ps.setInt(4, camp.getStatus());
			ps.setString(5, camp.getEmail());
			
			
			output = ps.executeUpdate();
			    ps.close();
		        con.close();
			
			
		} catch (Exception e) {
			System.out.println("***Error:camp reg Dl"+e.getMessage());
			// TODO: handle exception
		}
		return output;
		
	}
	public static ArrayList<CampDto> getCamp()

	{
		ArrayList<CampDto> campdetails = new ArrayList<CampDto>();
		
		CampDto camp;
		Connection con = null;

		Statement statement = null;

		ResultSet resultSet = null;


		try

		{

			String sql = "SELECT * FROM camp_reg WHERE STATUS=0 ";

			con = DBhelper.getConnection();

			statement = con.createStatement();

			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				camp = new CampDto();

				camp.setRegid(resultSet.getString(1));
				camp.setCampname(resultSet.getString(2));
				camp.setLocation(resultSet.getString(3));
				camp.setStatus(resultSet.getInt(4));
				camp.setEmail(resultSet.getString(5));
				
				
				campdetails.add(camp);

			}

			

		}

		catch (Exception e)

		{

			System.out.println("**Error** campDL " + e.getMessage());

		}

		return campdetails;
		}
	
	
	
	
	
	public static int updateBlood(Campbloodquantity blood)
	{
		int result=0;
		String query;
		PreparedStatement ps=null;
		Connection con;
		try
		{
			con=DBhelper.getConnection();
			Campbloodquantity campblood= new Campbloodquantity();
			campblood=cblood();
			
			query="update BLOODQUANTITY set A_POS=?,A_NEG=?,B_POS=?,B_NEG=?,AB_POS=?,AB_NEG=?,O_POS=?,O_NEG=?";
			ps=con.prepareStatement(query);
			ps.setInt(1,blood.getApos()+campblood.getApos());
			ps.setInt(2,blood.getAneg()+campblood.getAneg());
			ps.setInt(3,blood.getBpos()+campblood.getBpos());
			ps.setInt(4,blood.getBneg()+campblood.getBneg());
			ps.setInt(5,blood.getABpos()+campblood.getABpos());
			ps.setInt(6,blood.getABneg()+campblood.getABneg());
			ps.setInt(7,blood.getOpos()+campblood.getOpos());
			ps.setInt(8,blood.getOneg()+campblood.getOneg());
			result =ps.executeUpdate();
			
		}catch(Exception e)
		{
			System.out.println("**error** campDL:updateuser"+e.getMessage());
		}
		return result;
	}
	
	
	
	public static Campbloodquantity cblood()
	{
		Connection con=null;
		Statement statement=null;
		ResultSet resultSet=null;
		Campbloodquantity curblood=null;
		try
		{
			curblood=new Campbloodquantity();
			String sql="select * FROM BLOODQUANTITY ";
			con=DBhelper.getConnection();
			statement=con.createStatement();
			resultSet=statement.executeQuery(sql);
			while(resultSet.next())
			{
				curblood=new Campbloodquantity();
				curblood.setApos(resultSet.getInt(2));
				curblood.setAneg(resultSet.getInt(3));
				curblood.setBpos(resultSet.getInt(3));
				curblood.setBneg(resultSet.getInt(4));
				curblood.setABpos(resultSet.getInt(5));
				curblood.setABneg(resultSet.getInt(6));
				curblood.setOpos(resultSet.getInt(7));
				curblood.setOneg(resultSet.getInt(8));
			}
			resultSet.close();
			statement.close();
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println("**error** campDL:getuser"+e.getMessage());
		}
		return curblood;
	}
	
	
	public static CampDto approvecamp(String campid)
	{
		ArrayList<CampDto> campdetails=null;
		Connection con=null;
		Statement statement=null;
		ResultSet resultSet=null;
		CampDto campdetail=null;
		try
		{
			campdetails=new ArrayList<CampDto>();
			String sql="select * FROM camp_reg where regid='"+campid+"'";
			con=DBhelper.getConnection();
			statement=con.createStatement();
			resultSet=statement.executeQuery(sql);
			while(resultSet.next())
			{
				campdetail=new CampDto();
				campdetail.setRegid(resultSet.getString(1));
				campdetail.setCampname(resultSet.getString(2));
				campdetail.setLocation(resultSet.getString(3));
				campdetail.setStatus(resultSet.getInt(4));
				campdetail.setEmail(resultSet.getString(5));
				
				campdetails.add(campdetail);
			}
			resultSet.close();
			statement.close();
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println("**error** campDL:getuser"+e.getMessage());
		}
		return campdetail;
	}
	
	public static int updatestatus(CampDto campdto)
	{
		int result=0;
		String query;
		PreparedStatement ps=null;
		Connection con;
		try
		{
			con=DBhelper.getConnection();
			query="update camp_reg set STATUS=? where REGID=?";
			ps=con.prepareStatement(query);
			ps.setInt(1,campdto.getStatus());
			ps.setString(2,campdto.getRegid());
			result =ps.executeUpdate();
			
		}catch(Exception e)
		{
			System.out.println("**error** campdl:update the status of approved user"+e.getMessage());
		}
		return result;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

