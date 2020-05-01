package placementinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TpoLogin 
{
	 static String a;
     static String b;
	 public static boolean validate(String username,String password)
	  {
	    boolean status=false;
	    try
	    {
	    	String qr="select * from tpo where username=? and password=?";
	    	Class.forName("com.mysql.jdbc.Driver");
	    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/placementinfo","root","233178");
	    	PreparedStatement ps = con.prepareStatement(qr);
	    	
	    	ps.setString(1,username);
	    	ps.setString(2,password);
	    	ResultSet rs = ps.executeQuery();
	    	status = rs.next();
	    	a = rs.getString("name");
	    	b = rs.getString("username");
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	    return status;
	  }
	 public static String username()
	 {
		 return b;
	 }
	 public static String user()
	 {
		 return a;
	 }
	
}
