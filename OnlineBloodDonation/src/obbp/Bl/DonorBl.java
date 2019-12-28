package obbp.Bl;



import java.util.ArrayList;

import obbp.Dl.*;
import obbp.Dto.*;

public class DonorBl {
	
	public static int donorInsert(DonorDto donor)
	{
		int output=0;
		
		try
		{
			
			output = DonorDl.donorInsert(donor);
			  
			
		} catch (Exception e) {
			System.out.println("***Error:donorBl:"+e.getMessage());
			// TODO: handle exception
		}
		return output;
		
}
	
	public static int updatestatus(DonorDto donor)
	{
		int result=0;
		
		try
		{
			result =DonorDl.updatestatus(donor);
			
		}catch(Exception e)
		{
			System.out.println("**error** donorbl:error occured to chage status"+e.getMessage());
		}
		return result;
}
	
	
	public static DonorDto donorSelect(DonorDto donorid)
	{
		DonorDto donordto=null;
		
		try
		{
			donordto=DonorDl.donorProfile(donorid);
			
		}catch(Exception e)
		{
			System.out.println("**error** donorbl:error occured to chage status"+e.getMessage());
		}
		return donordto;
	}
	public static int updatedonor(DonorDto user)
	{
		int result=0;
		
		try
		{
			result =DonorDl.updatedonor(user);
			
		}catch(Exception e)
		{
			System.out.println("**error** Userbl:updateUser"+e.getMessage());
		}
		return result;
	}
	public static int deleteDonor(String donor_id)
	{
		int result=0;
		

	try
	{   
		result = DonorDl.deleteDonor(donor_id);
		

	}
	catch(Exception e)
	{
		
		System.out.println("**error**"+":deleteBook"+e.getMessage());
	}
	return result;
	}
	public static  ArrayList<DonorDto> getblood()
	{
		ArrayList<DonorDto> bloodDetails=null;

		

		try
		{   
			bloodDetails= (DonorDl.getblood());
			

		}
		catch(Exception e)
		{
			
			System.out.println("**error**"+":deleteBook"+e.getMessage());
		}
		return bloodDetails;
	}

public static DonorDto approvedonor(String donorid)
{
	DonorDto donordto=null;
	try
	{
		donordto=DonorDl.approvedonor(donorid);
	}
	catch(Exception e)
	{
		System.out.println("**error** donorBL:retrive approved user details"+e.getMessage());
	}
	return donordto;
}
}
