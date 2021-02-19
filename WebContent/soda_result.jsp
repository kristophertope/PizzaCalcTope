<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Soda Results</title>
<link rel="stylesheet" type="text/css" href="pizzastyle.css">
</head>
<body>

	<h1>Soda Results</h1>

	<p>You need ${Sodas.getNumSodas()} two liter bottles!</p>
	
	<a href="index.jsp">Start Over</a>

</body>
</html>