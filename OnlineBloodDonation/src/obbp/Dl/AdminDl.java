package obbp.Dl;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;

import obbp.Dto.*;

public class AdminDl 
{
	public static ArrayList<DonorDto> getDonor()

	{
		ArrayList<DonorDto> details = new ArrayList<DonorDto>();
		
		DonorDto donorDetails;
		Connection con = null;

		Statement statement = null;

		ResultSet resultSet = null;


		try

		{

			String sql = "SELECT * FROM donor_db ";

			con = DBhelper.getConnection();

			statement = con.createStatement();

			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				donorDetails = new DonorDto();

				donorDetails.setDonor_id(resultSet.getString(1));

				donorDetails.setDonor_name(resultSet.getString(2));

				donorDetails.setBlood_type(resultSet.getString(3));
				donorDetails.setLocation(resultSet.getString(4));
				donorDetails.setContact_no(resultSet.getLong(5));
				donorDetails.setLast_blood_donate_date(resultSet.getString(6));
				donorDetails.setAge(resultSet.getInt(7));
				donorDetails.setEmail(resultSet.getString(8));
				
				
				details.add(donorDetails);

			}

			

		}

		catch (Exception e)

		{

			System.out.println("**Error** JobSeekerDL:getSeekers " + e.getMessage());

		}

		return details;
		}
	public static ArrayList<ContactDto> getContact()

	{
		ArrayList<ContactDto> details = new ArrayList<ContactDto>();
		
		ContactDto contactDetails;
		Connection con = null;

		Statement statement = null;

		ResultSet resultSet = null;


		try

		{

			String sql = "SELECT * FROM CONTACT_US";

			con = DBhelper.getConnection();

			statement = con.createStatement();

			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				contactDetails = new ContactDto();

				contactDetails.setC_name(resultSet.getString(1));
				contactDetails.setC_email(resultSet.getString(2));
				contactDetails.setContact_num(resultSet.getLong(3));
				contactDetails.setC_msg(resultSet.getString(4));
				
				
				details.add(contactDetails);

			}

			

		}

		catch (Exception e)

		{

			System.out.println("**Error** contactDL:getContact " + e.getMessage());

		}

		return details;
		}
}