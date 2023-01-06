<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <%@ include file="header.jsp" %>  
</head>
<body>

	<div class="container mt-3" style="padding-left: 400px;">
		<h2>User Detail</h2>		
			<div style="width: 40%;">
				<label>First Name</label>
				<input type="text" name="fname" class="form-control" value="${userdetail.fname }"><br>
				<label>Last Name</label>
				<input type="text" name="lname" class="form-control" value="${userdetail.lname }"><br>
				<label>Email</label>
				<input type="email" name="email" class="form-control" value="${userdetail.email }"><br>
				<label>User Name</label>
				 <input type="text" name="username" class="form-control" value="${userdetail.username }"><br>
				 <label>User Type</label>
				<input type="text" name="usertype" class="form-control" value="${userdetail.usertype }"> <br>
				<c:if test="${ userdetail.usertype eq 'user'}">		
					<label>User Power</label>		
					<input type="text" name="userpower" class="form-control" value="${userdetail.userpower }"> <br>		
				</c:if>
				<a href="backbutton"><button type="button" class="btn btn-warning">back</button></a>
			</div>
	</div>
</body>
</html>
