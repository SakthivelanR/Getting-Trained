package org.pgs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pgs.java.MailIdValidation;

/**
 * Servlet implementation class servelet
 */
@WebServlet("/servelet")
public class servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public servelet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name= request.getParameter("name");
		String email= request.getParameter("EmailID");
		String ip=request.getRemoteAddr();
		MailIdValidation mailID= new MailIdValidation();
		mailID.validate(name,email);
		
		response.getWriter().println("<html>");
		response.getWriter().println("<head>");
		response.getWriter().println("<title>Response </title>");
		response.getWriter().println("</head>");
		response.getWriter().println("<body>");
		
		response.getWriter().println("NAME "+ name);
		response.getWriter().println("<br>EMAIL "+email);
		response.getWriter().println("<br>IP "+ip);
		
		response.getWriter().println("</body>");
		response.getWriter().println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
