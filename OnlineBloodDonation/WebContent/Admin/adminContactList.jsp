<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="obbp.Dl.*,obbp.Bl.*,java.util.*,obbp.Dto.*"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<head>
	<title>Table V05</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="table template/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="table template/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="table template/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="table template/vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="table template/vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="table template/vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="table template/css/util.css">
	<link rel="stylesheet" type="text/css" href="table template/css/main.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-table100">
		 <div class="wrap-table100">	
				<div class="table100 ver1">
					<div class="table100-firstcol">
						<table>
							<%--<thead>
								
							</thead> --%>
							<tbody>
								<tr class="row100 body">
									<td class="cell100 column1"> </td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1"> </td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1"> </td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1"> </td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1"> </td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1"> </td>
								</tr>

								<tr class="row100 body">
									<td class="cell100 column1"> </td>
								</tr>
								<tr class="row100 body">
									<td class="cell100 column1"> </td>
								</tr>
								<tr class="row100 body">
									<td class="cell100 column1"> </td>
								</tr>
							</tbody>
						</table>
					</div>
					
				<div class="wrap-table100-nextcdols js-pscroll">	
						<div class="table100-nextcols">
							<table border="2px">
								<thead>
								<tr class="row100 head">
										<th class="cell100 column2">Name</th>
										<th class="cell100 column2">Email</th>
										<th class="cell100 column2">ContactNumber</th>
										<th class="cell100 column3">Message</th>
										
										
										
										
			
									</tr>
								</thead>
				 <%

				 ArrayList<ContactDto> details =AdminBl.getContact();

if(details!=null && (details.size()>0))

  {
	
	 for(ContactDto contactinf: details )

	  {

	    %>

				
								 <tbody>
									<tr class="row100 body">
									
										<td class="cell100 column2"><%=contactinf.getC_name() %></td>
										<td class="cell100 column3"><%=contactinf.getC_email()%></td>
										<td class="cell100 column4"> <%=contactinf.getContact_num() %> </td>
										<td class="cell100 column5"><%=contactinf.getC_msg()%></td>
											
										
										
										
									</tr>

		<%
		} 
  }
		%>						
								</tbody> 
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


<!--===============================================================================================-->	
	<script src="table template/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="table template/vendor/bootstrap/js/popper.js"></script>
	<script src="table template/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="table template/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="table template/vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
	<script>
		$('.js-pscroll').each(function(){
			var ps = new PerfectScrollbar(this);

			$(window).on('resize', function(){
				ps.update();
			})

			$(this).on('ps-x-reach-start', function(){
				$(this).parent().find('.table100-firstcol').removeClass('shadow-table100-firstcol');
			});

			$(this).on('ps-scroll-x', function(){
				$(this).parent().find('.table100-firstcol').addClass('shadow-table100-firstcol');
			});

		});

		
		
		
	</script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>