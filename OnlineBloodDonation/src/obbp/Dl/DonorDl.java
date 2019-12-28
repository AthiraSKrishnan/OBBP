package obbp.Dl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import obbp.Dto.*;


public class DonorDl {
	public static int donorInsert(DonorDto donor)
	{
		int output=0;
		String query;
		PreparedStatement ps=null;
		Connection con;
		try
		{
			con=DBhelper.getConnection();
			query = "INSERT INTO donor_db VALUES(?,?,?,?,?,?,?,?)";
			
			ps=con.prepareStatement(query);
			ps.setString(1, donor.getDonor_id());
			ps.setString(2, donor.getDonor_name());
			ps.setString(3,  donor.getBlood_type());
			ps.setString(4,  donor.getLocation());
			ps.setLong(5,  donor.getContact_no());
			ps.setString(6,  donor.getLast_blood_donate_date());
			ps.setInt(7,  donor.getAge());
			ps.setString(8,  donor.getEmail());
			//ps.setInt(9, donor.getStatus());
			
			
			output = ps.executeUpdate();
			    ps.close();
		        con.close();
			
			
		} catch (Exception e) {
			System.out.println("***Error:donorinsertDl"+e.getMessage());
			// TODO: handle exception
		}
		return output;
		
	}
	public static DonorDto approvedonor(String donorid)
	{
		ArrayList<DonorDto> donordetails=null;
		Connection con=null;
		Statement statement=null;
		ResultSet resultSet=null;
		DonorDto donordetail=null;
		try
		{
			donordetails=new ArrayList<DonorDto>();
			String sql="select * FROM DONOR_DB where donorid='"+donorid+"'";
			con=DBhelper.getConnection();
			statement=con.createStatement();
			resultSet=statement.executeQuery(sql);
			while(resultSet.next())
			{
				donordetail=new DonorDto();
				donordetail.setDonor_id(resultSet.getString(1));
				donordetail.setDonor_name(resultSet.getString(2));
				donordetail.setBlood_type(resultSet.getString(3));
				donordetail.setLocation(resultSet.getString(4));
				donordetail.setContact_no(resultSet.getInt(5));
				donordetail.setLast_blood_donate_date(resultSet.getString(6));
				donordetail.setAge(resultSet.getInt(7));
				donordetail.setEmail(resultSet.getString(8));
				donordetail.setStatus(resultSet.getInt(9));
				
				donordetails.add(donordetail);
			}
			resultSet.close();
			statement.close();
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println("**error** donorDL:getuser"+e.getMessage());
		}
		return donordetail;
	}
	public static int updatestatus(DonorDto donordto)
	{
		int result=0;
		String query;
		PreparedStatement ps=null;
		Connection con;
		try
		{
			con=DBhelper.getConnection();
			query="update DONOR_DB set STATUS=? where DONORID=?";
			ps=con.prepareStatement(query);
			ps.setInt(1,donordto.getStatus());
			ps.setString(2,donordto.getDonor_id());
			result =ps.executeUpdate();
			
		}catch(Exception e)
		{
			System.out.println("**error** donordl:update the status of approved user"+e.getMessage());
		}
		return result;
	}
	public static int editdonor(DonorDto donordto)
	{
		int result=0;
		String query;
		PreparedStatement ps=null;
		Connection con;
		try
		{
			con=DBhelper.getConnection();
			query="update DONOR_DB set LOCATION=? CONTACTNUMBER=? LASTBLOODDONATEDATE=? EMAIL=?where DONORID=?";
			ps=con.prepareStatement(query);
			ps.setString(1,donordto.getLocation());
			ps.setLong(2,donordto.getContact_no());
			ps.setString(3,donordto.getLast_blood_donate_date());
			ps.setString(4,donordto.getEmail());
			result =ps.executeUpdate();
			
		}catch(Exception e)
		{
			System.out.println("**error** donordl:update the details of approved donor"+e.getMessage());
		}
		return result;
	}
	public static DonorDto donorProfile(DonorDto donorid)
	{
		ArrayList<DonorDto> donordetails=null;
		Connection con=null;
		Statement statement=null;
		ResultSet resultSet=null;
		DonorDto donordetail=null;
		try
		{
			donordetails=new ArrayList<DonorDto>();
			String sql="select * FROM DONOR_DB where donorid='"+donorid+"'";
			con=DBhelper.getConnection();
			statement=con.createStatement();
			resultSet=statement.executeQuery(sql);
			while(resultSet.next())
			{
				donordetail=new DonorDto();
				donordetail.setDonor_id(resultSet.getString(1));
				donordetail.setDonor_name(resultSet.getString(2));
				donordetail.setBlood_type(resultSet.getString(3));
				donordetail.setLocation(resultSet.getString(4));
				donordetail.setContact_no(resultSet.getInt(5));
				donordetail.setLast_blood_donate_date(resultSet.getString(6));
				donordetail.setAge(resultSet.getInt(7));
				donordetail.setEmail(resultSet.getString(8));
				
				
				donordetails.add(donordetail);
			}
			resultSet.close();
			statement.close();
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println("**error** donorDL:getuser"+e.getMessage());
		}
		return donordetail;
	}

	public static int updatedonor(DonorDto donor)
	{
		int result=0;
		String query;
		PreparedStatement ps=null;
		Connection con;
		try
		{
			con=DBhelper.getConnection();
			query="update donor_db set blood_type=?,location=?,contact_no=?,Last_blood_donation_date=?,age=?,email=? where donor_id=?";
			ps=con.prepareStatement(query);
			ps.setString(1,donor.getBlood_type());
			ps.setString(2,donor.getLocation());
			ps.setLong(3, donor.getContact_no());
			ps.setString(4, donor.getLast_blood_donate_date());
			ps.setInt(5,donor.getAge());
			ps.setString(6, donor.getEmail());
			ps.setString(7,donor.getDonor_id());
			result =ps.executeUpdate();
			
		}catch(Exception e)
		{
			System.out.println("**error** donorDL"+e.getMessage());
		}
		return result;
	}
	public static int deleteDonor(String donor_id)
	{
		int result=0;
		String query;
		PreparedStatement ps=null;
		Connection con;
		
		
		try
		{ 
			con=DBhelper.getConnection();    
			query = "DELETE FROM donor_db WHERE donor_id=?";
			ps=con.prepareStatement(query);
			ps.setString(1,donor_id);
			result= ps.executeUpdate();
			ps.close();
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println("**ERROR** donorDL:"+e.getMessage());
		}
		return result;
}
	public static ArrayList<DonorDto> getblood()

	{
		ArrayList<DonorDto> blooddetails = new ArrayList<DonorDto>();
		
		DonorDto blood;
		Connection con = null;

		Statement statement = null;

		ResultSet resultSet = null;


		try

		{

			String sql = "SELECT * FROM donor_db where blood_type=? ";

			con = DBhelper.getConnection();

			statement = con.createStatement();

			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				blood = new DonorDto();
			
				blood.setBlood_type(resultSet.getString(1));
				
				blooddetails.add(blood);

			}

			

		}

		catch (Exception e)

		{

			System.out.println("**Error** bloodDL " + e.getMessage());

		}

		return blooddetails;
		}
	public static ArrayList<DonorDto> getdonor()

	{
		ArrayList<DonorDto> donordetails = new ArrayList<DonorDto>();
		
		DonorDto donor;
		Connection con = null;

		Statement statement = null;

		ResultSet resultSet = null;


		try

		{

			String sql = "SELECT * FROM donor_id WHERE STATUS=0 ";

			con = DBhelper.getConnection();

			statement = con.createStatement();

			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				donor = new DonorDto();

				donor.setDonor_id(resultSet.getString(1));
				donor.setDonor_name(resultSet.getString(2));
				donor.setBlood_type(resultSet.getString(3));
				donor.setLocation(resultSet.getString(4));
				donor.setContact_no(resultSet.getInt(5));
				donor.setLast_blood_donate_date(resultSet.getString(6));
				donor.setAge(resultSet.getInt(7));
				donor.setEmail(resultSet.getString(8));
				donor.setStatus(resultSet.getInt(9));
				
				donordetails.add(donor);

			}

			

		}

		catch (Exception e)

		{

			System.out.println("**Error** campDL " + e.getMessage());

		}

		return donordetails;
		}
}