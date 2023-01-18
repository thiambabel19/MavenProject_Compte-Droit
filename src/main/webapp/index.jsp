<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<!--===============================================================================================-->
<link rel="icon" type="image/png"
	href="login_temp/images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="login_temp/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="login_temp/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="login_temp/fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="login_temp/vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="login_temp/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="login_temp/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="login_temp/vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="login_temp/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="login_temp/css/util.css">
<link rel="stylesheet" type="text/css" href="login_temp/css/main.css">
<!--===============================================================================================-->
</head>
<body class="container container-fluid">
	<div class="row">

		<div class="limiter">
			<div class="container-login100"
				style="background-image: url('images/bg-01.jpg');">
				<div class="wrap-login100">
					<form action="home" method="post"
						class="login100-form validate-form">
						<span class="login100-form-logo"> <i
							class="zmdi zmdi-landscape"></i>
						</span>

						<h6>
							<span class="login100-form-title p-b-34 p-t-27">Login</span>
						</h6>

						<div class="wrap-input100 validate-input"
							data-validate="Enter username">
							<input class="input100" type="text" name="username"
								placeholder="Username"> <span class="focus-input100"
								data-placeholder="&#xf207;"></span>
						</div>

						<div class="wrap-input100 validate-input"
							data-validate="Enter password">
							<input class="input100" type="password" name="password"
								placeholder="Password"> <span class="focus-input100"
								data-placeholder="&#xf191;"></span>
						</div>

						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="ckb1" type="checkbox"
								name="remember-me"> <label class="label-checkbox100"
								for="ckb1"> Remember me </label>
						</div>

						<div class="mb-2">

							<c:if test="${ error_msg != null }">
								<h6 class="form-group text-center text-danger">
									<c:out value="${ error_msg }" />
								</h6>
							</c:if>

						</div>

						<div class="container-login100-form-btn">
							<button class="login100-form-btn">Login</button>
						</div>

						<div class="text-center p-t-90">
							<a class="txt1" href="#"> Forgot Password? </a>
						</div>
					</form>
				</div>
			</div>
		</div>

	</div>
</body>
</html>