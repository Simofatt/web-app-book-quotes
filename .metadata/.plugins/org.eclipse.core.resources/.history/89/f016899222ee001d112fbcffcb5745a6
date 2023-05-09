<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <style>   <%@include file="/WEB-INF/ressources/css/registration.css"%> </style>
    
</head>

<body>
 <% 
    Boolean auth = (Boolean) request.getAttribute("auth") ;
    String error =  (String)request.getParameter("error") ; 
	  
    if (auth != null && auth.booleanValue()) {
	  if(auth) {
		  response.sendRedirect("sharedQuotes");
    }
    } 

if (error != null) {
	 %>
     <p> MOT DE PASSE OU EMAIL INCORRECT </p>
    <% 
}
  %>

<body>
    <nav class="navbar navbar-expand-lg" style="padding: 10px;">
        <a class="navbar-brand" href="#" style="margin-right: 50px;">Brand</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav" style="margin-left: auto;">
                <li class="nav-item" style="margin-right: 20px;">
                    <a class="nav-link" href="#home" style="color: black; font-family: Arial, sans-serif;">Home</a>
                </li>
                <li class="nav-item" style="margin-right: 20px;">
                    <a class="nav-link" href="registration" style="color: black; font-family: Arial, sans-serif;">Sign in</a>
                </li>
                <li class="nav-item" style="margin-right: 20px;">
                    <a class="nav-link" href="registration" style="color: black; font-family: Arial, sans-serif;">Sign up</a>
                </li>
                <li class="nav-item" style="margin-right: 20px;">
                    <a class="nav-link" href="#about_us" style="color: black; font-family: Arial, sans-serif;">About us</a>
                </li>
                <li class="nav-item dropdown" style="margin-right: 20px;">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: black; font-family: Arial, sans-serif;">
                        Pages
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="addQuote" style="font-family: Arial, sans-serif;">Add quotes</a>
                        <a class="dropdown-item" href="sharedQuotes" style="font-family: Arial, sans-serif;">See quotes</a>
                    </div>
                </li>
            </ul>
        </div>
    </nav>


		
    <div class="container" id="container">
        <div class="form-container sign-up-container" id ="SignIn">
            <form action="registration" method="post">
                <h1>Create Account</h1>

                <span>use your email for registration</span>
                <br><br><br>
                <input type="text" placeholder="Full name" name="full_name" required />
                <input type="email" placeholder="Email" name="email" required />
                 <input type="text" placeholder="City/Region" name="city" required />
               
                <input type="password" placeholder="Password"  name="password" required/>
                <input type="password" placeholder="Re-Password"  name="passwordc" required/>
<br><br><br>
                <button type="submit">Sign Up</button>
            </form>
        </div>
        
        <div class="form-container sign-in-container" id="Login">
             <form method="post" action="auth">
                <h1>Sign in</h1>

                <span> use your account</span>
                 <br>
                
                <div>
                <input type="email" placeholder="Email" name ="email" />
                <input type="password" placeholder="Password" name="password" />
                 </div>
                
            
                <br> <br>
              
                <button type="submit">Sign In</button>
                
            </form>
        </div>
        <div class="overlay-container">
            <div class="overlay">
                <div class="overlay-panel overlay-left">
                    <h1>Welcome Back!</h1>
                    <p>To keep connected with us please login with your personal info</p>
                    <button class="ghost" id="signIn">Sign In</button>
                </div>
                <div class="overlay-panel overlay-right">
                    <h1>Hello, Friend!</h1>
                    <p>Enter your personal details and start journey with us</p>
                    <button class="ghost" id="signUp">Sign Up</button>
                </div>
            </div>
        </div>
    </div>


</body>



<script>const signUpButton = document.getElementById('signUp');
    const signInButton = document.getElementById('signIn');
    const container = document.getElementById('container');

    signUpButton.addEventListener('click', () => {
        container.classList.add("right-panel-active");
    });

    signInButton.addEventListener('click', () => {
        container.classList.remove("right-panel-active");
    });</script>

</html>