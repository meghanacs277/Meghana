package www.wolken.drinks;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class mountaindewServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("mountain");
		resp.setContentType("text/html");   
		if(!name.isEmpty()) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("mountaindew.html");
			dispatcher.include(req,resp);
		}
	}	
}


