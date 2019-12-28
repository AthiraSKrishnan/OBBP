<%@page import="obbp.Bl.DLoginBl"%>
<%@page import="obbp.Dto.DloginDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login V3</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
</head>
<body>
	
	<%
	if(session.getAttribute("message")!=null)
	{
		%>
		<font color="red"><%out.println((String)session.getAttribute("message")); %></font>
		<% session.removeAttribute("message"); 
		
	}
	%>
	
	
	<div class="limiter">
		<div class="container-login100" style="background-image: url('images/bg-01.jpg');">
			<div class="wrap-login100">
				<form class="login100-form validate-form">
				<%! 
String message=""; 
  String username;
		  DloginDto login1=null;
		  DloginDto login2=null;
  String password;
  %>               
   <%
                   if(request.getParameter("login")!=null)
                   {
                	   
                	  username=request.getParameter("username") ;
                	  password=request.getParameter("pass");
                	  login1=new DloginDto();
                	  login1.setUsername(username);
                	  login1.setPassword(password);
                	  login2=DLoginBl.validateLogin(login1);
                	  //System.out.println(login2.getType());
                	  if(login2!=null && login2.getType().equals("ADMIN"))
                	  {
                		  session.setAttribute("username",login2.getUsername());
                		  session.setAttribute("password",login2.getPassword());
                		  response.sendRedirect("../Admin/adminshowdetails.jsp");
                	  }
                	  else if(login2!=null && !login2.getType().equals("DONOR"))
                	  {
                		 
                		  String username=login2.getUsername();
                		  session.setAttribute("username",username);
                		  session.setAttribute("password",password);
                		  response.sendRedirect("../DonorLogin/DonorProfile.jsp"); 
                	  }
                	  else
                	  {
                		 
                		  String username=login2.getUsername();
                		  session.setAttribute("username",username);
                		  session.setAttribute("password",password);
                		  response.sendRedirect("../Camp/bloodquantity.jsp"); 
                	  }
                   }
                	  else
                	  {
                		  message="wrong userID or password";
                	
                	  
                   }
   
   %>
   			      <%= message %>	
				
				
				
				
					<span class="login100-form-logo">
						<i class="zmdi zmdi-landscape"></i>
					</span>

					<span class="login100-form-title p-b-34 p-t-27">
						Log in
					</span>

					<div class="wrap-input100 validate-input" data-validate = "Enter username">
						<input class="input100" type="text" name="username" placeholder="Username">
						<span class="focus-input100" data-placeholder="&#xf207;"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Enter password">
						<input class="input100" type="password" name="pass" placeholder="Password">
						<span class="focus-input100" data-placeholder="&#xf191;"></span>
					</div>

					<div class="contact100-form-checkbox">
						<input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
						<label class="label-checkbox100" for="ckb1">
							Remember me
						</label>
					</div>

					<div class="container-login100-form-btn">
						<button class="login100-form-btn" name="login">
							Login
						</button>
					</div>
					<div class="text-center p-t-90">
						<a class="txt1" href="../DonorRegistration/DonorReg.jsp">
							Not Register? For Users Register Here
						</a><br>
						<a class="txt1" href="../Camp/CampLog.jsp">
							Not Register? For camp Register Here
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>
	

	<div id="dropDownSelect1"></div>
	
<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body></html>