<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Au Register Forms by Colorlib</title>

    <!-- Icons font CSS-->
    <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="css/main.css" rel="stylesheet" media="all">
    
 	<script>
   		function validate()
   	{
   			var id=document.form1.donor_id.value;
   			var name=document.form1.donor_name.value;
   	    	var bloodtype=document.form1.blood_type.value;
   	    	var locat=document.form1.location.value;
   	    	var phone=document.form1.contact_number.value;
   	    	var lastdonateddate=document.form1.last_blood_donated_date.value;
   	    	var age=document.form1.age.value;
   	    	var email=document.form1.email.value; 
   	    	
   	 		var donid=/^[d][D][0-9]{3}$/;
   	    	var letters = /^[A-Za-z\s]+$/;
   	    	var phoneno = /^\d{10}$/;
   	    	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
   	    	var btype=/^(A|B|AB|O)[-+]$/;
   	    	
   	    	var valid = true; 
   	    
   	    	
   	    	
   	    	if (id==null || id=="")
   	    	{  
   	    		document.getElementById("idid").innerHTML="Donor id Cannot Be empty";   
   	    		valid = false;
   	    	}
   	    	else if(!(id.match(donid)))
   	    		{
   	    		
   	    			document.getElementById("idid").innerHTML="Enter a valid Donorid";   
   	    			valid = false;
   	    		}
   	    	
   	    	if (name==null || name=="")
   	    	{  
	    		document.getElementById("idname").innerHTML="Name cannot be null"; 
	    		valid = false; 
	    	}
	    	else if(!(name.match(letters)))
	    		{
	    			document.getElementById("idname").innerHTML="Name cannot be number"; 
	    			valid = false;
	    		}
    	
    		if(!(phone.match(phoneno)))
			{
				document.getElementById("idcon").innerHTML="Enter a valid phone number"; 
    			valid = false;
			} 
    	
    		if(!(email.match(mailformat)))
    		{
    			document.getElementById("idemail").innerHTML="Enter valid email"; 
        		valid = false;
    		}
    		if(age==null || age =="")
     		{
     			document.getElementById("idage").innerHTML="Age cannot be null"; 
 	    		valid = false;
     		}
    		else if(age < 1 || age > 100)
    		{
    			document.getElementById("idage").innerHTML="Enter age between 1-100"; 
	    		valid = false;
    		}
    		
    		 
    		// if(locat==null || locat="")
    	    //{
 	    		//document.getElementById("idlocate").innerHTML="Location cannot be null"; 
 	    		//valid = false; 
 	    	//}
 	    	//else
 	    		if(!(locat.match(letters)))
 	    		{
 	    			document.getElementById("idlocate").innerHTML="Location cannot be a number"; 
 	   	 			valid = false;
 	   		    }  
 	    		if(!(bloodtype.match(btype)))
 		    	{
 		    		document.getElementById("idbtype").innerHTML="Enter a valid blood type"; 
 		    		valid = false;
 		    	}
    		
    		
    		
   	    
   	    	return valid;
   	}
   	    	<%-- 
   	    	
   	    	if(bloodtype==null || bloodtype="")
   	    	{
	    		document.getElementById("idbtype").innerHTML="Blood Type cannot be null"; 
	    		valid = false; 
	    	}
	    	else if(!(bloodtype.match(btype)))
	    	{
	    		document.getElementById("idname").innerHTML="Enter a valid blood type"; 
	    		valid = false;
	    	}
   	    	--%>
    </script>
    
</head>

<body>
    <div class="page-wrapper bg-gra-03 p-t-45 p-b-50">
        <div class="wrapper wrapper--w790">
            <div class="card card-5">
                <div class="card-heading">
                    <h2 class="title">Donor Registration Form</h2>
                </div>
                <div class="card-body">
                    <form name="form1" method="POST" onclick="return validate()" action="DonorAdd.jsp" >
                        <div class="form-row m-b-55">
                            <div class="form-row">
                            <div class="name">Donor Id</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="donor_id">
                                    <font color="red"><span id="idid"></span></font>
                                </div>
                            </div>
                        </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Donor Name</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="donor_name">
                                    <font color="red"><span id="idname"></span></font>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Blood Type</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="blood_type">
                                     <font color="red"><span id="idbtype" ></span></font>
                                </div>
                            </div>
                        </div>
                       <div class="form-row">
                            <div class="name">Location</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="location">
                                     <font color="red"><span id="idlocate" ></span></font>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Contact Number</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="contact_number">
                                     <font color="red"><span  id="idcon" ></span></font>
                                </div>
                            </div>
                        </div>
<div class="form-row">
                            <div class="name">Last Blood Donated Date</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="date" name="last_blood_donated_date">
                                     <font color="red"><span id="idlbdd" ></span></font>
                                </div>
                            </div>
                        </div>
<div class="form-row">
                            <div class="name">Age</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="number" name="age">
                                    
                                     <font color="red"><span id="idage" ></span></font>
                                </div>
                            </div>
                        </div>
                        <div class="name">Email</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="email" name="email">
                                     <font color="red"><span id="idemail" ></span></font>
                                </div>
                            </div>
                            <div>
                            <input type="submit" value="Register" class="btn btn--radius-2 btn--red" >
                        </div>
                    </form>
                        </div>
                        
                      
                        
                </div>
            </div>
        </div>

    <!-- Jquery JS-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="vendor/select2/select2.min.js"></script>
    <script src="vendor/datepicker/moment.min.js"></script>
    <script src="vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="js/global.js"></script>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>