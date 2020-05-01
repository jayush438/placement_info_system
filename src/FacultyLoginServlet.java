

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import placementinfo.FacultyLogin;
import placementinfo.Login;

/**
 * Servlet implementation class FacultyLoginServlet
 */
@WebServlet("/FacultyLoginServlet")
public class FacultyLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FacultyLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	  	   PrintWriter out = response.getWriter();
	  	   String n = request.getParameter("username");
	  	   String p= request.getParameter("password");
	  	   if(FacultyLogin.validate(n,p))
	  	   {
	  		   RequestDispatcher rd = request.getRequestDispatcher("FacultyWelcomeServlet");
	  		   rd.forward(request, response);
	  		 
	       }
	  	   else
	  	   {
	  		   out.print("Sorry username or password error");
	  		   RequestDispatcher rd = request.getRequestDispatcher("faculty.html");
	  		   rd.include(request,response);
	  	   }// TODO Auto-generated method stub
	}

}
