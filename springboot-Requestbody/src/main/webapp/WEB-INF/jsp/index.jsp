<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <%@ include file="header.jsp" %>  
</head>
<body>

	<div class="container mt-3">
		<h2 >IT College</h2>
		<img alt="office body image" src="img/employees.jpg" width=100%>
		<div class="input-group mb-3">
			<span class="input-group-text">Value From Controller</span> <input
				type="text" class="form-control" value="${name}">
		</div>

	</div>

</body>
</html>
