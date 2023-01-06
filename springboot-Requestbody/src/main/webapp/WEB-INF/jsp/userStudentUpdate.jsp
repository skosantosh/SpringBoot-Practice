<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <%@ include file="header.jsp" %>  
</head>
<body>

	<div class="container mt-3" style="padding-left: 400px;">
		<h2>Update</h2>

		<form action="updateUser" method="post">
			<div style="width: 40%;">
				<label>Id: </label>
				<input type="text" name="id" readonly="readonly" class="form-control"	value="${userlist.id}"><br>
				<label>First Name: </label>
				<input type="text" name="fname" class="form-control"	value="${userlist.fname}"><br>
				<label>Last Name: </label>
				<input type="text" name="lname" class="form-control" value="${userlist.lname}"><br>
				<label>Email: </label>
				<input type="email" name="email" class="form-control" value="${userlist.email}"><br>
				 <label>User Name: </label>
				 <input type="text" name="username" class="form-control" value="${userlist.username}"><br>
				 
				 
				 <input type="text" name="password" class="form-control" value="${userlist.password}"><br>
				 <input type="text" name="usertype" class="form-control" value="${userlist.usertype}"><br>
				
				<select class="form-select" name = "userpower" aria-label="Choose Group">
					<option selected>${userlist.userpower}</option>
					<option value="admin">Admin</option>
					<option value="user">User</option>								
				</select>
				 <br>
				<button type="submit" class="btn btn-primary">Update</button>
				<button type="reset" class="btn btn-primary">Reset</button>
				<a href="backbutton"><button type="button" class="btn btn-warning">back</button></a>
			</div>
	</form>
	</div>
</body>
</html>


