<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html> 
<head>
<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Perfil</title>
</head>
<body>

<!--Navbar-->

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
				<li class="nav-item"><a href="ServletCliente?HistorialMovimiento" class="nav-link">Historial</a></li>
				<li class="nav-item"><a href="ServletCliente?Transferencia" class="nav-link">Transferencias</a></li>
				<li class="nav-item"><a href="ClientePerfil.jsp" class="nav-link">Perfil</a></li>
			</ul>
			<ul class="navbar-nav" style="margin-right: 30px">
				<li class="nav-item align-content-lg-end"><label
					id="lblNombreUsuario"
					Style="color: white; margin-right: 20px; margin-top: 5px;">NombreUsuario</label>
				</li>
				<li class="nav-item align-content-lg-end"><input
					class="btn btn-secondary"
					style="position: center; text-align: center; width: 100%"
					type="submit" value="Cerrar Sesion" name="btnCerrarSesion" /></li>
			</ul>
		</div>
	</nav>
        
    <h3 align="center" style="margin-top:20px;">Su perfil:</h3>

	<table align="center" style="margin-top:20px;">
		<tr>
			<td>Usuario : </td>
			<td><label name="lblClientePerfilUsuario">NombreUsuario</label></td>
		</tr>
		<tr>
			<td>Nombre : </td>
			<td><label name="lblClientePerfilNombre">Nombre</label></td>
		</tr>
		<tr>
			<td>Apellido : </td>
			<td><label name="lblClientePerfilApellido">Apellido</label></td>
		</tr>
		<tr>
			<td>DNI : </td>
			<td><label name="lblClientePerfilDNI">DNI</label></td>
		</tr>
		<tr>
			<td>CUIL : </td>
			<td><label name="lblClientePerfilCUIL">CUIL</label></td>
		</tr>
		<tr>
			<td>Sexo : </td>
			<td><label name="lblClientePerfilSexo"></label>Sexo</td>
		</tr>
		<tr>
			<td>Nacionalidad : </td>
			<td><label name="lblClientePerfilNacionalidad"></label>nacionalidad</td>
		</tr>
		<tr>
			<td>Fecha de nacimiento : </td>
			<td><label name="lblClientePerfilFechaN"></label>fechaDeNacimiento</td>
		</tr>
		<tr>
			<td>Direccion : </td>
			<td><label name="lblClientePerfilDireccion">Direccion</label></td>
		</tr>
		<tr>
			<td>Localidad : </td>
			<td><label name="lblClientePerfilLocalidad">Localidad</label></td>
		</tr>
		<tr>
			<td>Provincia : </td>
			<td><label name="lblClientePerfilProvincia">Provincia</label></td>
		</tr>
		<tr>
			<td>Correo electronico : </td>
			<td><label name="lblClientePerfilCorreo">Email</label></td>
		</tr>
		<tr>
			<td>Telefonos : </td>
			<td><label name="lblClientePerfilTelefonos">Telefono</label></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" onclick="location.href='ClienteCuentas.jsp';" value="Ver mis cuentas" name="btnClientePerfilCuentas"/></td>
		</tr>
	</table>
	
	
	<!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>


</body>
</html>