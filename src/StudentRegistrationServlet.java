

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentRegistrationServlet
 */
@WebServlet("/StudentRegistrationServlet")
public class StudentRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String qr="insert into student values(?,?,?,?,?,?,?)";
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String n=request.getParameter("name");
		String p=request.getParameter("username");
		String q=request.getParameter("password");
		String s=request.getParameter("email");
		String r=request.getParameter("mobileno");
		String t=request.getParameter("address");
		String u=request.getParameter("dob");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/placementinfo","root","233178");
			PreparedStatement ps = con.prepareStatement(qr);
			ps.setString(1,n);
			ps.setString(2,s);
			ps.setString(3,u);
			ps.setString(4,t);
			ps.setString(5,r);
			ps.setString(6,p);
			ps.setString(7,q);
			int i = ps.executeUpdate();
			if(i>0)
			{
				RequestDispatcher rd= request.getRequestDispatcher("student.html");
				rd.include(request,response);
				out.println("<script>window.alert('You are successfully registered')</script>");
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		out.close();// TODO Auto-generated method stub
	// TODO Auto-generated method stub
	}
		// TODO Auto-generated method stub
	}


