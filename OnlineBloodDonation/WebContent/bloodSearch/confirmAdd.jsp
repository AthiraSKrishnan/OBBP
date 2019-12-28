<%@page import="obbp.Dl.*"%>
<%@page import="obbp.Bl.*"%>
<%@page import="obbp.Dto.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name,location,address,requiredDate,purpose;
	long phoneNumber;
	int result;
		
	phoneNumber=Long.parseLong(request.getParameter("phone"));
	name=request.getParameter("name");
	location=request.getParameter("location");
	address=request.getParameter("address");
	requiredDate=request.getParameter("requiredDate");
	purpose=request.getParameter("purpose");
	
	BloodConfirmDto blood=new BloodConfirmDto();
	blood.setPhoneNumber(phoneNumber);
	blood.setName(name);
	blood.setLocation(location);
	blood.setAddress(address);
	blood.setRequiredDate(requiredDate);
	blood.setPurpose(purpose);
	
	result= SearchBl.confirmInsert(blood);
	response.sendRedirect("../home.jsp");
	
	
	
	%>
</body>
</html>