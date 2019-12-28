package obbp.Bl;

import java.util.ArrayList;
import obbp.Dl.*;
import obbp.Dto.*;


public class AdminBl 
{
	public static ArrayList<DonorDto> getDonor()

	{

	ArrayList<DonorDto> donorDetails=null;

		try
		{
			
		
		 donorDetails = (AdminDl.getDonor());
		   
	     }
		catch(Exception e)

		{

		System.out.println("**Error** SeekerBL.getSeekers() "+e.getMessage());

		}


		return donorDetails;

}
	public static ArrayList<CampDto> getCamp()

	{

	ArrayList<CampDto> campDetails=null;

		try
		{
			
		
			campDetails= (CampDl.getCamp());
		   
	     }
		catch(Exception e)

		{

		System.out.println("**Error** campBL.getSeekers() "+e.getMessage());

		}


		return campDetails;

}
	public static ArrayList<ContactDto> getContact()

	{

	ArrayList<ContactDto> contactDetails=null;

		try
		{
			
		
			contactDetails= (ConDl.getContact());
		   
	     }
		catch(Exception e)

		{

		System.out.println("**Error** contactBL.getSeekers() "+e.getMessage());

		}


		return contactDetails;

}
}
