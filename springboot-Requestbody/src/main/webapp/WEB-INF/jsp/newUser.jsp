<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <%@ include file="header.jsp" %>  
</head>
<body>
	
<div class="container mt-3" style="padding-left: 400px;">
		<h2>Create New User</h2>

		<form action="createNewUser" method="post">
			<div style="width: 40%;">
				<input type="text" name="fname" class="form-control" placeholder="First Name"><br>
				 <input type="text" name="lname"	class="form-control" placeholder="Last Name"><br>
				 <input type="email" name="email" class="form-control" placeholder="Email"><br>
				 <input type="text" name="username" class="form-control" placeholder="User Name"><br>
				 <input type="password" name="password" class="form-control" placeholder="Password">
				<br>
				
				<div class="form-check">
						<input type="radio" class="form-check-input" id="radio1"	name="usertype" value="user" checked> <label class="form-check-label" for="radio1">User</label>
				</div>
					<div class="form-check">
						<input type="radio" class="form-check-input" id="radio2" 	name="usertype" value="student"> <label class="form-check-label" for="radio2">Student</label>
				</div>
				
				<br>				

				<button type="submit" class="btn btn-primary">Sign Up</button>
				<button type="reset" class="btn btn-primary">Reset</button>
			</div>
		</form>
	</div>
</body>
</html>
