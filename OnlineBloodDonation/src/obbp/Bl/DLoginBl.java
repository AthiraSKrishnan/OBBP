package obbp.Bl;

import obbp.Dl.CampDl;
import obbp.Dl.DloginDl;
import obbp.Dto.CampDto;
import obbp.Dto.DloginDto;

public class DLoginBl {
	public static int donorLogin(DloginDto donorlogin)
	{
		int output=0;
		
		try
		{
				
			output =DloginDl.donorLogin(donorlogin);
			  
			
		} catch (Exception e) {
			System.out.println("***Error lOGINBL INSERTION::"+e.getMessage());
			// TODO: handle exception
		}
		return output;
		
	}
	
	public static DloginDto validateLogin(DloginDto login1)
	{

		DloginDto login2=null;
		try
		{
		 login2=DloginDl.validateLogin(login1);
			
		}catch(Exception e)
		{
			System.out.println("**error** LoginBl:Login"+e.getMessage());
		}
		return login2;
}
	
	public static int updatestatus(DloginDto log)
	{
		int result=0;
		
		try
		{
			result =DloginDl.updatestatus(log);
			
		}catch(Exception e)
		{
			System.out.println("**error** userbl:error occured to chage status"+e.getMessage());
		}
		return result;
	}
	
	
	
}
