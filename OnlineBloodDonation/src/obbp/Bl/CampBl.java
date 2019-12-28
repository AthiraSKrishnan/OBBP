package obbp.Bl;

import obbp.Dl.*;
import obbp.Dto.*;


public class CampBl {
	
	

	public static int campReg(CampDto camp)
	{
		int output=0;
		
		try
		{
			
			output = CampDl.campReg(camp);
			  
			
		} catch (Exception e) {
			System.out.println("***Error:CampBl.:"+e.getMessage());
			// TODO: handle exception
		}
		return output;
}
	public static int updateBlood(Campbloodquantity blood)
	{
		
int output=0;
		
		try
		{
			
			output = CampDl.updateBlood(blood);
			  
			
		} catch (Exception e) {
			System.out.println("***Error:CampBl.:"+e.getMessage());
			// TODO: handle exception
		}
		return output;
		
	}
	public static CampDto approvecamp(String campid)
	{
		CampDto campdto=null;
		try
		{
			campdto=CampDl.approvecamp(campid);
		}
		catch(Exception e)
		{
			System.out.println("**error** campBL:retrive approved user details"+e.getMessage());
		}
		return campdto;
	}
	public static int updatestatus(CampDto camp)
	{
		int result=0;
		
		try
		{
			result =CampDl.updatestatus(camp);
			
		}catch(Exception e)
		{
			System.out.println("**error** campbl:error occured to chage status"+e.getMessage());
		}
		return result;
	}
	
	
	}
	
