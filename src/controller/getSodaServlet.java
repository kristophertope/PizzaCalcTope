package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SodaLogic;

/**
 * Servlet implementation class getPizzaServlet
 */
@WebServlet("/getSodaServlet")
public class getSodaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getSodaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String guests = request.getParameter("guests");
		
		SodaLogic sl = new SodaLogic(Integer.parseInt(guests));
		
//		PrintWriter writer = response.getWriter();
//		writer.println(sl.toString());
//		writer.close();
		
		request.setAttribute("Sodas", sl);
		getServletContext().getRequestDispatcher("/soda_result.jsp").forward(request, response);
		
	}

}
