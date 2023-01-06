<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<%@ include file="header.jsp"%>
</head>
<body>

	<div class="container mt-3">
		<h2>User List</h2>
		
		<table class="table table-hover">
			<thead>
				<tr >
					<th style="color: white;">First Name</th>
					<th style="color: white;">User Name</th>
					<th style="color: white;">Email</th>
					<th style="color: white;">Action</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${userlist}" var = "user">
				<tr>
					<td style="color: white;">${user.fname }</td>
					<td style="color: white;">${user.lname }</td>
					<td style="color: white;">${user.email }</td>					
					<td>
							<a href="userDetail?id=${user.id}"><button type="button" class="btn btn-success">Detail</button></a> 
							<a href="userDelete?id=${user.id}"><button type="button"class="btn btn-danger">Delete</button></a> 
							<a href="userRForUpdate?id=${user.id}"><button type="button" class="btn btn-warning">Update</button></a>
					</td>
				</tr>	
				</c:forEach>			
			</tbody>
		</table>
	</div>

</body>




</body>
</html>
