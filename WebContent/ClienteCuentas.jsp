<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <title>Cuentas</title>
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
	
	
        <h2 align=center>Tus cuentas</h2>
        
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
						<th>Ver Historial</th>
					</tr>
				</thead>
				
				<tbody>

					<tr>
						<td> <input type="hidden" name="inputCCuentaNroCuenta" value=" "> </td>
						<td> <input type="hidden" name="inputCCuentaNombreUsuario" value=""> </td>
						<td> <input type="hidden" name="inputCCuentaCbu" value=""></td>
						<td> <input type="hidden" name="inputCCuentaTipo" value=""></td>
						<td> <input type="hidden" name="inputCCuentaFecha" value=""> </td>
						<td> <input type="hidden" name="inputCCuentaSaldo" value=""> </td>
						<td><input type="submit" value="Ver" name="btnCCVerHistorialCuenta"></td>
					</tr>

				</tbody>
			</table>

	
</body>
</html>