<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" href="/Project_JPA/css/bootstrap.min.css" />
<link
	href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,700'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="/Project_JPA/template/css/style.css">
<link rel="stylesheet" href="/Project_JPA/css/bootstrap.min.css">
</head>

<body class="container container-fluid">

	<section class="section mt-3">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-6 text-center">
					<h2 class="heading-section">Security_WEB</h2>
				</div>
			</div>
		</div>
		<div class="container">
			<nav class="navbar navbar-expand-lg ftco_navbar ftco-navbar-light"
				id="ftco-navbar">
				<div class="container">
					<a class="navbar-brand text-info"
						href="<%=request.getContextPath()+"/home"%>"><span>${ compte.username}</span>/Slight</a>
					<div class="social-media order-lg-last">
						<p class="mb-0 d-flex">
							<a href="<%=request.getContextPath()+"/home"%>"
								class="d-flex align-items-center justify-content-center"><span
								class="fa fa-facebook"><i class="sr-only">Facebook</i></span></a> <a
								href="<%=request.getContextPath()+"/home"%>"
								class="d-flex align-items-center justify-content-center"><span
								class="fa fa-twitter"><i class="sr-only">Twitter</i></span></a> <a
								href="<%=request.getContextPath()+"/home"%>"
								class="d-flex align-items-center justify-content-center"><span
								class="fa fa-instagram"><i class="sr-only">Instagram</i></span></a>
							<a href="<%=request.getContextPath()+"/home"%>"
								class="d-flex align-items-center justify-content-center"><span
								class="fa fa-dribbble"><i class="sr-only">Dribbble</i></span></a>
						</p>
					</div>
					<button class="navbar-toggler" type="button" data-toggle="collapse"
						data-target="#ftco-nav" aria-controls="ftco-nav"
						aria-expanded="false" aria-label="Toggle navigation">
						<span class="fa fa-bars"></span> Menu
					</button>
					<div class="collapse navbar-collapse" id="ftco-nav">
						<ul class="navbar-nav ml-auto mr-md-3">
							<li class="nav-item active"><a
								href="<%=request.getContextPath()+"/home"%>" class="nav-link">Home</a></li>
							<li class="nav-item"><a
								href="<%=request.getContextPath()+"/droit/add"%>"
								class="nav-link">Add droit</a></li>
							<li class="nav-item"><a
								href="<%=request.getContextPath()+"/droit/list"%>"
								class="nav-link">Droits List</a></li>
							<li class="nav-item"><a
								href="<%=request.getContextPath()+"/compte/add"%>"
								class="nav-link">Add Compte</a></li>
							<li class="nav-item"><a
								href="<%=request.getContextPath()+"/compte/list"%>"
								class="nav-link">Comptes List</a></li>
							<li class="nav-item"><a
								href="<%=request.getContextPath()+"/logout"%>" class="nav-link"><span>Logout</span></a></li>
						</ul>
					</div>
				</div>
			</nav>
			<!-- END nav -->
		</div>

	</section>



	<script src="/Project_JPA/template/js/jquery.min.js"></script>
	<script src="/Project_JPA/template/js/popper.js"></script>
	<script src="/Project_JPA/template/js/bootstrap.min.js"></script>
	<script src="/Project_JPA/template/js/main.js"></script>