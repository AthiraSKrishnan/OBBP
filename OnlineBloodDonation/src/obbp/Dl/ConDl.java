package obbp.Dl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import obbp.Dl.DBhelper;
import obbp.Dto.*;

public class ConDl {
	public static int Contact_Insert (ContactDto contact)
	{
		int output=0;
		String query;
		PreparedStatement ps=null;
		Connection con;
		try
		{
			con=DBhelper.getConnection();
			query = "INSERT INTO contact_us VALUES(?,?,?,?)";
			
			ps=con.prepareStatement(query);
			ps.setString(1, contact.getC_name());
			ps.setString(2, contact.getC_email());
			ps.setLong(3,contact.getContact_num());
			ps.setString(4, contact.getC_msg());
			
			output = ps.executeUpdate();
			    ps.close();
		        con.close();
			
			
		} catch (Exception e) 
		{
			System.out.println("***Error:conDl:"+e.getMessage());
			// TODO: handle exception
		}
		return output;
		
}
	public static ArrayList<ContactDto> getContact()

	{
		ArrayList<ContactDto> contactdetails = new ArrayList<ContactDto>();
		
		ContactDto contact;
		Connection con = null;

		Statement statement = null;

		ResultSet resultSet = null;


		try

		{

			String sql = "SELECT * FROM CONTACT_US ";

			con = DBhelper.getConnection();

			statement = con.createStatement();

			resultSet = statement.executeQuery(sql);

			while (resultSet.next()) {

				contact = new ContactDto();
				
				contact.setC_name(resultSet.getString(1));
				contact.setC_email(resultSet.getString(2));
				contact.setContact_num(resultSet.getLong(3));
				contact.setC_msg(resultSet.getString(4));
				
				contactdetails.add(contact);

			}

			

		}

		catch (Exception e)

		{

			System.out.println("**Error** contactDL " + e.getMessage());

		}

		return contactdetails;
		}
}
