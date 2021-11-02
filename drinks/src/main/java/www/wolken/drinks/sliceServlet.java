package www.wolken.drinks;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class sliceServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("slice");
		resp.setContentType("text/html");   
		if(!name.isEmpty()) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("slice.html");
			dispatcher.include(req,resp);
		}
	}	

}
