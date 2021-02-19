<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="pizzastyle.css">
<title>Soda</title>
</head>
<body>

	<h1>Soda</h1>
	
	<form action = "getSodaServlet" method="post">
			How many soda drinkers?:
			<input type="text" name="guests" size="1">
			<input type="submit" value="Calculate Soda" />
	</form>

	<br>
	<a href="index.jsp">Go Back</a>

</body>
</html>