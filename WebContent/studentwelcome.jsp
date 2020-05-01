<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Welcome Page</title>
<link rel="stylesheet" type="text/css" href="stylesheet.css">
<script type="text/javascript">
    function logout() {
      // body...
    
    window.alert("You will be logged out")
  }
  </script>

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
        <button type="submit" name="logout" style="text-align: center;margin-top: 0px" onclick="return logout()">Logout</button><br><br>
      </form>
	</div>
</div>
<div class="slider">

</div>
<footer style="margin-left: 150px;">
<div>
		 <h1> Welcome <%=placementinfo.Login.user() %></h1>
</div>
</footer>
	
</div>


</body>
</html>