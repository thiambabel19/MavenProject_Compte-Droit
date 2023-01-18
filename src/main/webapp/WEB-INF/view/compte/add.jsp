<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Add Compte</title>
<link rel="stylesheet" href="/Project_JPA/css/bootstrap.min.css">
</head>

<body class="container container-fluid">

	<%@ include file="../../home.jsp"%>

	<div class="row mt-3">

		<div class="col-md-8 offset-2 mt-2">

			<div class="card">

				<div class="card-header bg-info text-center">
					<h4 class="text-white">Add Compte Form !</h4>
				</div>

				<div class="card-body">

					<form class="form-group" action="add" method="post">

						<div class="mb-2">
							<h6 class="form-group">Username</h6>
							<input type="text" name="username"
								placeholder="Enter the username" class="form-control" required>
						</div>

						<div class="mb-2">
							<h6 class="form-group">Password</h6>
							<input type="password" name="password"
								placeholder="Enter the password" class="form-control" required>
						</div>

						<div class="mt-2">
							<h6 class="form-group">Droits</h6>
							<select name="droit" class="form-group">
								<c:forEach var="droit" items="${droits}">
									<option class="form-control" value="${ droit.id }"><c:out
											value="${ droit.name }" /></option>
								</c:forEach>
							</select>
						</div>


						<div class="mb-2">

							<c:if test="${ successfully_msg != null }">
								<h6 class="form-group text-center text-success">
									<c:out value="${ successfully_msg }" />
								</h6>
							</c:if>

						</div>

						<div class="mt-4">
							<input type="submit" name="add" value="Add" class="btn btn-info">
							<input type="reset" name="annuler" value="Cancel"
								class="btn btn-danger">
						</div>

					</form>

				</div>

			</div>

		</div>

	</div>

</body>
</html>