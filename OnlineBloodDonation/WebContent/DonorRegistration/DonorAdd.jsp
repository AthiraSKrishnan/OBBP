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
<% String donorname,donorid,location,bloodtype,lastdonateddate,email;
	int age,result1,result2;
	long contactnumber;
	
	donorname=request.getParameter("donor_name");
	donorid=request.getParameter("donor_id");
	location=request.getParameter("location");
	bloodtype=request.getParameter("blood_type");
	contactnumber=Long.parseLong(request.getParameter("contact_number"));
	lastdonateddate= request.getParameter("last_blood_donated_date");
	age = Integer.parseInt(request.getParameter("age"));
	email=request.getParameter("email");

	session.setAttribute("donor_id",donorid);

	DonorDto donor = new DonorDto();
	donor.setAge(age);
	donor.setBlood_type(bloodtype);
	donor.setContact_no(contactnumber);
	donor.setDonor_id(donorid);
	donor.setDonor_name(donorname);
	donor.setLast_blood_donate_date(lastdonateddate);
	donor.setLocation(location);
	donor.setEmail(email);
	donor.setStatus(0);
	
	result1= DonorBl.donorInsert(donor);
	response.sendRedirect("../DonorLogin/DonorLog.jsp");
	
	session.setAttribute("donor_id",donorid);
	session.setAttribute("donor_name",donorname);
	session.setAttribute("location",location);
	//session.setAttribute("blood_type",bloodtype);
	//session.setAttribute("contact_number",contactnumber);
	//session.setAttribute("last_blood_donated_date",lastdonateddate);
	//session.setAttribute("age",age);
	//session.setAttribute("email", email);
	
	//result2= DonorBl.donorInsert(donor);
	response.sendRedirect("../DonorLogin/Donorprofile.jsp");
	

%>
</body>
</html>