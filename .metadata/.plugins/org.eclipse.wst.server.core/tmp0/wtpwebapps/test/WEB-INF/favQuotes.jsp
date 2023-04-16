<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Book Quotes</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
       <style>   <%@include file="/WEB-INF/ressources/css/addQuote.css"%> </style>
</head>

<body>
  <%@include file="navBar.jsp"%>
    <div class="container my-4">
        <h5 style="margin-left: 50px;">Favorite Quotes</h5>
        <div class="card mb-4">
            <div class="row no-gutters">
                <div class="col-md-4">
                    <img src="https://images.pexels.com/photos/156917/pexels-photo-156917.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
                        class="card-img" alt="The Hobbit">
                </div>
                <div class="col-md-8">
                    <div class="card-body">

                        <h5 class="card-title">The Hobbit</h5>
                        <p class="card-text">"In a hole in the ground there lived a hobbit."</p>
                        <p class="card-text"><small class="text-muted">Published: 1937</small></p>
                        <p class="card-text"><small class="text-muted">Author : Cooleen Hover</small></p>
                        <p class="card-text"><small class="text-muted">Added By: <a href="#">Sarah Jones</a></small></p>

                    </div>
                </div>
            </div>
        </div>

        <div class="card mb-4">
            <div class="row no-gutters">
                <div class="col-md-4">
                    <img src="https://images.pexels.com/photos/355948/pexels-photo-355948.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
                        class="card-img" alt="To Kill a Mockingbird">
                </div>
                <div class="col-md-8">
                    <div class="card-body">
                        <h5 class="card-title">To Kill a Mockingbird</h5>
                        <p class="card-text">"You never really understand a person until you consider things from his
                            point of view... Until you climb inside of his skin and walk around in it."</p>
                        <p class="card-text"><small class="text-muted">Published: 1960</small></p>
                        <p class="card-text"><small class="text-muted">Added By: <a href="#">John Smith</a></small></p>

                    </div>
                </div>
            </div>
        </div>


        <div class="card mb-4">
            <div class="row no-gutters">
                <div class="col-md-4">
                    <img src="https://images.pexels.com/photos/355948/pexels-photo-355948.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
                        class="card-img" alt="To Kill a Mockingbird">
                </div>
                <div class="col-md-8">
                    <div class="card-body">
                        <h5 class="card-title">To Kill a Mockingbird</h5>
                        <p class="card-text">"You never really understand a person until you consider things from his
                            point of view... Until you climb inside of his skin and walk around in it."</p>
                        <p class="card-text"><small class="text-muted">Published: 1960</small></p>
                        <p class="card-text"><small class="text-muted">Added By: <a href="#">John Smith</a></small></p>

                    </div>
                </div>
            </div>
        </div>



        <div class="card mb-4">
            <div class="row no-gutters">
                <div class="col-md-4">
                    <img src="https://images.pexels.com/photos/355948/pexels-photo-355948.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940"
                        class="card-img" alt="To Kill a Mockingbird">
                </div>
                <div class="col-md-8">
                    <div class="card-body">
                        <h5 class="card-title">To Kill a Mockingbird</h5>
                        <p class="card-text">"You never really understand a person until you consider things from his
                            point of view... Until you climb inside of his skin and walk around in it."</p>
                        <p class="card-text"><small class="text-muted">Published: 1960</small></p>
                        <p class="card-text"><small class="text-muted">Added By: <a href="#">John Smith</a></small></p>

                    </div>
                </div>
            </div>
        </div>

    </div>

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