package comm.octest.beans;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface  I_Access {
	public void grantAccess(Observer user, String pageName,HttpServletResponse response,HttpServletRequest request) throws IOException, ServletException;
	
}
