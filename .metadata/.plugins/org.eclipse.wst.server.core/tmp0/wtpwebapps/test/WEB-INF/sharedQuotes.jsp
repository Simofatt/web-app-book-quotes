<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="comm.octest.beans.Quote" %>
<%@ page import ="java.time.LocalDate" %> 
<%@ page import ="java.time.format.DateTimeFormatter" %>

<%@ page import="java.sql.Timestamp" %>
<%@ page import="java.time.LocalDateTime" %>



<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Book Quotes</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <style>   <%@include file="/WEB-INF/ressources/css/index.css"%> </style>
</head>

<%
ArrayList<Quote> quotes = new ArrayList<>() ;
quotes = (ArrayList<Quote>) request.getAttribute("quotes");


%>

<body>

<%@include file="navBar.jsp"%>
 <% for (Quote q : quotes ) { 
                	
                	String author_name =q.getAuthor_name() ; 
                	String quote_text =q.getQuoteText() ; 
                	String book_name = q.getName_book(); 
                	String user_name = q.getUser_name() ;
                	Timestamp created_at = q.getCreated_at(); // get the Timestamp object
                	LocalDateTime localDateTime = created_at.toLocalDateTime(); // convert to LocalDateTime
                	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy"); // create a formatter
                	String formattedDate = localDateTime.format(formatter); // format the LocalDateTime object
                

               
                	%>
                
    <div class="container my-4">
    
        <div class="card mb-4">
            <div class="row no-gutters">
                <div class="col-md-4">
               
                    <img src="https://images.pexels.com/photos/156917/pexels-photo-156917.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
                        class="card-img" alt="The Hobbit">
                </div>
                <div class="col-md-8">
                    <div class="card-body">
                        <h5 class="card-title"><%=book_name %></h5>
                        <p class="card-text">"<%=quote_text %>"</p>
                        <p class="card-text"><small class="text-muted">Published: <%=formattedDate %></small></p>
                        <p class="card-text"><small class="text-muted">Author : <%=author_name %></small></p>
                        <p class="card-text"><small class="text-muted">Added By: <a href="#"><%=user_name %></a></small></p>
                        <a href="#" class="card-link favorite"><i class="fas fa-heart"></i> Love</a>
                    </div>
                </div>
            
            </div>
             
        </div>

</div>
  <%
                }%>
      
      
      
      
      
      
      
      
      
      
      
      
      
      

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script>
        $('.favorite').on('click', function () {
            $(this).toggleClass('active');
        });
    </script>
</body>

</html>