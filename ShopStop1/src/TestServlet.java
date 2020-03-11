

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String  user = request.getParameter("u");
		String pass = request.getParameter("p");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String user=request.getParameter("u");
		String pass=request.getParameter("p");
		
		out.println("<html><body bgcolor = 'aqua',text='blue'>");
		out.println("<h3>Welcome" +user+"</h3>");
		out.println("</body></html>");
		HttpSession session=request.getSession();
		session.setAttribute("usr", user);
		int timeout=10;
		session.setMaxInactiveInterval(timeout);
		response.setHeader("Refresh", timeout + ";URL=timeout.jsp");
		out.println("<a href='LogoutServlet'>log out</a>");
	}

}
