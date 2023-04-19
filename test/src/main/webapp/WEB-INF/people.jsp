<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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


<body>
   <%@include file="navBar.jsp"%>

    <div class="container">
        <br>
        <h2 class="mb-4">Most Popular People</h2>
        <br>
        <div class="card card-default" id="card_contacts">

            <div id="contacts" class="panel-collapse collapse show" aria-expanded="true" style="">
                <ul class="list-group pull-down" id="contact-list">
                    <li class="list-group-item">

                        <div class="row w-100">

                            <div class="col-12 col-sm-6 col-md-3 px-0">

                                <img src="http://demos.themes.guide/bodeo/assets/images/users/m101.jpg"
                                    alt="Mike Anamendolla" class="rounded-circle mx-auto d-block img-fluid">
                            </div>
                            <div class="col-12 col-sm-6 col-md-9 text-center text-sm-left">
                                <span class=" text-success float-right pulse" title="online now">#1</span>


                                <label class="name lead">Nadia fatehi</label>
                                <br>
                                <span class="fa fa-map-marker fa-fw text-muted" data-toggle="tooltip" title=""
                                    data-original-title="5842 Hillcrest Rd"></span>
                                <span class="text-muted">Agadir</span>
                                <br>

                                <div class="links"><a href="" class=" text-muted small text-truncate"><i
                                            class="fas fa-quote-left fa-fw text-muted"></i> 1,433 quotes</a>
                                </div>
                                <div class="links"><a href="" class=" text-muted small text-truncate"><i
                                            class="fas fa-user-friends fa-fw text-muted"></i> 1,046 friends</a>
                                </div>


                                <span class="fa fa-envelope fa-fw text-muted" data-toggle="tooltip"
                                    data-original-title="" title=""></span>
                                <span class="text-muted small text-truncate">mike.ana@example.com</span>
                                <form action="/add-friend" method="post" class="mt-3 ml-auto">
                                    <button type=" submit" class="btn btn-primary add-friend-btn">Add as a
                                        Friend</button>
                                    <button type=" submit" class="btn btn-primary send-message">Send a message</button>
                                </form>
                            </div>
                        </div>
                    </li>
                    <li class="list-group-item">
                        <div class="row w-100">
                            <div class="col-12 col-sm-6 col-md-3 px-0">
                                <img src="http://demos.themes.guide/bodeo/assets/images/users/m105.jpg"
                                    alt="Seth Frazier" class="img-fluid rounded-circle d-block mx-auto">
                            </div>
                            <div class="col-12 col-sm-6 col-md-9 text-center text-sm-left">
                                <span class=" text-success float-right pulse" title="online now">#1</span>
                                <span class="name lead">Seth Frazier</span>
                                <br>
                                <span class="fa fa-map-marker fa-fw text-muted" data-toggle="tooltip" title=""
                                    data-original-title="7396 E North St"></span>
                                <span class="text-muted">7396 E North St</span>
                                <br>
                                <div class="links"><a href="" class=" text-muted small text-truncate"><i
                                            class="fas fa-quote-left fa-fw text-muted"></i> 1,433 quotes</a>
                                </div>
                                <div class="links"><a href="" class=" text-muted small text-truncate"><i
                                            class="fas fa-user-friends fa-fw text-muted"></i> 1,046 friends</a>
                                </div>
                                <span class="fa fa-envelope fa-fw text-muted" data-toggle="tooltip" title=""
                                    data-original-title="seth.frazier@example.com"></span>
                                <span class="text-muted small text-truncate">seth.frazier@example.com</span>
                                <form action="/add-friend" method="post" class="mt-3 ml-auto">
                                    <button type=" submit" class="btn btn-primary add-friend-btn">Add as a
                                        Friend</button>
                                    <button type=" submit" class="btn btn-primary send-message">Send a message</button>
                                </form>
                            </div>
                        </div>
                    </li>
                    <li class="list-group-item">
                        <div class="row w-100">
                            <div class="col-12 col-sm-6 col-md-3 px-0">
                                <img src="http://demos.themes.guide/bodeo/assets/images/users/w102.jpg"
                                    alt="Rosemary Porter" class="img-fluid rounded-circle d-block mx-auto">
                            </div>
                            <div class="col-12 col-sm-6 col-md-9 text-center text-sm-left">
                                <span class=" text-success float-right pulse" title="online now">#1</span>

                                <span class="name lead">Rosemary Porter</span>
                                <br> <span class="fa fa-map-marker fa-fw text-muted" data-toggle="tooltip" title=""
                                    data-original-title="5267 Cackson St"></span>
                                <span class="text-muted">5267 Cackson St</span>
                                <br>
                                <div class="links"><a href="" class=" text-muted small text-truncate"><i
                                            class="fas fa-quote-left fa-fw text-muted"></i> 1,433 quotes</a>
                                </div>
                                <div class="links"><a href="" class=" text-muted small text-truncate"><i
                                            class="fas fa-user-friends fa-fw text-muted"></i> 1,046 friends</a>
                                </div>
                                <span class="fa fa-envelope fa-fw text-muted" data-toggle="tooltip" title=""
                                    data-original-title="rosemary.porter@example.com"></span>
                                <span class="text-muted small text-truncate">rosemary.porter@example.com</span>
                                <form action="/add-friend" method="post" class="mt-3 ml-auto">
                                    <button type=" submit" class="btn btn-primary add-friend-btn">Add as a
                                        Friend</button>
                                    <button type=" submit" class="btn btn-primary send-message">Send a message</button>
                                </form>
                                <br>

                            </div>
                        </div>
                    </li>
                    <li class="list-group-item">
                        <div class="row w-100">
                            <div class="col-12 col-sm-6 col-md-3 px-0">
                                <img src="http://demos.themes.guide/bodeo/assets/images/users/w104.jpg"
                                    alt="Debbie Schmidt" class="img-fluid rounded-circle d-block mx-auto">
                            </div>
                            <div class="col-12 col-sm-6 col-md-9 text-center text-sm-left">
                                <span class=" text-success float-right pulse" title="online now">#1</span>
                                <label class="name lead">Debbie Schmidt</label>
                                <br>

                                <span class="fa fa-fw fa-map-marker fa-fw text-muted" data-toggle="tooltip" title=""
                                    data-original-title="3903 W Alexander Rd"></span>
                                <span class="text-muted">3903 W Alexander Rd</span>
                                <br>

                                <div class="links"><a href="" class=" text-muted small text-truncate"><i
                                            class="fas fa-quote-left fa-fw text-muted"></i> 1,433 quotes</a>
                                </div>
                                <div class="links"><a href="" class=" text-muted small text-truncate"><i
                                            class="fas fa-user-friends fa-fw text-muted"></i> 1,046 friends</a>
                                </div>


                                <span class="fa fa-fw fa-envelope fa-fw text-muted" data-toggle="tooltip" title=""
                                    data-original-title="debbie.schmidt@example.com"></span>
                                <span class="text-muted small text-truncate">debbie.schmidt@example.com</span>
                                <form action="/add-friend" method="post" class="mt-3 ml-auto">
                                    <button type=" submit" class="btn btn-primary add-friend-btn">Add as a
                                        Friend</button>
                                    <button type=" submit" class="btn btn-primary send-message">Send a message</button>
                                </form>

                            </div>
                        </div>
                    </li>
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