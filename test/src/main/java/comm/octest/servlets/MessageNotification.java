package comm.octest.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import comm.octest.beans.Message;

@WebServlet(name = "MessageNotification", value = "/messageNotification")
public class MessageNotification extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		String emailNavBar= (String ) session.getAttribute("email") ;




try {

	
	
	Message message = new Message() ; 
	List<Message> msgNotification = message.notification(emailNavBar) ;
	String json = new Gson().toJson(msgNotification); 
	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	response.getWriter().write(json);
} catch (Exception e) {
	
	e.printStackTrace();
} 



	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}








