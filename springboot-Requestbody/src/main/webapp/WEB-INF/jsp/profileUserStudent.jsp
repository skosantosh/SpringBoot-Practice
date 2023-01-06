<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <%@ include file="header.jsp" %>  
</head>
<body>

	<div class="container mt-3" style="padding-left: 400px;">
		<h2>Edit Profile</h2>

		<form action="editProfile" method="post">
			<div style="width: 40%;">
				<label>First Name: </label>
				<input type="text" name="fname" class="form-control"	value="${userprofile.fname}"><br>
				<label>Last Name: </label>
				<input type="text" name="lname" class="form-control" value="${userprofile.lname}"><br>
				<label>Email: </label>
				<input type="email" name="email" class="form-control" value="${userprofile.email}"><br>
				 <label>User Name: </label>
				 <input type="text" name="username" class="form-control" value="${userprofile.username}"><br>
				<label>Password: </label>
				<input type="text" name="password" class="form-control" value="${userprofile.password}"> <br>

				<button type="submit" class="btn btn-primary">Update</button>
				<button type="reset" class="btn btn-primary">Reset</button>
				<a href="backbutton"><button type="button" class="btn btn-warning">back</button></a>
			</div>
	</form>
	</div>
</body>
</html>
