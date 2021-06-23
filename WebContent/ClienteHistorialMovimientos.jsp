<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <title>Historial Movimientos</title>
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
						<a class="dropdown-item" >Pedir Prestamo</a> <a
							class="dropdown-item" >Pagar Prestamo</a>
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

		<h2 align=center> Historial de movimientos </h2>
		<div align=center>
		CUENTA
		<select name="ddlCuentasHistorial" ></select>
		<input type="submit" value="Buscar" name="btnCCVerHistorialCuenta"/>
		</div>
		
		<table id="myTable" align="center" class="table table-striped" style="margin-left: 10px;">
			
				<thead>
					<tr>
						<th>Nro de Cuenta</th>
						<th>Nombre de Usuario</th>
						<th>CBU</th>
						<th>Fecha de creacion</th>
						<th>Tipo de cuenta</th>
						<th>Saldo</th>
						<th>Estado</th>
					</tr>
				</thead>
				
				<tbody>

					<tr>
						<td> <input type="hidden" name="inputCHNroMovimiento" value=" "> </td>
						<td> <input type="hidden" name="inputCHNroCuenta" value=" "> </td>
						<td> <input type="hidden" name="inputCHFecha" value=""> </td>
						<td> <input type="hidden" name="inputCHDetalle" value=" "> </td>
						<td> <input type="hidden" name="inputCHImporte" value=""> </td>
						<td> <input type="hidden" name="inputCHTipo" value=""> </td>
						<td> <input type="hidden" name="inputCHCBUDestino" value=""> </td>	
					</tr>
	
				</tbody>
			</table>
</body>
</html>