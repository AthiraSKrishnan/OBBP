<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="obbp.Dl.*,obbp.Bl.*,java.util.*,obbp.Dto.*"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="author" content="colorlib.com">
    <link href="https://fonts.googleapis.com/css?family=Poppins" rel="stylesheet" />
    <link href="bloodSearch/css/main.css" rel="stylesheet" />
  </head>
  <body>
   <%
    int blood_result=SearchBl.searchblood("A_POS");
    System.out.println("result="+blood_result);%>
  
    <div class="s131">
      <form  method="post" action="search.jsp">
      
           <div class="inner-form">
         
          <div class="input-field second-wrap">
            <div class="input-select">
              <select data-trigger=""  name="blood">
                <option value="A_POS">A+</option>
                 <option value="A_NEG">A-</option>
                  <option value="B_POS">B+</option>
                   <option value="B_NEG">B-</option>
                    <option value="AB_POS">AB+</option>
                                        <option value="AB_NEG">AB-</option>
                    
                                        <option value="O_POS">O+</option>
                    
                                        <option value="O_NEG">O-</option>
                    
               
              </select>
            </div>
          </div>
          <div class="input-field third-wrap">
            <button class="btn-search" type="submit" value="submit">SEARCH</button>
          </div>
        </div>
      </form>
    </div>
    
    <form name="search_result">
    </form>
  </body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>
