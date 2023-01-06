<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Employees Information</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"rel="stylesheet">
	<script	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<link href="/day07hibernateConnect-Wiring-Annotation-Spring/src/main/webapp/css/style.css" rel="stylesheet">
</head>
<body class="bg-dark text-white">
	<div class="container">
		<!-- <img alt="Office image"  class="rounded-circle"  src="img/office.jpg"> -->
		<h2>Java Development Team</h2>
		<br>
		<!-- if condition in jstl  -->
		<c:if  test="${sessionScope.username ne null }">
				<span> ${sessionScope.username }</span>				
		</c:if>
	<%-- 	${message} --%>
		<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
			<div class="container-fluid">
					<a class="navbar-brand" href="javascript:void(0)"><img alt="Office image"  class="rounded-circle"  src="img/office.jpg"></a>						
					
				<div class="collapse navbar-collapse" id="mynavbar">				
						<ul class="navbar-nav me-auto">
						<!-- if else done by choose in jstl -->
							<c:choose>
									<c:when test="${sessionScope.username ne null }">
										<li class="nav-item"><a class="nav-link" 	href="index">Home</a></li>	
										<li class="nav-item"><a class="nav-link"	href="editProfileus?id=${sessionScope.id}&usertype=${sessionScope.usertype }">Profile</a></li>
										
										<c:if test="${sessionScope.usertype eq 'user' }">
												<li class="nav-item"><a class="nav-link" href="userList">User List</a></li>
												<li class="nav-item"><a class="nav-link" href="studentList">Student List</a></li>
										</c:if>
								
								<li class="nav-item"><a class="nav-link"	href="logOut">Log Out</a></li>
									</c:when>
									<c:otherwise>
										<li class="nav-item"><a class="nav-link" 	href="index">Home</a></li>
										<li class="nav-item"><a class="nav-link"	href="login">Log In</a></li>						
										<li class="nav-item"><a class="nav-link"	href="registration">Sign Up</a></li>
									</c:otherwise>
							</c:choose>
						</ul>
						
					<form class="d-flex">
						
						<input class="form-control me-2" type="text" placeholder="Search">
						<button class="btn btn-primary" type="button">Search</button>
					</form>
				</div>
			</div>
		</nav>

	</div>
	<div>		
		<c:if test="${message ne null }"> 
			<div class="alert alert-success"><strong>${message}</strong></div>
		</c:if>
	</div>

</body>

</html>