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
			<c:forEach items="${studentlist}" var = "student">
				<tr>
					<td style="color: white;">${student.fname }</td>
					<td style="color: white;">${student.lname }</td>
					<td style="color: white;">${student.email }</td>					
					<td>
							<a href="studentDetail?id=${student.id}"><button type="button" class="btn btn-success">Detail</button></a> 
							<a href="studentDelete?id=${student.id}"><button type="button"class="btn btn-danger">Delete</button></a> 
							<a href="studentUpdate?id=${student.id}"><button type="button" class="btn btn-warning">Update</button></a>
					</td>
				</tr>	
				</c:forEach>			
			</tbody>
		</table>
	</div>

</body>




</body>
</html>
