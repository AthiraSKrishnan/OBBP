<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="obbp.Bl.*"%>
<%@page import="obbp.Dto.*"%>
<%@page import="obbp.Dl.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
String donor_id="";
int result=0;
%>
<% 
donor_id=(request.getParameter("donor_id"));
result=DonorBl.deleteDonor(donor_id);
if(result>0)
{
	session.setAttribute("message", "details delete sucessfully");
}
else
{
	session.setAttribute("message", "please try again");
}
response.sendRedirect("../home.jsp");
		%>
</body>
</html>