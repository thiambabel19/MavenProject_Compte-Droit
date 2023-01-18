<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Add Droit</title>
<link rel="stylesheet" href="/Project_JPA/css/bootstrap.min.css">
</head>

<body class="container container-fluid">

	<%@ include file="../../home.jsp"%>

	<div class="row mt-5">

		<div class="col-md-8 offset-2 mt-2">

			<div class="card">

				<div class="card-header bg-info text-center">
					<h4 class="text-white">Add Droit Form !</h4>
				</div>

				<div class="card-body">

					<form class="form-group" action="add" method="post">
						<div class="mb-2">
							<h6 class="form-group">Name</h6>
							<input type="text" name="name" placeholder="Name of droit"
								class="form-control" required>
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