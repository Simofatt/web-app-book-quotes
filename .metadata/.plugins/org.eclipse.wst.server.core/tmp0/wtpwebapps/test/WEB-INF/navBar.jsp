<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="index.html">Book Quotes</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="sharedQuotes">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="myQuotes">My Quotes</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Community
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="people">People</a>
                        <a class="dropdown-item" href="discussion">Discussions</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="addQuote">Add Quotes</a>
                </li>
            </ul>
            <ul class="navbar-nav ml-auto">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="profileDropdown" role="button"
                        data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <i class="fas fa-user"></i>
                    </a>
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="profileDropdown">
                        <a class="dropdown-item" href="profile">Profile</a>
                        <a class="dropdown-item" href="">Friends</a>
                        <a class="dropdown-item" href="discussion">Discussions</a>
                        <a class="dropdown-item" href="favQuotes">Favorite Quotes</a>
                        <a class="dropdown-item" href="addQuotes">Add Quote</a>
                        <a class="dropdown-item" href="settings">Account Settings</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Sign Out</a>
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="notifDropdown" role="button" data-toggle="dropdown"
                        aria-haspopup="true" aria-expanded="false">
                        <i class="far fa-bell"></i>
                        <span class="badge badge-warning">3</span>
                    </a>
                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="notifDropdown">
                        <a class="dropdown-item" href="#">Notification 1</a>
                        <a class="dropdown-item" href="#">Notification 2</a>
                        <a class="dropdown-item" href="#">Notification 3</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">View All Notifications</a>
                    </div>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="#">
                        <i class="far fa-envelope"></i>
                        <span class="badge badge-danger">1</span>
                    </a>
                </li>

            </ul>
        </div>
    </nav>
</body>
</html>