package obbp.Bl;


import obbp.Dl.ConDl;
import obbp.Dto.ContactDto;


public class ConBl {


		public static int ContactBl(ContactDto contact)
		{
			int output=0;
			
			try
			{
				
				
				output = ConDl.Contact_Insert(contact);
				  
				
			} catch (Exception e) {
				//System.out.println("***Error:studentDao.cs:studentInsert:"+e.getMessage());
				// TODO: handle exception
			}
			return output;
}
}
