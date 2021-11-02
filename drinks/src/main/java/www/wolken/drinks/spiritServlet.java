package www.wolken.drinks;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class spiritServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("sprite");
		resp.setContentType("text/html");   
		if(!name.isEmpty()) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("spirit.html");
			dispatcher.include(req,resp);
		}
	}	

}