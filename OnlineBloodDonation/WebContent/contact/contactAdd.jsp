<%@page import="obbp.Dto.*,obbp.Bl.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String name,email,message;
	long contactNumber;
	int result;
	
	name=request.getParameter("name");
	email=request.getParameter("email");
	contactNumber=Long.parseLong(request.getParameter("phone"));
	

	message=request.getParameter("message");
	

	 ContactDto contact = new ContactDto();
	contact.setC_name(name);
	contact.setC_email(email);
	contact.setContact_num(contactNumber);
	contact.setC_msg(message);
	
	
	result= ConBl.ContactBl(contact);
	response.sendRedirect("../home.jsp");
	
%>
</body>
</html>