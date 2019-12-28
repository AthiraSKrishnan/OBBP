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
int result=0;
String username,password,type;
//int status=0;

username=(String)session.getAttribute("donor_id");
password=request.getParameter("pass");
type=request.getParameter("type");


DloginDto logindto=new DloginDto();
logindto.setUsername(username);
logindto.setPassword(password);
logindto.setType(type);
 result=DLoginBl.donorLogin(logindto);
 if(result>0)
 {
	 session.setAttribute("message", "Profile created successfully");
	 response.sendRedirect("../HomeDonor/homeDonor.jsp");
 }
 else
 {
	 session.setAttribute("message", "Retry Again");
 }

%>
</body>
</html>