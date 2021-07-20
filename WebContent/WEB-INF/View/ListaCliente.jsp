
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">	
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Clientes</title>

<script type="text/javascript">
	$(document).ready(function() {
		$('#tablaClientes').DataTable();
	});
</script>

</head>
<body>

		<div>
			<h1 align=center style="color: #0049A0;">
				UTN BANK
			</h1>
		</div>
		
		 <!--Navbar-->

    <nav id="mainNavbar" class="navbar navbar-dark navbar-expand-md py-0" style="background: #569EF4">

            <a href="#" class="navbar-brand">UTN Bank</a>

            <button class="navbar-toggler" data-toggle="collapse" data-target="#navLinks" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse justify-content-between blurb" id="navLinks"">
                <ul class="navbar-nav" style="margin-right:700px">
                
                    <li class="nav-item">
                        <a class="nav-link">Inicio</a>
                    </li>            
                    
                    <li class="nav-item dropdown">
                      <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Usuarios
                      </a>
                      <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                        <a class="dropdown-item" >Alta Usuario</a>
                        <a class="dropdown-item" >Listar Usuario</a>
                      </div>
                    </li>
                    
                    <li class="nav-item dropdown">
                      <a class="nav-link dropdown-toggle" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Cuentas
                      </a>
                      <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                        <a class="dropdown-item" >Alta Cuenta</a>
                        <a class="dropdown-item">Listar y Modificar</a>
                      </div>
                    </li>
                    
                    <li class="nav-item">
                        <a class="nav-link">Reportes</a>
                    </li>
                    
                    <li class="nav-item">
                        <a class="nav-link">Perfil</a>
                    </li>
                    
                </ul>
                <ul class="navbar-nav" style="margin-right: 30px">
                    <li class="nav-item align-content-lg-end">
                      <label id="lblNombreUsuario" Style="color: white;margin-right:20px; margin-top:5px;"></label>
                    </li>
                    <li class="nav-item align-content-lg-end">
                      <input class="btn btn-secondary" style="position: center;text-align: center; width:100%" type="submit" value="Cerrar Sesion" name="btnCerrarSesion"/>
                    </li>
                </ul>
            </div>
        </nav>
		
		
		<h2 style="color: #0049A0;" align=center>
			<b>LISTADO DE CLIENTES</b>
		</h2>
<div class="container">

		<div class="row mt-2">
			<div class="col-md-12">
				<h3 class="display-4 text-info">Clientes</h3>

			</div>
		</div>


		<div class="row mt-2 d-flex justify-content-center"
			style="position: relative; top: 50px">
			<div class="col-md-12" style="">

				<div style="height: 50px"></div>
				<table class="table" id="tablaClientes">
					<thead class="table-info">
						<tr>
							<th scope="col">#</th>
							<th scope="col">Nombre</th>
							<th scope="col">DNI</th>
							<th scope="col">Fecha nacimiento</th>
							<th></th>
							<th></th>
							<th></th>
							<th></th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${listaUsuarios}" var="cliente">
							<tr>
								<th scope="row">${cliente.id }</th>
								<td>${cliente.nombre } ${cliente.apellido }</td>
								<td>${cliente.dni }</td>
								<td>${cliente.fechaNacimiento }</td>

								<td style="width: 131px;"><a class="btn btn-primary"
									href="NuevoCuenta.html?id=${cliente.id}">Nueva Cuenta</a></td>

								<td><a class="btn btn-success" 
								    href="verCliente.html?id=${cliente.id}">Ver</a></td>

								<td><a class="btn btn-success" 
								    href="verCuentas.html?id_cliente=${cliente.id}">Ver cuentas</a></td>

								<td><a class="btn btn-info"
									href="modificacionCliente.html?id=${cliente.id}">Modificar</a></td>

								<td><a class="btn btn-danger"
									href="eliminarCliente.html?id=${cliente.id}">Eliminar</a></td>

							</tr>
						</c:forEach>


					</tbody>
				</table>
			</div>

		</div>

	</div>
</body>
</html>