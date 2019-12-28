<%@page import="obbp.Bl.*"%>
<%@page import="obbp.Dto.*"%>
<%@page import="obbp.Dl.*"%>


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
String location,lastdonateddate,email;
int age,result;
long contactnumber;


location=(String)session.getAttribute("location");
contactnumber=(Long)session.getAttribute("contact_no");
lastdonateddate=(String)session.getAttribute("last_blood_donation_date");
age=(Integer)session.getAttribute("age");
email=(String)session.getAttribute("email");

DonorDto profiledto=new DonorDto();



profiledto.setLocation(location);
profiledto.setContact_no(contactnumber);
profiledto.setLast_blood_donate_date(lastdonateddate);
profiledto.setAge(age);
profiledto.setEmail(email);

result=DonorBl.updatedonor(profiledto);
if(result>0)
{
	 session.setAttribute("message", "Profile data");
	 response.sendRedirect("donorprofile.jsp");
}
else
{
	 session.setAttribute("message", "Retry Again");
}
%>
</body>
</html>