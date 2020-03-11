

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Survey
 */
@WebServlet("/Survey")
public class Survey extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Survey() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		String comments=request.getParameter("txtcomment");
		String items=request.getParameter("rbitems");
		String s=request.getParameter("survey");
		//String s1="survey";
		
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><title>SHOPSTOP1</title></head>");
		out.println("<body bgcolor=\"#ffffff\">");
		out.println("<H1>"+ s + "</H1></BR>");
		out.println("congraatukations,u are qualified for lucky draw");
		out.println("</br>");
		out.println("ur comments:" +comments);
		out.println("No. of items purchased" +items);
		out.println("</br>");
		out.println("</body>");
		out.println("</html>");
		//response.sendRedirect("https://surveymonkey.com");
		response.sendRedirect("https://google.co.in/#q="+s);
		out.close();
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
