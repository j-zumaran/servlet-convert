package octal;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ConvertorServlet", urlPatterns = "/octal")
public class ConvertorServlet extends HttpServlet {

	private static final long serialVersionUID = -7846328446886099444L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String number = (String) req.getParameter("number");
		
		req.setAttribute("number", number);
		req.setAttribute("binary", OctalConvertor.toBinary(number));
		req.setAttribute("decimal", OctalConvertor.toDecimal(number));
		
        RequestDispatcher view = req.getRequestDispatcher("index.jsp");
        view.forward(req, resp);
	}	
	

}
