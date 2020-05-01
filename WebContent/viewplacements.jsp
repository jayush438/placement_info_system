<%@ page import="java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Placements</title>
<link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<body>
<h1 style="color:white; text-align:center; margin:50px;">PLACEMENT INFO</h1>
<div  class="main">
<div>	
	<ul>
		<li ><a href="homepage.html">HOME</a></li>
		<li class="active"><a href="student.html">STUDENT</a></li>
		<li><a href="faculty.html">FACULTY</a></li>
		<li><a href="tpo.html">T.P.O</a></li>
	</ul>
</div>
<div>
	<img src="ipslogo3.png" style="height: 300px; width: 250px; position: absolute; margin-left: 800px;">
	<div style="position: absolute; margin-left: 800px; margin-top: 300px;">
		<h2>Categories</h2>
		<li><a href="homepage.html">HOME</a></li>
		<li><a href="viewplacements.jsp">VIEW PLACEMENTS</a></li>
		<li><a href="viewstatus.html">VIEW STATUS</a></li>
		<form action="student.html">
        <button type="submit" name="logout" style="text-align: center;margin-top: 0px">Logout</button><br><br>
      </form>
	</div>
</div>
<div class="slider">

</div>
<footer style="margin-left: 150px;">
<div>
<table border="2" style="margin-top:15px;background-color:yellow" class="table" >
<tr>
<td>COMAPANY NAME</td>
<td>DESCRIPTION</td>
<td>DATE</td>
</tr>
<%

try
{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/placementinfo";
String username="root";
String password="233178";
String query="select * from placements";
Connection conn=DriverManager.getConnection(url,username,password);
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{

%>
   <tr>
   
    <td><%=rs.getString("companyname") %></td>
    <td><%=rs.getString("description") %></td>
    <td><%=rs.getString("date") %></td>
    </tr>
        <%

}
%>
    </table>
    <%
    rs.close();
    stmt.close();
    conn.close();
    }
catch(Exception e)
{
    e.printStackTrace();
 
}
 %>

		 
</div>
</footer>
	
</div>


</body>
</html>