package placementinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FacultyLogin {
	 static String s;
     static String p;
	 public static boolean validate(String username,String password)
	  {
	    boolean status=false;
	    try
	    {
	    	String qr="select * from faculty where username=? and password=?";
	    	Class.forName("com.mysql.jdbc.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/placementinfo","root","233178");
	    	PreparedStatement ps = con.prepareStatement(qr);
	    	
	    	ps.setString(1,username);
	    	ps.setString(2,password);
	    	ResultSet rs = ps.executeQuery();
	    	status = rs.next();
	    	s = rs.getString("name");
	    	p = rs.getString("username");
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	    return status;
	  }
	 public static String username()
	 {
		 return p;
	 }
	 public static String user()
	 {
		 return s;
	 }


}
