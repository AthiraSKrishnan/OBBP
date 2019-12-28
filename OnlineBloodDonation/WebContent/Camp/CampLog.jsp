<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign Up Form by Colorlib</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

    <div class="main">

        <section class="signup">
            <!-- <img src="images/signup-bg.jpg" alt=""> -->
            <div class="container">
                <div class="signup-content">
                    <form method="POST" id="signup-form" class="signup-form" action="CampReg.jsp">
                        <h2 class="form-title">Camp Registration Form</h2>
                        <div class="form-group">
                            <input type="text" class="form-input" name="reg_id" id="reg_id" placeholder="Registration Id"/>
                        </div>
                        <div class="form-group">
                            <input type="text" class="form-input" name="name" id="camp_name" placeholder="Camp Name"/>
                        </div> 
                         <div class="form-group">
                            <input type="text" class="form-input" name="Location" id="location" placeholder="Location"/>
                        </div>
                        <div class="form-group">
                            <input type="email" class="form-input" name="email" id="email" placeholder="Email Id"/>
                        </div>
                        
                        <div class="form-group">
                            <input type="submit" name="submit" id="submit" class="form-submit" value="Register"/>
                        </div>
                    </form>
                    
                </div>
            </div>
        </section>

    </div>

    <!-- JS -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="js/main.js"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>