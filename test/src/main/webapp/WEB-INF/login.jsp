<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>LoginAsAClient</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Kanit:wght@900&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@200&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Square+Peg&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../login.css">
</head>

<body>
    <nav>
        <a href="acceuil.html">
            <h2 class="logo">L'Y<span>DEC</span></h2>
        </a>
    </nav>

    <div class="title">
        <h2>Log in to L'Y<span>DEC</span></h2>
    </div>

	  
 <% 
 
    Boolean auth = (Boolean) request.getAttribute("auth") ;
    String error =  (String)request.getParameter("error") ; 
	  
 if (auth != null && auth.booleanValue()) {
	  if(auth) {
		  response.sendRedirect("contactsServlet");
    }
    } 

 

if (error != null) {

	 %>
     <p> MOT DE PASSE OU EMAIL INCORRECT </p>
    <% 
}
  %>
  
  
  
    <div class="container">
        <form method="post" action="login">
          
            <div class="txt-field">
                <input type="email" name="email" class="txt-css" required>
                <label>Email</label>
            </div>

            <div class="txt-field">
                <input type="password" name="password" class="txt-css" required>
                <label>Password</label>
            </div>
            <div>
                <label><input id="checkbox" type="checkbox" name="connect">Auto login </label>
            </div>

            <div>
                <input class="login-btn" type="submit" value="login">
            </div>

            <div class="P1">
                <p>Don't you have an account? <a href="login" class="sign-in"> Sign in </a> </p>
            </div>

        </form>
    </div>

</body>

</html>