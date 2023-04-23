<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page import="comm.octest.beans.QuoteManager"%>
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
<style>
<%@ include file="/WEB-INF/ressources/css/myQuotes.css"%></style>
</head>
<%
ArrayList<QuoteManager> quotes = new ArrayList<>();
quotes = (ArrayList<QuoteManager>) request.getAttribute("quotes");
%>
<body>
	<%@include file="navBar.jsp"%>
	<%
	for (QuoteManager q : quotes) {
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
	<div class="container my-4">
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
						<a href="#" class="card-link edit-quote" data-toggle="modal"
							data-target="#editQuoteModal" data-quote-text="<%=quote_text%>"
							data-book-title="<%=book_name%>"
							data-author-name="<%=author_name%>"
							data-id-quote="<%=id_quote%>"><i class="fas fa-edit"></i>
							Edit</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%
	}
	%>
	<div class="modal fade" id="editQuoteModal" tabindex="-1" role="dialog"
		aria-labelledby="editQuoteModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="editQuoteModalLabel">Edit Quote</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<form method="post" action="myQuotes">
				<div class="modal-body">
					
						<div class="form-group">
							<label for="quoteText">Quote Text</label>
							<textarea class="form-control" id="quoteText" rows="3" name="quote_text">""</textarea>
						</div>
						<div class="form-group">
							<label for="bookTitle">Book Name </label> 
							<input type="text" class="form-control" id="bookTitle" value="" name="book_name">
						</div>
						<div class="form-group">
							<label for="publishedYear">Name of the Author</label>
							 <input type="text" class="form-control" id="nameOfTheAuthor" value="" name="author_name">
						</div>
						<div class="form-group">
							 <input type="hidden" class="form-control" id="idQuote" value="" name="id_quote">
						</div>
					
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button type="submit" class="btn btn-primary">Save changes</button>
				</div>
				</form>
			</div>
		</div>
	</div>
<script>
    const editButtons = document.querySelectorAll('.edit-quote');
    editButtons.forEach(button => {
    button.addEventListener('click', event => {
      const quoteText = button.dataset.quoteText;
      const bookTitle = button.dataset.bookTitle;
      const authorName = button.dataset.authorName;
      const idQuote    = button.dataset.idQuote ; 
      document.querySelector('#quoteText').value = quoteText;
      document.querySelector('#bookTitle').value = bookTitle;
      document.querySelector('#nameOfTheAuthor').value = authorName;
      document.querySelector('#idQuote').value = idQuote;
    });
  });
</script>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script>
		$('.favorite').on('click', function() {
			$(this).toggleClass('active');
		});
		// Get a reference to the edit button
		// Add a click event listener to the "Edit" button
	</script>
</body>
</html>
