<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
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
    <div class="container" id="container">
        <div class="form-container sign-up-container" id ="SignIn">
            <form action="registration" method="post">
                <h1>Create Account</h1>

                <span>use your email for registration</span>
                <input type="text" placeholder="Full name" name="full_name" required />
                <input type="email" placeholder="Email" name="email" required />
               
                <input type="password" placeholder="Password"  name="password" required/>
                <input type="password" placeholder="Re-Password"  name="passwordc" required/>

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