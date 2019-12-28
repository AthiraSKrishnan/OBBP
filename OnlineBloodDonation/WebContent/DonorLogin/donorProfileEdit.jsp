<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="donorEdit.jsp">
<% Long contact_no=(Long)session.getAttribute("contact_no"); %>

Contact Number:<input type="text" name="contact_number" value='<%=contact_no%>'>
<br/>
<br/>
<%String last_blood_donation_date=(String)session.getAttribute("last_blood_donation_date"); %>

Last Blood Donated Date:<input type="text" name="last_blood_donated_date" value='<%=last_blood_donation_date%>'>
<br/>
<br/>
<% String age=(String)session.getAttribute("age"); %>

Age:<input type="text" name="age" value='<%=age%>'>
<br/>
<br/>
<% String email=(String)session.getAttribute("email"); %>

email:<input type="email" name="email" value='<%=email%>'>
<br/>
<br/>
<input type="submit" value="save">
</form>

</body>
</html>