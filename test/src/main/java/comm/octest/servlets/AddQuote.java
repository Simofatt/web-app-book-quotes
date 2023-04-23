package comm.octest.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import comm.octest.beans.AuthorFactory;
import comm.octest.beans.BookFactory;
import comm.octest.beans.I_Quote;
import comm.octest.beans.QuoteFactory;

@WebServlet(name = "AddQuote", value = "/addQuote")
public class AddQuote extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddQuote() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String email = (String) session.getAttribute("email");
		if (email != null) {

			this.getServletContext().getRequestDispatcher("/WEB-INF/addQuote.jsp").forward(request, response);
		} else {
			response.sendRedirect("registration");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		String name_book = request.getParameter("name_book");
		String name_author = request.getParameter("name_author");
		String quote_text = request.getParameter("quote_text");
		String book_type = request.getParameter("book_type");
		int user_id = (int) session.getAttribute("user_id");
		try {

			AuthorFactory author = new AuthorFactory();
			author.addAuthor(name_author);

			BookFactory book = new BookFactory();
			book.addBook(name_author, book_type, name_book);

			System.out.println("User :" + user_id);
			I_Quote quoteFactory = new QuoteFactory(1);

			if (user_id > 0) {
				quoteFactory.addQuote(name_book, quote_text, user_id);
			} else {
				System.out.print("User not found");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		this.getServletContext().getRequestDispatcher("/WEB-INF/addQuote.jsp?success=1").forward(request, response);

	}

}
