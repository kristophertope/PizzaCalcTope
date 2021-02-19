<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pizza</title>
<link rel="stylesheet" type="text/css" href="pizzastyle.css">
</head>
<body>

	<h1>Pizza</h1>

	<form action = "getPizzaServlet" method="post">
		How many pizza eaters?:
		<input type="text" name="guests" size="1">
		<input type="submit" value="Calculate Pizza" />
	</form>
	
	<br>
	<a href="index.jsp">Go Back</a>

</body>
</html>