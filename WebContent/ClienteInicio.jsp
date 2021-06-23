<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<title>Inicio</title>
</head>
<body>

	<!--Navbar-->
	<nav id="mainNavbar" class="navbar navbar-dark navbar-expand-md py-0"
		style="background: #569EF4">

		<a href="#" class="navbar-brand">UTN Bank</a>

		<button class="navbar-toggler" data-toggle="collapse"
			data-target="#navLinks" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse justify-content-between blurb"
			id="navLinks">
			<ul class="navbar-nav">
				<li class="nav-item"><a href="ClienteInicio.jsp" class="nav-link">Inicio</a></li>
				<li class="nav-item"><a class="nav-link">Historial</a></li>
				<li class="nav-item"><a class="nav-link">Transferencias</a></li>
				<li class="nav-item dropdown">
				<a
					class="nav-link dropdown-toggle" id="navbarDropdownMenuLink"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Prestamos 
				</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
						<a class="dropdown-item">Pedir Prestamo</a> <a
							class="dropdown-item">Pagar Prestamo</a>
					</div></li>
				<li class="nav-item"><a href="ClientePerfil.jsp" class="nav-link">Perfil</a></li>
			</ul>
			<ul class="navbar-nav" style="margin-right: 30px">
				<li class="nav-item align-content-lg-end"><label
					id="lblNombreUsuario"
					Style="color: white; margin-right: 20px; margin-top: 5px;">Nombre de Usuario</label>
				</li>
				<li class="nav-item align-content-lg-end"><input
					class="btn btn-secondary"
					style="position: center; text-align: center; width: 100%"
					type="submit" value="Cerrar Sesion" name="btnCerrarSesion" /></li>
			</ul>
		</div>
	</nav>

	<h3 align="center"
		style="margin-top: 60px; margin-left: 70px; margin-right: 70px;">Hola
		Nombre de usuario, bienvenido a su home banking, en esta plataforma va a
		poder realizar transferencias, pedir prestamos, pagar cuotas,
		monitorear sus cuentas y muchas otras cosas mas. Para navegar dentro
		del home banking debe utilizar la barra de menu que se encuentra en la
		parte de arriba de la pagina, desde ahi va a poder acceder a todas las
		funciones que la aplicacion ofrece.</h3>

</body>
</html>