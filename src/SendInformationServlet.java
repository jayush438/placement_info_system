

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
 * Servlet implementation class SendInformationServlet
 */
@WebServlet("/SendInformationServlet")
public class SendInformationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendInformationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String qr="insert into information values(?,?)";
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String n=request.getParameter("message");
		String p=request.getParameter("date");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/placementinfo","root","233178");
			PreparedStatement ps = con.prepareStatement(qr);
			ps.setString(1,n);
			ps.setString(2,p);
			int i = ps.executeUpdate();
			if(i>0)
			{
				RequestDispatcher rd= request.getRequestDispatcher("tpowelcome.jsp");
				rd.include(request,response);
				out.println("<script>window.alert('Information is successfully sent')</script>");
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		out.close();
		// TODO Auto-generated method stub
	}

}
