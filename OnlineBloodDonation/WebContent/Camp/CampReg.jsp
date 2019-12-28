<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="obbp.Dto.*,obbp.Bl.*"%>
<%
int result=0;
String Regid,Campname,Location,email;

Regid=request.getParameter("reg_id");
Campname=request.getParameter("name");
Location=request.getParameter("Location");
email=request.getParameter("email");



CampDto camplogin=new CampDto();
camplogin.setCampname(Campname);
camplogin.setLocation(Location);
camplogin.setRegid(Regid);
camplogin.setEmail(email);
camplogin.setStatus(0);

 result=CampBl.campReg(camplogin);
 session.setAttribute("Regid",Regid);
 if(result>0)
 {
	 session.setAttribute("message", "Profile created successfully");
	 response.sendRedirect("camppass.jsp");
 }
 else
 {
	 session.setAttribute("message", "Retry Again");
 }

%>
</body>
</html>