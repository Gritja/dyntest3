<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

        <form action="<%= request.getContextPath() %>/ServletClass2" method="GET">
            GET List length <input type="text" name="toList"> <br /> 
            Animal  <select name= "animalChosen">
  				<option value="platy">Platypus</option>
  				<option value="octo">Octopus</option>
  				<option value="eleph">Elephant</option>
  				<option value="stork">Stork</option>
				</select>  <input type="submit"
                value="Submit" />
                </form>
                

<form action="<%= request.getContextPath() %>/ServletClass2" method="post">
Admin login: <input type="password" name="password"> <br>
<br>
<input type="submit" value="register"></form>

</body>
</html>