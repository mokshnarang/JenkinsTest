

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pwriter = response.getWriter();
		String  user = request.getParameter("u");
		String password = request.getParameter("p");
		if(user.equals("raj")&&password.equals("redhat"))
		{
			

			pwriter.println("<h3>Welcome" +user+"</h3>");
			pwriter.println("<br><br>");
			pwriter.println("here is ur password"+password);
			pwriter.println("<br><br>");
			
			HttpSession session= request.getSession();
			session.setAttribute("uname", user);
			session.setAttribute("uspass", password);
			pwriter.println("session id is " + session.getId()+"<br/>");
			pwriter.println("time is: "+new Date(session.getLastAccessedTime()) + "<br/>" );
		}
		
		else {
			pwriter.println("Login failed !!! ");
			RequestDispatcher rd=request.getRequestDispatcher("Login1.html");
			rd.include(request,response);
		}
		
		pwriter.print("<a href='SessionWelcome'>view details</a>");
		pwriter.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
