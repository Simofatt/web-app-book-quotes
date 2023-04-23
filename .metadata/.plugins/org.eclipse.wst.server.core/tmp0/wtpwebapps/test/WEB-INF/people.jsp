<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="comm.octest.beans.QuoteManager"%>
<%@ page import="comm.octest.beans.Observer"%>
<%@ page import="java.time.LocalDate"%>
<%@ page import="java.time.format.DateTimeFormatter"%>
<%@ page import="java.sql.Timestamp"%>
<%@ page import="java.time.LocalDateTime"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Book Quotes</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/js/bootstrap.bundle.min.js">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js">
    <style>   <%@include file="/WEB-INF/ressources/css/people.css"%> </style>
</head>
<%

ArrayList<Observer> users = new ArrayList<>();
 users = (ArrayList<Observer>) request.getAttribute("users") ;
 int id_user_session = (Integer) session.getAttribute("user_id");

%>


<body>
   <%@include file="navBar.jsp"%>

    <div class="container">
        <br>
        <h2 class="mb-4">Most Popular People</h2>
        <br>
        <div class="card card-default" id="card_contacts">

            <div id="contacts" class="panel-collapse collapse show" aria-expanded="true" style="">
                <ul class="list-group pull-down" id="contact-list">
                    <%
for(Observer user : users){
	String name = user.getName() ; 
	String country = user.getCountry() ; 
	String city = user.getCity() ;
	String email = user.getEmail() ;
    int nbreQuotes = user.getNbreQuoteAdded()  ;
    int id_user = user.getId_user();
    boolean isFriends = user.isFriends() ;
    int nbreFriends = user.getNbreFriends() ; 
    
    if(id_user != id_user_session ){ 
    
%>
                    <li class="list-group-item">
 
                        <div class="row w-100">

                            <div class="col-12 col-sm-6 col-md-3 px-0">

                                <img src="http://demos.themes.guide/bodeo/assets/images/users/m101.jpg"
                                    alt="Mike Anamendolla" class="rounded-circle mx-auto d-block img-fluid">
                            </div>
                            <div class="col-12 col-sm-6 col-md-9 text-center text-sm-left">
                                <span class=" text-success float-right pulse" title="online now">#1</span>


                               <a style = "color: blue; cursor: pointer;" href ="profile?email=<%=email %>"><label  style = "color: blue; cursor: pointer;" class="name lead"><%=name %></label></a> 
                                <br>
                                <span class="fa fa-map-marker fa-fw text-muted" data-toggle="tooltip" title=""
                                    data-original-title="5842 Hillcrest Rd"></span>
                                <span class="text-muted"><%=country %></span>
                                <br>

                                <div class="links"><a  class=" text-muted small text-truncate"><i
                                            class="fas fa-quote-left fa-fw text-muted"></i> <%=nbreQuotes %> quotes</a>
                                </div>
                                <div class="links"><a  class=" text-muted small text-truncate"><i
                                            class="fas fa-user-friends fa-fw text-muted"></i> <%=nbreFriends %>  friends</a>
                                </div>


                                <span class="fa fa-envelope fa-fw text-muted" data-toggle="tooltip"
                                    data-original-title="" title=""></span>
                                <span class="text-muted small text-truncate"><%=email %></span>
                                <form action="people" method="post" class="mt-3 ml-auto">
                                <% if(isFriends == false) {%> 
                                    <button type="submit" class="btn btn-primary add-friend-btn"  name ="addFriend" value="<%=id_user%>">Add as a
                                        Friend</button>
                                       <% }  else { %> 
                                       <button  class="btn btn-primary send-message">Send a message</button>
                                    <%} %>
                                       
                                    
                                </form>
                            </div>
                        </div>
                    </li>
                   <%}} %>
                  
                </ul>

            </div>
        </div>
    </div>




    </div>
    <script src=" https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script>
        $('.favorite').on('click', function () {
            $(this).toggleClass('active');
        });
    </script>






</body>