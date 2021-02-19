<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pizza Results</title>
<link rel="stylesheet" type="text/css" href="pizzastyle.css">
</head>
<body>

	<h1>Pizza Results</h1>

	<p>You need ${Pizzas.getNumPizzas()} Large Pizzas!</p>

	<a href="index.jsp">Start Over</a>

</body>
</html>