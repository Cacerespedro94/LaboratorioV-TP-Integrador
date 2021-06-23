<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">	
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<title>Alta Cuenta</title>
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
			<b>ALTA DE CUENTA</b>
		</h2>
		
		<div>
			<table align=center>
				<tr>
					<td>Nombre de Usuario</td>
					<td><select class="form-control selectpicker"  data-live-search="true" name="ddlAltaCuentaNombreUsuario" required>
			
						<option data-tokens="" value= ></option>

					</select></td>
				</tr>
				<tr>
					<td>Numero de cuenta</td>
					<td><label name="lblAltaCuentaNroCuenta"></label> <input type="hidden" name="inputAltaCuentaNroCuenta" value=" "> </td>
				</tr>
				<tr>
					<td>Tipo de cuenta</td>
					<td><select name="ddlAltaCuentaTipoCuenta">
							<option value=1>Cuenta Corriente</option>
							<option value=2>Caja de Ahorro</option>
					</select></td>
				</tr>
				<tr>
					<td>CBU</td>
					<td><label name="lblAltaCuentaCBU"> </label> <input type="hidden" name="inputAltaCuentaCBU" value=" "> </td>
				</tr>
				<tr>
					<td>Saldo</td>
					<td><input type=number name="txtAltaCuentaSaldo" required min="10000"/></td>
				</tr>

				<tr>
					<td><input type="submit" value="Crear Cuenta"
						name="btnAltaCuentaCrearCuenta" /></td>
				</tr>
				

			</table>
		</div>
		
		<div align=center style="margin-top: 40px;">
			<label name="lblAltaCuentaMensaje"></label>
		</div>

</body>
</html>