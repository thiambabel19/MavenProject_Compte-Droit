<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>List Droits</title>
<link rel="stylesheet" href="/Project_JPA/css/bootstrap.min.css">
</head>

<body class="container container-fluid">

	<%@ include file="../../home.jsp"%>

	<div class="row mt-3">

		<div class="col-md-8 offset-2 mt-2">

			<div class="card">

				<div class="card-header bg-info text-center">
					<h4 class="text-white">Droits List</h4>
				</div>

				<div class="card-body">

					<table class="table table-bordered">
						<thead>
							<tr>
								<th><h6>#</h6></th>
								<th><h6>NAME</h6></th>
							</tr>
						</thead>
						<tbody>

							<c:forEach var="droit" items="${ droits }">
								<tr>
									<td class="align-middle"><h6>
											<c:out value="${droit.id}" />
										</h6></td>
									<td class="align-middle"><h6>
											<c:out value="${droit.name}" />
										</h6></td>
								</tr>
							</c:forEach>

						</tbody>
					</table>

				</div>

			</div>

		</div>

	</div>

</body>
</html>