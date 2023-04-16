<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Book Quotes</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <style><%@include file="/WEB-INF/ressources/css/profile.css"%> </style>
</head>


<body>
   <%@include file="navBar.jsp"%>
    <div class="container emp-profile">
        <form method="post">
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
                            Kshiti Ghelani
                        </h5>
                        <h6>
                            Morroco,Casablanca
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
                                    <p>Kshiti Ghelani</p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <label>Email</label>
                                </div>
                                <div class="col-md-6">
                                    <p>kshitighelani@gmail.com</p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <label>Country</label>
                                </div>
                                <div class="col-md-6">
                                    <p>Morocco</p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <label>City/Region</label>
                                </div>
                                <div class="col-md-6">
                                    <p>Casablanca</p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <label>Address Line 1</label>
                                </div>
                                <div class="col-md-6">
                                    <p>48 Rue mustapha elmanfalouti</p>
                                </div>
                            </div>
                        </div>
                        <div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">
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
                                            <p class="card-text"><small class="text-muted">Author : Cooleen
                                                    Hover</small></p>
                                            <p class="card-text"><small class="text-muted">Added By: <a href="#">Sarah
                                                        Jones</a></small></p>
                                            <a href="#" class="card-link favorite"><i class="fas fa-heart"></i> Love</a>
                                        </div>
                                    </div>
                                </div>
                            </div>


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
                                            <p class="card-text"><small class="text-muted">Author : Cooleen
                                                    Hover</small></p>
                                            <p class="card-text"><small class="text-muted">Added By: <a href="#">Sarah
                                                        Jones</a></small></p>
                                            <a href="#" class="card-link favorite"><i class="fas fa-heart"></i> Love</a>
                                        </div>
                                    </div>
                                </div>
                            </div>






                        </div>
                    </div>
                </div>
            </div>
        </form>
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