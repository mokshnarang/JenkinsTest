
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String  user = request.getParameter("u");
		String pass = request.getParameter("p");
		if(user.equals("raj")&&pass.equals("redhat"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("TestServlet");
			rd.forward(request, response);
			
			/*
			out.println("<html><body bgcolor = 'aqua',text='blue'>");
			out.println("<h3>Welcome" +user+"</h3>");
			out.println("</body></html>");*/
		}
		else {
			out.println("Login failed !!! ");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request,response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.setContentType("text/html");
		doGet(request, response);
	}

}
