package obbp.Bl;

import obbp.Dl.*;
import obbp.Dto.*;

public class SearchBl 
{
	public static int confirmInsert(BloodConfirmDto blood)
	{
		int output=0;
		
		try
		{
		
			output = BSearchDl.confirmInsert(blood);
			  
			
		} catch (Exception e) {
			System.out.println("***Error:CONFIRMBl:"+e.getMessage());
			// TODO: handle exception
		}
		return output;
		
}
	public static int searchblood(String blood)
	{
		int output=0;
		try
		{
			output=BSearchDl.searchblood(blood);
		}
		catch(Exception e)
		{
			System.out.println("***Error:SEARCHBl:"+e.getMessage());
		}
		return output;
	}
	
}
