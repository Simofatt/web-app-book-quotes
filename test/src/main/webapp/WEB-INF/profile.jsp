<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="comm.octest.beans.Quote"%>
<%@ page import="comm.octest.beans.User"%>
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
    <style><%@include file="/WEB-INF/ressources/css/profile.css"%> </style>
</head>

<%
ArrayList<Quote> quotes = new ArrayList<>();
ArrayList<User> userInfo = new ArrayList<>();
quotes = (ArrayList<Quote>) request.getAttribute("quotes");
 userInfo = (ArrayList<User>) request.getAttribute("userInfo") ;


String email = (String) session.getAttribute("email");
%>

<body>
   <%@include file="navBar.jsp"%>
    <div class="container emp-profile">
    <%
for(User user : userInfo){
	String name = user.getName() ; 
	String country = user.getCountry() ; 
	String city = user.getCity() ;
    Timestamp created_at = user.getCreated_at() ; 

%>
        
            <div class="row">
                <div class="col-md-4">
                    <div class="profile-img">
                        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS52y5aInsxSm31CvHOFHWujqUx_wWTS9iM6s7BAm21oEN_RiGoog"
                            alt="" />
                        <div class="file btn btn-lg btn-primary">
                            Change Photo
                            <input type="file" name="file" />
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="profile-head">
                        <h5>
                            <%=name %>
                        </h5>
                        <h6>
                          Morocco, <%=country %>
                        </h6>
                        <p class="proile-rating">RANKINGS : <span>8/10</span></p>
                        <ul class="nav nav-tabs" id="myTab" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab"
                                    aria-controls="home" aria-selected="true">About</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab"
                                    aria-controls="profile" aria-selected="false">Quotes</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-2">

                    <a href="settings" class="profile-edit-btn" style="text-decoration-line: none;"> Edit
                        Profile</a>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4">
                    <div class="profile-work">
                        <p>Highlights</p>
                        <a href="" class=" text-muted small text-truncate"><i
                                class="fas fa-quote-left fa-fw text-muted"></i> 1,433 quotes</a><br>

                        <a href="" class=" text-muted small text-truncate"><i
                                class="fas fa-user-friends fa-fw text-muted"></i> 1,046 friends</a><br>

                        <a class=" text-muted small text-truncate"><i class="fas fa-heart"></i>
                            1,046 Likes</a>

                    </div>
                </div>
                <div class="col-md-8">
                    <div class="tab-content profile-tab" id="myTabContent">
                        <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                            <br> <br>
                            <div class="row">
                                <div class="col-md-6">
                                    <label>Full Name</label>
                                </div>
                                <div class="col-md-6">
                                    <p>    <%=name %></p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <label>Email</label>
                                </div>
                                <div class="col-md-6">
                                    <p>    <%=email%></p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <label>Country</label>
                                </div>
                                <div class="col-md-6">
                                    <p><%=country %></p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <label>City/Region</label>
                                </div>
                                <div class="col-md-6">
                                    <p>    <%=city %></p>
                                </div>
                            </div>
                           
                            
                        </div>
                        	<%
	}
	%>
    
                        
           <div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">
                            
                                            	<%
	for (Quote q : quotes) {

		String author_name = q.getAuthor_name();
		String quote_text = q.getQuoteText();
		String book_name = q.getName_book();
		String user_name = q.getUser_name();
		Timestamp created_at = q.getCreated_at(); // get the Timestamp object
		LocalDateTime localDateTime = created_at.toLocalDateTime(); // convert to LocalDateTime
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy"); // create a formatter
		String formattedDate = localDateTime.format(formatter); // format the LocalDateTime object
		int id_quote = q.getId_quote() ;
	%>    
            <div class="card mb-4">
			<div class="row no-gutters">
				<div class="col-md-4">
					<img
						src="https://images.pexels.com/photos/156917/pexels-photo-156917.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
						class="card-img" alt="The Hobbit">
				</div>
				<div class="col-md-8">
					<div class="card-body">
						<h5 class="card-title"><%=book_name%></h5>
						<p class="card-text">
							"<%=quote_text%>"
						</p>
						<p class="card-text">
							<small class="text-muted">Published: <%=formattedDate%></small>
						</p>
						<p class="card-text">
							<small class="text-muted">Author : <%=author_name%></small>
						</p>
						<p class="card-text">
							<small class="text-muted">Added By: <a href="#"><%=user_name%></a></small>
						</p>


					
					
				</div>
			</div>
		</div>
	
	</div>
		<%
	}
	%>
	

           
                        </div>
                    </div>
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