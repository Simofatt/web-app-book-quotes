<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="comm.octest.beans.Flyweight" %>
<%@ page import="comm.octest.beans.Message" %>
<%@ page import="comm.octest.beans.QuoteManager" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
function updateNotifications() {
	  var xhr = new XMLHttpRequest();
	  xhr.onreadystatechange = function() {
	    if (xhr.readyState == 4 && xhr.status == 200) {
	      var notifications = JSON.parse(xhr.responseText);
	      var list = document.getElementById("notifications-list");
	      list.innerHTML = "";
	      for (var i = 0; i < notifications.length; i++) {
	        var notification = notifications[i];
	        // create a new list item element and set its HTML to the notification message with the quote link
	        var listItem = document.createElement("li");
	        var link = document.createElement("a");
	        link.classList.add("dropdown-item");
	        link.setAttribute("href", "sharedQuotes?id_quote=" + notification.id_quote);
	        link.innerText = "New quote added: ";
	        listItem.appendChild(link);
	        list.appendChild(listItem);
	      }
	      
	      // display the count of notifications in the navbar
	      var countNotif = notifications.length;
	      var badge = document.getElementById("notif-badge");
	      badge.innerText = countNotif;
	    }
	  };
	  xhr.open("GET", "navBar", true);
	  xhr.send();
	}

	// Call updateNotifications() every 5 seconds
	setInterval(function() {
	  updateNotifications();
	}, 1000);

	
	//THE MESSAGE NOTIF :
	function updateMessageNotifications() {
		  var xhr = new XMLHttpRequest();
		  xhr.onreadystatechange = function() {
		    if (xhr.readyState == 4 && xhr.status == 200) {
		      var notifications = JSON.parse(xhr.responseText);
		      var list = document.getElementById("MsgNotifications-list");
		      list.innerHTML = "";
		      for (var i = 0; i < notifications.length; i++) {
		        var notification = notifications[i];
		        // create a new list item element and set its HTML to the notification message with the quote link
		        var listItem = document.createElement("li");
		        var link = document.createElement("a");
		        link.classList.add("dropdown-item");
		        link.setAttribute("href", " chat?withClientId=" + notification.from);
		        
		       
		        link.innerText =  "Message from => "+ notification.fromName + ":  " + notification.msg ;
		    
		        listItem.appendChild(link);
		        list.appendChild(listItem);
		      }
		      
		      // display the count of notifications in the navbar
		      var countNotif = notifications.length;
		      var badge = document.getElementById("msg-notif-badge");
		      badge.innerText = countNotif;
		    }
		  };
		  xhr.open("GET", "messageNotification", true);
		  xhr.send();
		}

		// Call updateNotifications() every 5 seconds
		setInterval(function() {
		  updateMessageNotifications();
		}, 1000);

</script>



	<%
int user_id = (int) session.getAttribute("user_id");
Flyweight quoteNotification = new QuoteManager();
List<Flyweight> notifications = quoteNotification.getNotification(user_id);  
int countNotif = notifications.size() ;
String emailNavBar= (String ) session.getAttribute("email") ;



%>


	<!--<nav class="navbar navbar-expand-lg navbar-dark bg-dark"> -->
	<nav class="navbar navbar-expand-lg">
		<a class="navbar-brand" href="index">Book Quotes</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link"
					href="sharedQuotes">Home</a></li>
				<li class="nav-item"><a class="nav-link" href="myQuotes">My
						Quotes</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Community </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="people">People</a> <a
							class="dropdown-item" href="discussion">Friends</a>
					</div></li>
				<li class="nav-item"><a class="nav-link" href="addQuote">Add
						Quotes</a></li>
			</ul>
			<ul class="navbar-nav ml-auto">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="profileDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <i class="fas fa-user"></i>
				</a>
					<div class="dropdown-menu dropdown-menu-right"
						aria-labelledby="profileDropdown">
						<a class="dropdown-item" href="profile">Profile</a> <a
							class="dropdown-item" href="">Friends</a> 
							 <a
							class="dropdown-item" href="favQuotes">Favorite Quotes</a> <a
							class="dropdown-item" href="settings">Account Settings</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="registration">Sign Out</a>
					</div></li>

				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="notifDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <i class="far fa-bell"></i> <span
						class="badge badge-warning" id="notif-badge"></span>
				</a>

					<div class="dropdown-menu dropdown-menu-right" aria-labelledby="notifDropdown" id="notifications-list">
						
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#">View All Notifications</a>
					</div>
					</li>



				<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle" href="#" id="notifDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> <i class="far fa-envelope"></i> <span
						class="badge badge-warning" id="msg-notif-badge" ></span>
				</a>

					<div class="dropdown-menu dropdown-menu-right" aria-labelledby="notifDropdown" id="MsgNotifications-list">
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#">View All Messages</a>
					</div>
					</li>
			</ul>
		</div>
	</nav>
</body>
</html>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
